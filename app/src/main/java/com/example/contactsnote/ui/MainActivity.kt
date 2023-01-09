package com.example.contactsnote.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.contactsnote.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.schedule
import kotlin.math.E


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnNext.setOnClickListener {
            val name = binding.name.text.toString()
            val num = binding.number.text.toString()
            val pass = binding.pass.text.toString()

            if (name.isEmpty() && name.length < 3){
                binding.name.error = "error"
            } else if (num.isEmpty()){
                binding.number.error = "error"
            } else if ( num.length < 10){
                binding.number.error = "error"
            } else if(pass.isEmpty() && pass.length < 4){
                binding.pass.error = "error"
                 }else{
                binding.animLogin.playAnimation()
                var intent = Intent(this, choose_activity::class.java)
                Timer().schedule(1200) {

                    intent.putExtra("name1", binding.name.text.toString())
                    intent.putExtra("name2", binding.pass.text.toString())
                    intent.putExtra("name3", binding.number.text.toString())
                    startActivity(intent)
                }

                }
            }
        }
    }


