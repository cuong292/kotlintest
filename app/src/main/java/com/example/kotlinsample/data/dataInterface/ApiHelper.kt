package com.example.kotlinsample.data.dataInterface

import com.google.gson.JsonElement
import retrofit2.Call

interface ApiHelper {
    fun getData(): Call<JsonElement>
}