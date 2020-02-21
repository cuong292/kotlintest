package com.example.kotlinsample.data

import android.content.Context
import android.widget.Toast
import com.example.kotlinsample.data.impl.ApiHelper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppApiHelper @Inject constructor(val context: Context) : ApiHelper {

}