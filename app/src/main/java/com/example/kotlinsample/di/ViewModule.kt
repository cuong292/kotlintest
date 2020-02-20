package com.example.kotlinsample.di

import com.example.kotlinsample.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ViewModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}