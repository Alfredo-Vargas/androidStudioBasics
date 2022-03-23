package com.example.memoryschest

// Two dependencies were added from File >> Project Structure >> Dependencies >> + Button
// (1) recyclerview and (2) cardview

// Colors to be used (www.coolors.co)
// (1) Champagne: #F4E2C8
// (2) Liver Chestnut: #99765F
// (3) Blue Yonder: #5D74BC

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
