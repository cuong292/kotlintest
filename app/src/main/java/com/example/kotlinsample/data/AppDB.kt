package com.example.kotlinsample.data

import android.content.Context
import android.widget.Toast
import com.example.kotlinsample.data.impl.DbImpl
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDB @Inject constructor(val context: Context) : DbImpl {
    override fun printCat() {
        Toast.makeText(context, "this is a cat", Toast.LENGTH_SHORT).show()
    }
}