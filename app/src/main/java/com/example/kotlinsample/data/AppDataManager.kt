package com.example.kotlinsample.data

import com.example.kotlinsample.data.dataInterface.ApiHelper
import com.example.kotlinsample.data.dataInterface.DataManager
import com.example.kotlinsample.data.dataInterface.DatabaseHelper
import com.example.kotlinsample.data.dataInterface.PrefHelper
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import retrofit2.Call
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDataManager @Inject constructor(
    private val dbHelper: DatabaseHelper,
    private val apiHelper: ApiHelper,
    private val pref: PrefHelper
) : DataManager {
    override fun getData(): Call<JsonElement> {
        return apiHelper.getData()
    }

}