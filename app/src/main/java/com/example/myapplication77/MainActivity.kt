package com.example.myapplication77

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View;
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text)


        val editText_1 = findViewById<EditText>(R.id.editTextTextPersonName1)
        val editText_2 = findViewById<EditText>(R.id.editTextTextPersonName2)

        val button = findViewById<AppCompatButton>(R.id.button)

        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                //Your code here
                val value_1 = editText_1.text.toString()
                val value_2 = editText_2.text.toString()
         //       textView.setText(value_1 + value_2)
            }
        })


    }

}