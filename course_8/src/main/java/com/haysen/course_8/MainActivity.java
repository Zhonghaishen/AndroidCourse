package com.haysen.course_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.net.MalformedURLException;
import java.net.URL;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String imageUrl = "";
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        findViewById(R.id.btn_download).setOnClickListener(this);
        findViewById(R.id.btn_show).setOnClickListener(this);

    }

    public void doDownload(){
        try{
            URL url = new URL(imageUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {

    }
}

