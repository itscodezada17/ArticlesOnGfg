package com.ujjwal.listviewwithcustomadapter

import com.ujjwal.listviewwithcustomadapter.student8
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ujjwal.listviewwithcustomadapter.R
import com.ujjwal.listviewwithcustomadapter.MainActivity.StudentAdapter
import android.widget.BaseAdapter
import android.view.ViewGroup
import android.widget.TextView
import java.util.ArrayList

class student8(var firstName: String, var lastName: String) {

    companion object {
        val random8Student: ArrayList<student8>
            get() {
                val std8 = ArrayList<student8>()
                std8.add(student8("Ujjwal", "Bhardwaj"))
                std8.add(student8("Aman", "kumar"))
                std8.add(student8("Rakesh", "thakur"))
                std8.add(student8("Monu", "Singh"))
                std8.add(student8("Sourav", "Singh"))
                std8.add(student8("Neeraj", "Chaubey"))
                std8.add(student8("Lav", "Singh"))
                return std8
            }
    }
}