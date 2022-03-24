package com.example.memoryschest

// Two dependencies were added from File >> Project Structure >> Dependencies >> + Button
// (1) recyclerview and (2) cardview

// Colors to be used (www.coolors.co)
// (1) Champagne: #F4E2C8
// (2) Liver Chestnut: #99765F
// (3) Blue Yonder: #5D74BC
// (4) Gris: #5a5a5a
// Second theme
// #191919
// #2D4263
// #C84B31
// #ECDBBA
// Third theme
// #B5EAEA
// #EDF6E5
// #FFBCBC
// #F38BA0
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
