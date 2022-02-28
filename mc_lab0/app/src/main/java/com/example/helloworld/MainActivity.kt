package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

        // Buttons Listeners
        buttonred.setOnClickListener{
            Toast.makeText(this, "Button Red Clicked", Toast.LENGTH_SHORT).show()
            mlayout.setBackgroundColor(Color.RED)
        }
        buttonblue.setOnClickListener{
            Toast.makeText(this, "Button Blue Clicked", Toast.LENGTH_SHORT).show()
            mlayout.setBackgroundColor(Color.BLUE)
        }

        // RadioGroupListener
        radioGroup.setOnCheckedChangeListener { radioGroup, id ->
            val rbtnString = resources.getResourceEntryName(id)
            if (rbtnString == "radioBtnBlue"){
                mlayout.setBackgroundColor(Color.BLUE)
            }
            else {
                mlayout.setBackgroundColor(Color.RED)
            }
        }
    }
}