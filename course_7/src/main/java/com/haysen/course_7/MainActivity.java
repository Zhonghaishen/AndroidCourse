package com.haysen.course_7;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        popupWindow = new PopupWindow();

//        Button button = findViewById(R.id.btn_show);
//        button.setOnClickListener(this);
        findViewById(R.id.btn_show).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_show:
//                showPopupWindow(view);
                new AlertDialog.Builder(this).setTitle("温馨提示").setMessage("asdsadf").show();
                break;
            case R.id.tv_1:
                Toast.makeText(this,"我是选项一",Toast.LENGTH_LONG).show();
                popupWindow.dismiss();
                break;
            case R.id.tv_2:
                Toast.makeText(this,"我是选项二",Toast.LENGTH_LONG).show();
                popupWindow.dismiss();
                break;
            case R.id.tv_3:
                Toast.makeText(this,"我是选项三",Toast.LENGTH_LONG).show();
                popupWindow.dismiss();
                break;
                default:
                    break;
        }



    }

    private void showPopupWindow(View view){

        View contentView = getLayoutInflater().inflate(R.layout.layout_content_view, null);
        popupWindow.setContentView(contentView);
//        popupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        popupWindow.setWidth(dp2px(80));
        popupWindow.setHeight(dp2px(145));
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
//        popupWindow.showAsDropDown(view);
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
    }


    public int dp2px(float dp){
        final float scale = getResources().getDisplayMetrics().density;
        return (int)(dp*scale + 0.5f);
    }

    public int px2pd(float px){
        final float scale = getResources().getDisplayMetrics().density;
        return (int)(px/scale + 0.5f);
    }

}
