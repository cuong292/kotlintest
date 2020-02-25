package com.example.kotlinsample.data

import android.content.Context
import com.example.kotlinsample.base.DatabaseName
import com.example.kotlinsample.data.dataInterface.DatabaseHelper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDBHelper @Inject constructor(val context: Context, @DatabaseName val dbName: String) :
    DatabaseHelper {
}