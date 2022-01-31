package com.example.myapplication77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View;
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text)


        val editText_1 = findViewById<EditText>(R.id.editTextTextPersonName1)
        val editText_2 = findViewById<EditText>(R.id.editTextTextPersonName2)

        /*
        val button = findViewById<AppCompatButton>(R.id.parent)
        button.setOnClickListener {
             Log.d("text1",editText_1.text.toString())
             Log.d("text2",editText_2.text.toString())
        }
         */
    }
   // https://stackoverflow.com/questions/19181362/stash-the-value-of-edittext-into-an-variable-and-print-it-into-logcat
}