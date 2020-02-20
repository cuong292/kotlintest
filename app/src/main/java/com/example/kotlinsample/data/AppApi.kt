package com.example.kotlinsample.data

import android.content.Context
import android.widget.Toast
import com.example.kotlinsample.data.impl.ApiImpl
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppApi @Inject constructor(val context: Context) : ApiImpl {

    override fun printMouse() {
        Toast.makeText(context, "this is a mouse", Toast.LENGTH_SHORT).show()
    }
}