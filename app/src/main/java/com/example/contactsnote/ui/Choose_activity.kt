package com.example.contactsnote.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.contactsnote.Model.myApp
import com.example.contactsnote.databinding.ActivityChooseBinding
import java.util.*
import kotlin.concurrent.schedule

class choose_activity : AppCompatActivity() {
    lateinit var binding: ActivityChooseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val Intent = intent.getStringExtra("name1")
        val Intent2 = intent.getStringExtra("name2")
        val Intent3 = intent.getStringExtra("name3")

        binding.txtName.text = Intent.toString()
        binding.pass1.text = Intent2.toString()
        binding.num.text = Intent3.toString()

        ShowProfile()
        OnClickHaftom()
        OnClickHashtom()
        OnClickNohom()
        OnClickQuizBtn()
    }

    fun ShowProfile() {
        binding.profileInfo.setOnClickListener {


            val goToProfile = Intent (this , Activity_Profile::class.java)
            goToProfile.putExtra("names" , binding.txtName.text.toString())
            goToProfile.putExtra("names2" , binding.num.text.toString())
            goToProfile.putExtra("names3" , binding.pass1.text.toString())
            startActivity(goToProfile)

        }
    }

    fun OnClickHaftom() {

        binding.haftom.setOnClickListener {
            myApp.ischeckd = "haftom"
            val intent = Intent(this, BookListActivity::class.java)

            Timer().schedule(100) {
                //calling a function
                startActivity(intent)
            }
        }
    }

    fun OnClickHashtom() {
        binding.hashtom.setOnClickListener {
            myApp.ischeckd = "hashtom"
            val intent = Intent(this, BookListActivity::class.java)

            Timer().schedule(100) {
                //calling a function
                startActivity(intent)
            }
        }
    }

    fun OnClickNohom() {
        binding.nohom.setOnClickListener {
            myApp.ischeckd = "nohom"
            val intent = Intent(this, BookListActivity::class.java)

            Timer().schedule(100) {
                //calling a function
                startActivity(intent)
            }
        }
    }

    fun OnClickQuizBtn() {
        binding.btnClickForQuiz.setOnClickListener {
            val intent = Intent(this, Queiz_Activity::class.java)

            startActivity(intent)

        }

    }
}