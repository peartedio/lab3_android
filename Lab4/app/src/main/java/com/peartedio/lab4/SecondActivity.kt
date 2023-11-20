package com.peartedio.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    object Params {
        const val NAME = "name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val name = intent.getStringExtra(Params.NAME)
        findViewById<TextView>(R.id.name).text = getString(R.string.name_info, name)
    }
}