package com.example.kotlinsample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlinsample.data.dataInterface.DataManager
import dagger.android.support.AndroidSupportInjection
import kotlinx.coroutines.*
import javax.inject.Inject


class MainFragment : Fragment() {
    @Inject
    lateinit var dataManager: DataManager

    private var j = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val data = CoroutineScope(Dispatchers.IO).async {
            // call api
            delay(2000)
            Log.d("cuongnb", "log duoc roi ne")
            "ahihi do ngok"
        }

        CoroutineScope(Dispatchers.Main).launch {
            cuongnbShow(data.await())
        }


    }

    fun cuongnbShow(s: String) {
        println(s)
    }

}