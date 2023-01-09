package com.example.contactsnote.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.contactsnote.databinding.ActivityProfileBinding

class Activity_Profile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AddInQuiz()
        AddInMain()


    }


    fun AddInQuiz( ){
        val bundle = Bundle()
        val value4 = bundle.getString("currect")
        val value5 = bundle.getString("wrong")
        binding.txtUsername.text = value4.toString()
        binding.txtNumber.text = value5.toString()
    }

    fun AddInMain ( ) {
        val value =  intent.getStringExtra("names")
        val value1 =  intent.getStringExtra("names2")
        val value2 =  intent.getStringExtra("names3")
        binding.txtUsername.text = value.toString()
        binding.txtNumber.text = value1.toString()
        binding.txtScorr.text = value2.toString()
    }
}