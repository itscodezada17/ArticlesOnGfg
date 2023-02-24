package com.ujjwal.ontimechangedlistenergfg

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        simpleTimePicker.setIs24HourView(true)

        // perform set on time changed listener event
        simpleTimePicker.setOnTimeChangedListener { view, hourOfDay, minute ->
            //make a toast that time is changed
            Toast.makeText(this,"Time changed",Toast.LENGTH_SHORT).show()

            time.text = "Time is :: $hourOfDay : $minute" // set the current time in text view
        }

        // for changing the background color of title bar
        val aBar = supportActionBar
        val cd = ColorDrawable(Color.parseColor("#FF00FF00"))
        aBar?.setBackgroundDrawable(cd)

    }
}



