package com.example.kotlinsample.di

import android.content.Context
import com.example.kotlinsample.App
import com.example.kotlinsample.BuildConfig
import com.example.kotlinsample.base.DatabaseName
import com.example.kotlinsample.base.PrefName
import com.example.kotlinsample.data.AppApiHelper
import com.example.kotlinsample.data.AppDBHelper
import com.example.kotlinsample.data.AppDataManager
import com.example.kotlinsample.data.AppPrefHelper
import com.example.kotlinsample.data.dataInterface.ApiHelper
import com.example.kotlinsample.data.dataInterface.DataManager
import com.example.kotlinsample.data.dataInterface.DatabaseHelper
import com.example.kotlinsample.data.dataInterface.PrefHelper
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ActivityModule::class])
abstract class AppModule {

    @Singleton
    companion object {
        @Provides
        fun provideContext(application: App): Context {
            return application.applicationContext
        }

        @Provides
        @PrefName
        fun providePrefName(context: Context): String {
            return "pref" + context.packageName + if (BuildConfig.DEBUG) ".debug" else ".release"
        }

        @Provides
        @DatabaseName
        fun provideDatabaseName(context: Context): String {
            return "db" + context.packageName + if (BuildConfig.DEBUG) ".debug" else ".release"
        }
    }

    @Binds
    abstract fun provideDatabase(db: AppDBHelper): DatabaseHelper

    @Binds
    abstract fun providePrefs(db: AppPrefHelper): PrefHelper

    @Binds
    abstract fun provideApiHelper(db: AppApiHelper): ApiHelper

    @Binds
    @Singleton
    abstract fun provideDataManager(dataManager: AppDataManager): DataManager
}