package com.example.app3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webIntent: Intent = Uri.parse("https://www.android.com").let { webpage ->
            Intent(Intent.ACTION_VIEW, webpage)
        }

        var webUrl: TextView = findViewById(R.id.webURL)
        val stringUrl: String = webIntent.getData().toString()
        webUrl.text = stringUrl
        startActivity(webIntent)
    }
}