package com.ujjwal.listviewwithcustomadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.BaseAdapter
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var students: ArrayList<student8> = student8.random8Student
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val studentAdapter = StudentAdapter()
        lvItem.setAdapter(studentAdapter)

    }

    internal inner class StudentAdapter : BaseAdapter() {
        override fun getCount(): Int {
            return students.size
        }

        override fun getItem(i: Int): student8 {
            return students[i]
        }

        override fun getItemId(i: Int): Long {
            return i.toLong()
        }

        override fun getView(i: Int, view: View, viewGroup: ViewGroup): View {
            val itemView = layoutInflater.inflate(
                R.layout.list_view,
                viewGroup,
                false
            )
            val tvFirstName = itemView.findViewById<TextView>(R.id.textView)
            val tvLastName = itemView.findViewById<TextView>(R.id.textView2)
            tvFirstName.text = getItem(i).firstName
            tvLastName.text = getItem(i).lastName
            return view
        }
    }
}