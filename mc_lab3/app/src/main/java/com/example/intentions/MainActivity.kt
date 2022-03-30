package com.example.intentions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMain: Button = findViewById(R.id.btn_main)
        val buttonThird: Button = findViewById(R.id.btnThird)
        val textTyped: TextInputEditText = findViewById(R.id.input_main)

        buttonMain.setOnClickListener {
            if (textTyped.toString().trim().isNotEmpty()) {
                // creation of the intent
                val intent1 = Intent(this, SecondActivity::class.java)
                intent1.putExtra("textIntent", textTyped.text.toString())
                startActivity(intent1)
            }
        }

        buttonThird.setOnClickListener {
            val intent2 = Intent(this, ThirdActivity::class.java)
            startActivity(intent2)
        }

        val displayOption: TextView = findViewById(R.id.textViewMain)
        val optionFromThirdActivity: String? = intent.getStringExtra("selectedOption")
        displayOption.text = optionFromThirdActivity

    }
}

