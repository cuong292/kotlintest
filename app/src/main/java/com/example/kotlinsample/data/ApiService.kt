package com.example.kotlinsample.data

import HttpLoggingInterceptor
import com.example.kotlinsample.data.interceptor.HeaderInterceptor
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiService {
    companion object {
        private val gson = GsonBuilder()
            .create()

        // OkHttp client
        private val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))

        // header interceptor
        val header: HeaderInterceptor = HeaderInterceptor.Builder()
            .add("Device-Type", 0.toString())
            .create()

        lateinit var mRetrofit: Retrofit

        fun init(): Retrofit {
            if (this::mRetrofit.isInitialized) {
                return mRetrofit;
            }
            mRetrofit = Retrofit.Builder()
                .client(
                    okHttpClient.build()
                )
                .baseUrl("https://whoops.ko.edu.vn/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
            return mRetrofit
        }

        fun getApiService(): Services {
            init()
            return mRetrofit.create(Services::class.java)
        }

        fun add(token: String) {

        }
    }

}