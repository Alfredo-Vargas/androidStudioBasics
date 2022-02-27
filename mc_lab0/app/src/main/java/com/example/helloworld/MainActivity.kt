package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to buttons, radio buttons and layout
        val buttonblue: Button = findViewById(R.id.btn_blue)
        val buttonred: Button = findViewById(R.id.btn_red)
        val mlayout: ConstraintLayout = findViewById(R.id.main_layout)
        val radioGroup: RadioGroup = findViewById(R.id.radio_grp)

        buttonred.setOnClickListener{
            Toast.makeText(this, "Button Red Clicked", Toast.LENGTH_SHORT).show()
            mlayout.setBackgroundColor(Color.RED)
        }

        buttonblue.setOnClickListener{
            Toast.makeText(this, "Button Blue Clicked", Toast.LENGTH_SHORT).show()
            mlayout.setBackgroundColor(Color.BLUE)
        }
        radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            var rb :RadioButton = findViewById<RadioButton>(i)
            if(rb!=null) {
                if (radioGroup.checkedRadioButtonId.toString() == "radioBtnBlue")
                    mlayout.setBackgroundColor(Color.BLUE)
                else {
                    mlayout.setBackgroundColor(Color.RED)
                }
            }
        }

        val radioblue: RadioButton = findViewById(R.id.radioBtnBlue)
        val radiored: RadioButton = findViewById(R.id.radioBtnRed)
    }
}