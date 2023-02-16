package com.example.n210410139_2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var a1: TextView? = null
    var a2: TextView? = null
    var a3: TextView? = null
    var c:Int? = 0
    var s:Int? = 30
    var s1:Int? = 30
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a1=findViewById(R.id.tv1)
        a2=findViewById(R.id.tv2)
        a3=findViewById(R.id.tv3)
        a1!!.setText(getString(R.string.name1))
        a2!!.setOnClickListener(View.OnClickListener {
            if (s!! < 45) s=s!!+1
            a2!!.setTextSize(s!!.toFloat())
        })
        a3!!.setOnClickListener(View.OnClickListener {
            if (s1!! > 20) s1=s1!!-1
            a3!!.setTextSize(s1!!.toFloat())
        })
    }
    fun setcontext(view: View?) {
        if (c == 0) {
            a1!!.text = getString(R.string.name)
            c = 1
        } else {
            c = 0
            a1!!.text = getString(R.string.name1)
        }
    }
}