package com.example.contactsnote.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactsnote.databinding.ActivityChooseQuizBinding

class ChooseActivityQuiz : AppCompatActivity() {
    lateinit var binding: ActivityChooseQuizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }


}