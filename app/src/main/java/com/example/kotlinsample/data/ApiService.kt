package com.example.kotlinsample.data

import HttpLoggingInterceptor
import com.example.kotlinsample.BuildConfig
import com.example.kotlinsample.data.interceptor.HeaderInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

class ApiService {
    companion object {
        // OkHttp client
        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))

        // header interceptor
        val header: HeaderInterceptor = HeaderInterceptor.Builder()
            .add("Device-Type", 0.toString())
            .create()

        lateinit var mRetrofit: Retrofit
    }

    fun add(token: String) {

    }

    fun getApiService(): Retrofit {
        mRetrofit = Retrofit.Builder()
            .client(
                okHttpClient.build()
            )
            .baseUrl(BuildConfig.BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
        return mRetrofit
    }
}