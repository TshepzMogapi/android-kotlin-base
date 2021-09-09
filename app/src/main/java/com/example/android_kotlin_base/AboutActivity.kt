package com.example.android_kotlin_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.android_kotlin_base.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    private val info: Info = Info("1991")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about)
        binding.info = info
        val submitButton: Button = binding.submitAnswerBtn
        submitButton.setOnClickListener { showInfo() }
    }

    private fun showInfo() {
        val kotlinInfoTextView = binding.aboutAndroidKotlinTv
        val answerEditText = binding.randomAnswerEt
        var infoMessage = "InCorrect"
        if (answerEditText.text.toString() == ("2019")) {
            infoMessage = "Correct"
        }
        Toast.makeText(this, infoMessage,
                Toast.LENGTH_LONG).show()
        kotlinInfoTextView.visibility = View.VISIBLE
    }
}