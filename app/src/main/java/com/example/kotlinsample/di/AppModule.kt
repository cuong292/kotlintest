package com.example.kotlinsample.di

import android.content.Context
import com.example.kotlinsample.App
import com.example.kotlinsample.data.*
import com.example.kotlinsample.data.impl.ApiImpl
import com.example.kotlinsample.data.impl.DbImpl
import com.example.kotlinsample.data.impl.PreferenceImpl
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
    abstract fun provideDatabase(db: AppDB): DbImpl

    @Binds
    abstract fun providePrefs(db: AppPreference): PreferenceImpl

    @Binds
    abstract fun provideApiHelper(db: AppApi): ApiImpl

    @Binds
    abstract fun provideDataManager(dataManager: AppDataManager): DataManager
}