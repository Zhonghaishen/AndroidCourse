package com.haysen.course_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.et_name);
        editText2 = findViewById(R.id.et_password);

        findViewById(R.id.bt_login).setOnClickListener(this);
//        Intent intent = new Intent();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:

//                Intent intent = new Intent(this, MainActivity.class);
                Intent intent = new Intent();
                intent.putExtra("name", editText1.getText().toString());
                intent.putExtra("pwd", editText2.getText().toString());
                setResult(RESULT_OK, intent);
//                startActivity(intent);
                break;

        }
        finish();
    }
}
