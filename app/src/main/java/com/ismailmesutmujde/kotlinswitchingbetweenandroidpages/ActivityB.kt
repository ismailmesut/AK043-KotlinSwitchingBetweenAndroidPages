package com.ismailmesutmujde.kotlinswitchingbetweenandroidpages

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinswitchingbetweenandroidpages.databinding.ActivityBBinding


class ActivityB : AppCompatActivity() {

    private lateinit var bindingB : ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingB = ActivityBBinding.inflate(layoutInflater)
        val view = bindingB.root
        setContentView(view)

        bindingB.buttonGoToC.setOnClickListener {
            val newIntent = Intent(this@ActivityB, ActivityC::class.java)
            startActivity(newIntent)
        }
    }
}