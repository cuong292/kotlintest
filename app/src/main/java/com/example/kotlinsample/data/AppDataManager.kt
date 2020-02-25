package com.example.kotlinsample.data

import com.example.kotlinsample.data.dataInterface.ApiHelper
import com.example.kotlinsample.data.dataInterface.DataManager
import com.example.kotlinsample.data.dataInterface.DatabaseHelper
import com.example.kotlinsample.data.dataInterface.PrefHelper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDataManager @Inject constructor(
    private val dbHelper: DatabaseHelper,
    private val apiHelper: ApiHelper,
    private val pref: PrefHelper
) : DataManager {

}