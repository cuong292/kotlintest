package com.example.kotlinsample.data

import android.content.Context
import com.example.kotlinsample.base.DatabaseName
import com.example.kotlinsample.data.dataInterface.DatabaseHelper
import io.realm.RealmConfiguration
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDBHelper @Inject constructor(val context: Context, @DatabaseName var dbName: String) :
    DatabaseHelper {

    fun reConfigName(realmDb: String) {
        dbName = realmDb;
    }

    companion object RealmInstance {
        private lateinit var realmConfig: RealmConfiguration
        fun getInstance() {
            realmConfig = RealmConfiguration.Builder()
//                .name(dbName)
                .schemaVersion(3)
                .build()
        }
    }

}