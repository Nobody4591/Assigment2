package com.example.assigment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void HalqiyahMethod(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("btn","halqiyah");
        startActivity(intent);
    }

    public void NiteeyahMethod(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("btn","niteeyah");
        startActivity(intent);
    }

    public void gunnahMethod(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("btn","gunnah");
        startActivity(intent);
    }

    public void LisaveyahMethod(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("btn","lisaveyah");
        startActivity(intent);
    }

    public void ShajariyahMethod(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("btn","shajariyah");
        startActivity(intent);
    }

    public void TarfiyahMethod(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("btn","tarfiyah");
        startActivity(intent);
    }

    public void LahatiyahMethod(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("btn","lahatiyah");
        startActivity(intent);
    }
}