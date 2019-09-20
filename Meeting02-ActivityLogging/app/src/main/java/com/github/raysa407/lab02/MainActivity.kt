package com.github.raysa407.lab02

import android.support.v4.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity(): AppCompatActivity() {

    val TAG="Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, msg: "In Oncreate")
        val about_us = findViewById<Button>(R.id.about_us)
        about_us.setOnClickListener { it:View!
        val i = Intent(packageContext: this,AboutUs:: class.java)
        startActivity(i)
        }
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

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}
