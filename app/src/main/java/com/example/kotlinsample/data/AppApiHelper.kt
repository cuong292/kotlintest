package com.example.kotlinsample.data

import android.content.Context
import com.example.kotlinsample.data.dataInterface.ApiHelper
import com.google.gson.JsonElement
import retrofit2.Call
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppApiHelper @Inject constructor(val context: Context) : ApiHelper {

    override fun getData(): Call<JsonElement> {
        return ApiService.getApiService().getData("https://reqres.in/api/users?page=2")
    }

}