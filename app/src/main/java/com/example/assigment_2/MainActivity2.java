package com.example.assigment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listView=findViewById(R.id.listview2);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}