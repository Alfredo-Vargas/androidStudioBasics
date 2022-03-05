package com.example.intentions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        val buttonOption: Button = findViewById(R.id.btnSendToMain)
        var optionSelected = false
        val intent3 = Intent(this, MainActivity::class.java)

        radioGroup.setOnCheckedChangeListener{ radioGroup, _ ->
            val radioButtonId = radioGroup.getCheckedRadioButtonId()
            val radioButton: RadioButton = findViewById(radioButtonId)
            intent3.putExtra("selectedOption", radioButton.text.toString())
            optionSelected = true
        }

        buttonOption.setOnClickListener{
            if (optionSelected){
                startActivity(intent3)
            }
        }
    }
}