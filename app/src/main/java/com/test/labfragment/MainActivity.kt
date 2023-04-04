package com.test.labfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("LIFE_CYCLE","MainActivity 1 onCreate")
        openFragment()
    }
    fun openFragment(){
        val transaction = supportFragmentManager.beginTransaction()
        var fragment1 = Fragment1()
        transaction.add(R.id.fragment_1_container,fragment1)
        transaction.commit()
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