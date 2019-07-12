package com.haysen.course_5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.drm.ProcessedData;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.bt_main);
        button.setOnClickListener(this);
        registerForContextMenu(button);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
//        menu.setHeaderIcon();
        menu.setHeaderTitle("菜单");
        menu.add("菜单1");
        menu.add("菜单2");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_1:
                Toast.makeText(this, "123", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_2:
                Toast.makeText(this, "456", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
//        new AlertDialog.Builder(this).setTitle("温馨提示：").setMessage("我是弹窗")
//                .setPositiveButton("确定", null).setNegativeButton("取消", null).show();
//
//        ProgressDialog progressDialog = new ProgressDialog(this);
//        progressDialog.setTitle("加载中");
//        progressDialog.setMessage("加载中...");
//        progressDialog.setCanceledOnTouchOutside(false);
//        progressDialog.show();
        View view1 = getLayoutInflater().inflate(R.layout.layout_progress, null);
        TextView textView = view1.findViewById(R.id.tv_pg);
        textView.setText("加载中");
        AlertDialog alertDialog = new AlertDialog.Builder(this).setView(view1).show();

    }
}