package com.example.fragments1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_baranch.view.*
import kotlinx.android.synthetic.main.fragment_user.view.*


class baranch : Fragment() {

    val branch = arrayOf("cse","civil","IT","EE","ECE","cse","civil",
        "IT","EE","ECE","cse","civil","IT","EE","ECE")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val branchView = inflater.inflate(R.layout.fragment_baranch, container, false)

        branchView.lv_branch.adapter = context?.let {
            ArrayAdapter<String>(
                it,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                branch
            )
        }

        return branchView
    }

}