package com.example.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val school by inject<School>()
    val friend by inject<Friend>()

    val viewModel by inject<MainViewModel>()

    val student by inject<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var show = school.study()
        var show2 = friend.hangout()
        var a = 5


        doSomething()
    }

    private fun doSomething() {
        // we put Friend class into s through viewmodel
        var s = viewModel.friend
        var s1= s.hangout()

        // we put school class into n through viewmodel
        var n = viewModel.school
        var n1 = n.study();

        var f = viewModel.performance()



        var j = student.friend
        var j1 = j.hangout()


        var l = student.school
        var l1 = l.study()


        var k = student.beSmart()



        var g = 5
    }
}