package com.ismailmesutmujde.kotlinswitchingbetweenandroidpages

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinswitchingbetweenandroidpages.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {

    private lateinit var bindingA : ActivityABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingA = ActivityABinding.inflate(layoutInflater)
        val view = bindingA.root
        setContentView(view)

        bindingA.buttonGoToB.setOnClickListener {
            val newIntent = Intent(this@ActivityA, ActivityB::class.java)
            startActivity(newIntent)
        }

    }

    override fun onBackPressed() {
        //super.onBackPressed()    // deprecated
        onBackPressedDispatcher.onBackPressed()
    }
}