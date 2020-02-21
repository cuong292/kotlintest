package com.example.kotlinsample

import com.example.kotlinsample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<App> =
        DaggerAppComponent.factory().create(this)

    override fun onCreate() {
        super.onCreate()
    }
}