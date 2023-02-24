package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name1 = intent.getStringExtra(KEY_1)
        val age = intent.getIntExtra(KEY_2.toString(),0)
        val isStudent = intent.getBooleanExtra(KEY_3.toString(),false)
        textView.text="$name1 $age $isStudent"

        button2.setOnClickListener(View.OnClickListener {
            val i = Intent(this,MainActivity::class.java)

            startActivity(i)
        })
    }
}