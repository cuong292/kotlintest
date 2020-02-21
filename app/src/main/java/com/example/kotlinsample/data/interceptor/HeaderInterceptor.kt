package com.example.kotlinsample.data.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor(val headers: MutableMap<String, String>) : Interceptor {

    companion object
    class Builder {
        private val headers: MutableMap<String, String> = mutableMapOf()

        fun create(): HeaderInterceptor {
            return HeaderInterceptor(headers)
        }

        fun add(key: String, value: String): Builder {
            headers.plus(Pair(key, value))
            return this
        }
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val requestBuider = request.newBuilder()
        headers.forEach { header ->
            requestBuider.addHeader(header.key, header.value)
        }
        request = requestBuider.build()
        return chain.proceed(request)
    }

    fun addHeader(key: String, value: String) {
        headers.plus(Pair(key, value))
    }
}