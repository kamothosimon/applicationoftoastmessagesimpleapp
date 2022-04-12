package com.example.clickabuttontoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button1) as Button
     button.setOnClickListener{
         Toast.makeText(this@MainActivity,"welcome and thankYou",Toast.LENGTH_SHORT).show()
     }


    }
}