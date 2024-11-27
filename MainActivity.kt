package com.example.assignment2

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_main)
        val textView: TextView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        button1.setOnClickListener {
            textView.text = "Text has been changed!"
        }

        button2.setOnClickListener {
            textView.layoutParams.height = 300
            textView . requestLayout ()
        }

        button3.setOnClickListener {
            textView.gravity = Gravity.CENTER
        }
    }
}