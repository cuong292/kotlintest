package com.example.kotlinsample.data

import android.content.Context
import android.widget.Toast
import com.example.kotlinsample.data.impl.PreferenceImpl
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppPreference @Inject constructor(val context: Context) : PreferenceImpl {

    override fun printDog() {
        Toast.makeText(context, "this is a dog", Toast.LENGTH_SHORT).show()
    }
}