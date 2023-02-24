package com.example.fragments1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_user.*
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_user.view.*


class user : Fragment() {

    val users = arrayOf("ujjwal","raman","neeraj","abhinav",
        "monu","sourav","umesh","lav","abc","def","ujjwal","raman","neeraj","abhinav",
        "monu","sourav","umesh","lav","abc","def")


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val userView = inflater.inflate(R.layout.fragment_user, container, false)

        userView.lv_user.adapter = context?.let {
            ArrayAdapter<String>(
                it,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                users
            )
        }
        return userView
    }


}