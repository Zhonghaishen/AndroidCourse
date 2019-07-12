package com.haysen.course_3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = getResources().getString(R.string.a);
        int color = getColor(R.color.blue);
        System.out.println(color);

        Color.parseColor("#ffffff");

        int color1 = ContextCompat.getColor(this, R.color.colorAccent);

        TextView textView = new TextView(this);
        textView.setBackgroundResource(R.drawable.textview_shape);

        LinearLayout linearLayout = findViewById(R.id.ll_container);
        linearLayout.addView(textView);
    }
}