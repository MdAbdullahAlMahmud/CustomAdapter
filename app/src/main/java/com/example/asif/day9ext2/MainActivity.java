package com.example.asif.day9ext2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.asif.day9ext2.Adapter.CustomAdapter;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] value;
    int[] img = {R.drawable.microsoftlogo,R.drawable.applelogo,R.drawable.facebooklogo,R.drawable.alibabap,R.drawable.amazon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        value = getResources().getStringArray(R.array.company);


        CustomAdapter adapter = new CustomAdapter(this,value,img);
        lv.setAdapter(adapter);


    }
}
