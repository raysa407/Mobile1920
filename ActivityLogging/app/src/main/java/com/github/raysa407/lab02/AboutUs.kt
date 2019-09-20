package com.github.dimsvibe.lab02

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AboutUs : AppCompatActivity() {

    val TAG = "About Us"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        Log.d(TAG, msg: "Inside oncreate")
        Toast.makeText(context:this, text: "You are under about us", Toast.LENGTH_LONG).show()

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, msg: "In OnStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, msg: "In OnStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, msg: "In OnPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, msg: "In OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, msg: "In OnRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, msg: "In OnResume")
    }
}

