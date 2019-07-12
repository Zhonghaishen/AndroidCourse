package com.haysen.course_4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    //    private int time = 3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        button = findViewById(R.id.bt_tologin);

        button.setOnClickListener(this);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0; i < time; i++){
//                    try{
//                        Thread.sleep(1000);
//                        time--;
//                        if(time == 0){
//
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }
//        });
//
//        CountDownTimer countDownTimer= new CountDownTimer(3000, 1000){
//
//            @Override
//            public void onTick(long l) {
//
//            }
//
//            @Override
//            public void onFinish() {
//
//            }
//        };
//
//
//        new Handler().postDelayed(
//                new Runnable() {
//                    @Override
//                    public void run() {
//
//                    }
//                }
//
//        ,3000);
//
//        button = findViewById(R.id.bt_tologin);
//        button.setOnClickListener(this);
//
//        finish();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_tologin:
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivityForResult(intent, 200);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == RESULT_OK) {
            TextView textView = findViewById(R.id.tv_result);
            textView.setText("账号：" + data.getStringExtra("name") + " 密码：" + data.getStringExtra("pwd"));
            Button button = findViewById(R.id.bt_tologin);
            button.setVisibility(View.GONE);
        }
    }
}