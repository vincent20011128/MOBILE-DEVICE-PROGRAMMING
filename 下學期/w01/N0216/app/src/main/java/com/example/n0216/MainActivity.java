package com.example.n0216;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner s1,s2; TextView rr; Button b1;
    String dr[]={"珍珠奶茶", "波霸奶茶","仙草奶茶","檸檬汁"};
    String ice[]={"冰","去冰"}.wm[]={"冰","去冰","溫"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1); s1=(Spinner) findViewById(R.id.sp1);
        s2=(Spinner)findViewById(R.id.sp2); rr=(TextView) findViewById(R.id.res);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dr);
        s1.setAdapter(ad); s1.setOnItemSelectedListener(this);
    }
    public void onClick(View view)
}