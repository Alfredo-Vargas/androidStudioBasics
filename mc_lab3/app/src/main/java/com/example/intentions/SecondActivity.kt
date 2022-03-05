package com.example.intentions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textSecondActivity: TextView = findViewById(R.id.textview2a)
        val textFromMain: String? = intent.getStringExtra("textIntent")
        textSecondActivity.text = textFromMain
    }
}