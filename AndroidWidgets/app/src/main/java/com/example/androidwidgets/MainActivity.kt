package com.example.androidwidgets

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter.LengthFilter
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.setBackgroundColor(getColor(R.color.teal_200));

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this, "checkBox is $isChecked", Toast.LENGTH_SHORT).show()
        }
        checkBox2.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this, "checkBox is $isChecked", Toast.LENGTH_SHORT).show()
        }
        radioGroup.setOnCheckedChangeListener { group, isChekd ->
            when (isChekd) {
                R.id.radioButton -> {
                    Toast.makeText(this, "radioButton1 is checked", Toast.LENGTH_SHORT).show()
                }
                R.id.radioButton2 -> {
                    Toast.makeText(this, "radioButton2 is checked", Toast.LENGTH_SHORT).show()
                }


            }

        }
        switch2.setOnCheckedChangeListener { switch, isswitched ->
            Toast.makeText(this, "switch is $isswitched", Toast.LENGTH_SHORT).show()
        }

        floatingActionButton2.setOnClickListener {
            Toast.makeText(this, "fab is clicked", Toast.LENGTH_SHORT).show()


        }
    }
}