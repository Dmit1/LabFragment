package com.test.labfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("LIFE_CYCLE","MainActivity 1 onCreate")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFE_CYCLE","MainActivity 1 onCreate")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFE_CYCLE","MainActivity 1 onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFE_CYCLE","MainActivity 1 onDestroy")
    }
}