package com.haysen.course_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar pb = findViewById(R.id.pb_progress);

        for (int i = 0; i < 100; i++) {

        }
        SeekBar sb = findViewById(R.id.sb_seekbar);

        String[] stringArray = this.getResources().getStringArray(R.array.Language);
        for(String s:stringArray){
            Log.i("Language", s);
        }
    }
}
