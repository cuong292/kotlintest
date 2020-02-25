package com.example.kotlinsample.data

import android.content.Context
import com.example.kotlinsample.base.PrefName
import com.example.kotlinsample.data.dataInterface.PrefHelper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppPrefHelper @Inject constructor(val context: Context, @PrefName val pref: String) :
    PrefHelper {

}