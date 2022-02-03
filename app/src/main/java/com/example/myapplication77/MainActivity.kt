package com.example.myapplication77

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View;
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText_1 = findViewById<EditText>(R.id.editTextTextPersonName1)
        val editText_2 = findViewById<EditText>(R.id.editTextTextPersonName2)
        val textView = findViewById<TextView>(R.id.textView3)//сделать проверку на null, если да - достать из сохранённого состояния

        val button = findViewById<AppCompatButton>(R.id.button)

        val savedState = savedInstanceState?.get("textView")// а теперь достанем его

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val value_1 = editText_1.text.toString()
                val value_2 = editText_2.text.toString()
                          textView.setText(value_1 + " " +value_2)
                Log.d("result", "$value_1 $value_2")

                val toast = Toast.makeText(applicationContext, value_1 + value_2, Toast.LENGTH_SHORT)
                toast.show()

            }
        })

    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("textView", R.id.textView3.toString())//сюда положить результат работы приложения, он в textView3
    }

}