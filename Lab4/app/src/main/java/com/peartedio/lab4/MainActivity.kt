package com.peartedio.lab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button_save).setOnClickListener {
            val name = findViewById<EditText>(R.id.edit_text).text.toString()
            val intent = Intent(this, SecondActivity::class.java)
//            val bundle = Bundle()
//            bundle.putString(SecondActivity.Params.NAME, name)
            intent.putExtra(SecondActivity.Params.NAME, name)
            startActivity(intent)
        }
    }
}