package com.example.android_kotlin_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val randomInt = (1..6).random()
        val diceIamge: ImageView = findViewById(R.id.dice_img)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceIamge.setImageResource(drawableResource)
        Toast.makeText(this, "Random thing!!!",
        Toast.LENGTH_SHORT).show()
    }
}