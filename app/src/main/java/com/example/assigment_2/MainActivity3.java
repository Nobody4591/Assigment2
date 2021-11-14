package com.example.assigment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    String type;
    String[] halqiyah;
    String[] lahiyah;
    String[] shajriyah;
    String[] tarfiyah;
    String[] niyat;
    String[] lasawiyah;
    String[] gunnah;
    String answer;

    public MainActivity3(){
        halqiyah= new String[6];


        halqiyah[0]="إ";
        halqiyah[1]="ۃ";
        halqiyah[2]="ح";
        halqiyah[3]="ع";
        halqiyah[4]="غ";
        halqiyah[5]="خ";

        lahiyah= new String[3];

        lahiyah[0]="ک";
        lahiyah[1]="ق";

        shajriyah= new String[4];

        shajriyah[0]="ج";
        shajriyah[1]="ش";
        shajriyah[2]="ی";
        shajriyah[3]="ض";

        tarfiyah= new String[3];

        tarfiyah[0]=("ل");
        tarfiyah[1]=("ن");
        tarfiyah[2]=("ر");

        niyat= new String[3];

        niyat[0]="ت";
        niyat[1]="د";
        niyat[2]="ط";

        lasawiyah= new String[3];
        lasawiyah[0]="ظ";
        lasawiyah[1]="ذ";
        lasawiyah[2]="ث";

        gunnah= new String[2];

        gunnah[0]="م";
        gunnah[1]="ن";

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
    public String ansString;
    public void practiceHalqia(){
        TextView textView = findViewById(R.id.textView);
        textView.setText("Which one of the following of is the "+type);


        RadioButton radioButton1 = findViewById(R.id.radioButton1);
        radioButton1.setText("إ");


        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        radioButton2.setText("ل");

        RadioButton radioButton3 = findViewById(R.id.radioButton3);
        radioButton3.setText("د");

        RadioButton radioButton4 = findViewById(R.id.radioButton4);
        radioButton4.setText("ن");



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

    public void submitMethod(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio);
        int selectedId = radioGroup.getCheckedRadioButtonId();

        RadioButton radioButton = (RadioButton) findViewById(selectedId);


        Toast.makeText(MainActivity3.this,radioButton.getText(),Toast.LENGTH_SHORT).show();

    }

    public void nextButton(View view) {

    }
}