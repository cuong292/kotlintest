package com.example.kotlinsample.data

import android.content.Context
import android.widget.Toast
import com.example.kotlinsample.data.impl.PrefHelper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppPrefHelper @Inject constructor(val context: Context) : PrefHelper {

}