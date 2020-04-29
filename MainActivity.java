package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
 EditText e1,e2;
 RadioButton r1,r2,r3;
 RadioGroup rg;
 int a,b,c;
 TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.ed1);
        e2=findViewById(R.id.ed2);
        r1=findViewById(R.id.radioButton5);
        r2=findViewById(R.id.radioButton6);
        r3=findViewById(R.id.radioButton7);
        rg=findViewById(R.id.radioGroup);
        tv=findViewById(R.id.textView);


      rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(RadioGroup group, int checkedId) {
              a=Integer.parseInt(e1.getText().toString());
              b=Integer.parseInt(e2.getText().toString());
              if(r1.isChecked()){
                  c=a+b;
                  tv.setText(Integer.toString(c));
              }
              if(r2.isChecked()){
                  c=a-b;
                  tv.setText(Integer.toString(c));
              }
              if(r3.isChecked()){
                  c=a*b;
                  tv.setText(Integer.toString(c));
              }
          }
      });












    }

    }




