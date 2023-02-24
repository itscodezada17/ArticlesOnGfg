package com.example.intents

import android.app.Notification.Action
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


const val KEY_1 = "NAME"
const val KEY_2 = "AGE"
const val KEY_3 = "isStudent"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(View.OnClickListener {
            val i = Intent(this,MainActivity2::class.java)
            i.putExtra(KEY_1,"Ujjwal Bhardwaj")
            i.putExtra(KEY_2,23)
            i.putExtra(KEY_3,true)
            startActivity(i)
        })

        emailbtn.setOnClickListener(View.OnClickListener {
            val email = editText.text.toString()
            val ii=Intent()
            ii.action = Intent.ACTION_SENDTO
            ii.data = Uri.parse("mailto:$email")
            ii.putExtra(Intent.EXTRA_SUBJECT,"Implicit Intents Tutorial")
            startActivity(ii)
        })
        browsebtn.setOnClickListener(View.OnClickListener {
            val url = editText.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_VIEW
            i.data = Uri.parse("http://$url")
            startActivity(i)
        })

        callbtn.setOnClickListener(View.OnClickListener {
            val num=editText.text.toString()
            val i = Intent()
            i.action=Intent.ACTION_DIAL
            i.data= Uri.parse("tel:$num")
            startActivity(i)
        })

    }
}