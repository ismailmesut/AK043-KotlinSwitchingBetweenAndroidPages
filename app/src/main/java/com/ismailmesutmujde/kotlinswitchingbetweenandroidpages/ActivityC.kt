package com.ismailmesutmujde.kotlinswitchingbetweenandroidpages

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

    }

    override fun onBackPressed() {
        val newIntent = Intent(this@ActivityC, ActivityA::class.java)
        startActivity(newIntent)
    }
}