package com.example.kotlinsample.data

import android.content.Context
import android.widget.Toast
import com.example.kotlinsample.data.impl.DatabaseHelper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDBHelper @Inject constructor(val context: Context) : DatabaseHelper {
}