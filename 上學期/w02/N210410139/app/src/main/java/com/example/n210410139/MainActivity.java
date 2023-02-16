package com.example.n210410139;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView a1, a2, a3; int c=0, s=30, s1=30;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1=(TextView) findViewById(R.id.tv1);
        a2=(TextView) findViewById(R.id.tv2);
        a3=(TextView) findViewById(R.id.tv3);
        a1.setText(getString(R.string.name1));
        a2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                if (s < 45 ) s++; a2.setTextSize(s);
            }
        });
        a3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                if (s1 > 20 ) s1--; a3.setTextSize(s1);
            }
        });
    }
    public void setcontext(View view) {
        if (c == 0) {a1.setText(getString(R.string.name)); c=1;}
        else {c=0; a1.setText(getString(R.string.name1));}

    }
}