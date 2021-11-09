package com.example.assigment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        type = getIntent().getStringExtra("btn");
        Button btn = (Button)findViewById(R.id.button3);
        btn.setText("Temp");
    }
}