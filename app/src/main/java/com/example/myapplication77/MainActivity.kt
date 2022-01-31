package com.example.myapplication77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View;
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun sendMessage(view: View){
      val textView = findViewById<TextView>(R.id.text)
      val editText = findViewById<EditText>(R.id.parent)
        Log.d("text1", editText.text.toString())
    }
}