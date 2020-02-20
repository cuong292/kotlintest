package com.example.kotlinsample.data

import com.example.kotlinsample.data.impl.ApiImpl
import com.example.kotlinsample.data.impl.DbImpl
import com.example.kotlinsample.data.impl.PreferenceImpl

interface DataManager : ApiImpl, DbImpl, PreferenceImpl {
}