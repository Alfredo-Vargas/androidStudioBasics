package com.example.intentions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMain: Button = findViewById(R.id.btn_main)
        val textTyped: TextInputEditText = findViewById(R.id.input_main)

        buttonMain.setOnClickListener{
           if(textTyped.toString().trim().isNotEmpty()){
               // creation of the intent
               val intent1 = Intent(this, SecondActivity::class.java)
               intent1.putExtra("textIntent", textTyped.text.toString())
               startActivity(intent1)
           }
        }
    }
}