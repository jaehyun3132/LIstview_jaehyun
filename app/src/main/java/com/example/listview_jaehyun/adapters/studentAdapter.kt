package com.example.listview_jaehyun.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listview_jaehyun.dates.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId , mList) {
}