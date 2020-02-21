package com.example.kotlinsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinsample.data.impl.DataManager
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var dataManager: DataManager

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dataManager.printCat()
    }
}
