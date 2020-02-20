package com.example.kotlinsample.data

import javax.inject.Inject

class AppDataManager @Inject constructor(
    val dbHelper: AppDB,
    val apiHelper: AppApi,
    val pref: AppPreference
) : DataManager {
    override fun printMouse() {
        apiHelper.printMouse()
    }

    override fun printDog() {
        pref.printDog()
    }

    override fun printCat() {
        dbHelper.printCat()
    }

}