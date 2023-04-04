package com.test.labfragment

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Fragment1 : Fragment() {
    override fun onAttach(activity:Context) {
        super.onAttach(activity)
        Log.d("LIFE_CYCLE","Fragment1 onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LIFE_CYCLE","Fragment1 onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("LIFE_CYCLE","Fragment1 onCreateView")
        return inflater.inflate(R.layout.fragment_1,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("LIFE_CYCLE","Fragment1  onViewCreated")
        view.findViewById<Button>(R.id.button_finish).setOnClickListener{
            activity?.finish()
        }
    }

    override fun onResume() {
        Log.d("LIFE_CYCLE","Fragment1 onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("LIFE_CYCLE","Fragment1 onPause")
        super.onPause()
    }

    override fun onDetach() {
        Log.d("LIFE_CYCLE","Fragment1 onDetach")
        super.onDetach()
    }


}