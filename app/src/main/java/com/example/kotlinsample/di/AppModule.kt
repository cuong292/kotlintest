package com.example.kotlinsample.di

import android.content.Context
import com.example.kotlinsample.App
import com.example.kotlinsample.data.*
import com.example.kotlinsample.data.impl.ApiHelper
import com.example.kotlinsample.data.impl.DataManager
import com.example.kotlinsample.data.impl.DatabaseHelper
import com.example.kotlinsample.data.impl.PrefHelper
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ViewModule::class])
abstract class AppModule {

    @Singleton
    companion object {
        @Provides
        fun provideContext(application: App): Context {
            return application.applicationContext
        }
    }

    @Binds
    abstract fun provideDatabase(db: AppDBHelper): DatabaseHelper

    @Binds
    abstract fun providePrefs(db: AppPrefHelper): PrefHelper

    @Binds
    abstract fun provideApiHelper(db: AppApiHelper): ApiHelper

    @Binds
    abstract fun provideDataManager(dataManager: AppDataManager): DataManager
}