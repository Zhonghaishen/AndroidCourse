package com.haysen.course_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

//        ArrayList<String> datas = new ArrayList<String>();

//        for (int i = 0; i < 20; i++) {
//            datas.add("第" + i + "项");
//        }
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datas);
//        listView.setAdapter(adapter);

        ArrayList<HashMap<String, Object>> datas = new ArrayList<>();
        HashMap<String, Object> map = new HashMap<>();
        map.put("icon", R.mipmap.ic_launcher);
        map.put("content", "aaaaaa");
        datas.add(map);
        map.put("icon", R.mipmap.ic_launcher);
        map.put("content", "bbbcbbb");
        datas.add(map);
        map.put("icon", R.mipmap.ic_launcher);
        map.put("content", "cccccvc");
        datas.add(map);

//        new SimpleAdapter(this, datas, R.layout.layout_simple_item_1, new String[]{"icon", "content"},
//                new int[]{R.id.iv_icon, R.id.iv_content});
//        listView.setAdapter(SimpleAdapter);
    }
}
