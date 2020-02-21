package com.example.kotlinsample.data

import com.example.kotlinsample.data.impl.ApiHelper
import com.example.kotlinsample.data.impl.DataManager
import com.example.kotlinsample.data.impl.DatabaseHelper
import com.example.kotlinsample.data.impl.PrefHelper
import javax.inject.Inject

class AppDataManager @Inject constructor(
    private val dbHelper: DatabaseHelper,
    private val apiHelper: ApiHelper,
    private val pref: PrefHelper
) : DataManager {

}