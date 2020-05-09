package com.example.kotlinsample.data

import com.google.gson.JsonElement
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface Services {
    @GET
    fun getData(@Url url: String): Call<JsonElement>
}