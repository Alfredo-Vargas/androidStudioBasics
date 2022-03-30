package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Change BackgroundColor using buttons
        val buttonblue: Button = findViewById(R.id.btn_blue)
        val buttonred: Button = findViewById(R.id.btn_red)
        val mlayout: ConstraintLayout = findViewById(R.id.main_layout)
        val radioGroup: RadioGroup = findViewById(R.id.radio_grp)

        buttonred.setOnClickListener{
            mlayout.setBackgroundColor(Color.RED)
        }
        buttonblue.setOnClickListener{
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

        val spinnerlanguages: Spinner = findViewById(R.id.spLanguages)
        var selectedlang: TextView = findViewById(R.id.selectedLanguage)

        // Dropdowm Menu and TextView Display selected Item
        spinnerlanguages.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {  // object is anonymous class!
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                selectedlang.setText(spinnerlanguages.getSelectedItem().toString())
            }

            // No need because we have always something selected (we leave this blank)
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        // TextWatcher
        var mutabletext: TextView = findViewById(R.id.textMutable)
        var edittextfield: EditText = findViewById(R.id.editText)

        edittextfield.addTextChangedListener(object : TextWatcher {
            // No need to do action before text changes
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                mutabletext.setText(edittextfield.editableText)
            }

            // No need to do actions after text changes
            override fun afterTextChanged(p0: Editable?) {
            }
        })
    }
}

