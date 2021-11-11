package com.example.assigment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    String type;
    ArrayList<ArrayList<String>> table;
    String answer;

    public MainActivity3(){
        table = new ArrayList<ArrayList<String>>();
        for(int i=0;i<7;i++)
        {
            table.add(new ArrayList<String>());
        }
        table.get(0).add("حلقیہ");
        table.get(0).add("إ");
        table.get(0).add("ۃ");
        table.get(0).add("ح");
        table.get(0).add("ع");
        table.get(0).add("غ");
        table.get(0).add("خ");

        table.get(1).add("لاہاتیہ");
        table.get(1).add("ک");
        table.get(1).add("ق");

        table.get(2).add("شجریہ حافیہ");
        table.get(2).add("ج");
        table.get(2).add("ش");
        table.get(2).add("ی");
        table.get(2).add("ض");

        table.get(3).add("ترفیہ");
        table.get(3).add("ل");
        table.get(3).add("ن");
        table.get(3).add("ر");

        table.get(4).add("نیت اییہ");
        table.get(4).add("ت");
        table.get(4).add("د");
        table.get(4).add("ط");

        table.get(5).add("لیساویہ");
        table.get(5).add("ظ");
        table.get(5).add("ذ");
        table.get(5).add("ث");

        table.get(6).add("گناں");
        table.get(6).add("م");
        table.get(6).add("ن");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        type = getIntent().getStringExtra("btn");

        if(type.equals("halqiyah")){
            practiceHalqia();
        }
        else if(type=="niteeyah"){
            practiceNiteeyah();
        }
        else if(type=="gunnah"){
            practiceGunnah();
        }
        else if(type=="lisaveyah"){
            practiceLisaveyah();
        }
        else if(type=="shajariyah"){
            practiceShajariyah();
        }
        else if(type=="tarfiyah"){
            practiceTarfiyah();
        }
        else{
            practiceLahatiyah();
        }
    }
    public void practiceHalqia(){
        TextView textView = findViewById(R.id.textView);
        textView.setText("Which one of the following of is the "+type);


    }
    public void practiceNiteeyah(){

    }
    public void practiceGunnah(){

    }
    public void practiceLisaveyah(){

    }
    public void practiceShajariyah(){

    }
    public void practiceTarfiyah(){

    }
    public void practiceLahatiyah(){

    }
}