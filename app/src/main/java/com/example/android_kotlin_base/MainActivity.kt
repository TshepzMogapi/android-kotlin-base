package com.example.android_kotlin_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val randomizeBtn: Button = findViewById(R.id.randomize_btn)
        randomizeBtn.setOnClickListener{ randomize() }
    }

    private fun randomize() {
        val randomText: TextView = findViewById(R.id.random_txt)
        val randomInt = (1..6).random()
        randomText.setText(randomInt.toString())
        Toast.makeText(this, "Random thing!!!",
        Toast.LENGTH_SHORT).show()
    }
}