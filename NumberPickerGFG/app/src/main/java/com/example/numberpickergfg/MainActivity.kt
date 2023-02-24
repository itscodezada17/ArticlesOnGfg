package com.example.numberpickergfg

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // for setting the max and min value of number picker
        picker1.maxValue=50
        picker1.minValue=1

        // for changing the background color of title bar
        val aBar = supportActionBar
        val cd = ColorDrawable(Color.parseColor("#FF00FF00"))
        aBar?.setBackgroundDrawable(cd)

    }
}