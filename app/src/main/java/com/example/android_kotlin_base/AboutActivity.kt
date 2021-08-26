package com.example.android_kotlin_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val submitButton: Button = findViewById(R.id.submit_answer_btn)
        submitButton.setOnClickListener { showInfo() }
    }

    private fun showInfo() {
        val kotlinInfoTextView = findViewById<TextView>(R.id.about_android_kotlin_tv)
        val answerEditText = findViewById<EditText>(R.id.random_answer_et)
        var infoMessage = "InCorrect"
        if (answerEditText.text.toString() == ("2019")) {
            infoMessage = "Correct"
        }
        Toast.makeText(this, infoMessage,
                Toast.LENGTH_LONG).show()
        kotlinInfoTextView.visibility = View.VISIBLE
    }
}