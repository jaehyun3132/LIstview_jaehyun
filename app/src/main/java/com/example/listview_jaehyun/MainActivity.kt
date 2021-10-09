package com.example.listview_jaehyun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview_jaehyun.dates.Student

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("이재현",1997) )
        mStudentList.add( Student("이창근",1996) )
        mStudentList.add( Student("윤동근",1998) )
        mStudentList.add( Student("이상렬",1995) )
        mStudentList.add( Student("조성범",1995) )
        mStudentList.add( Student("박동규",1996) )
        mStudentList.add( Student("이하이",1996) )
    }
}