package com.example.contactsnote.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.contactsnote.R
import com.example.contactsnote.Model.dataBook
import com.example.contactsnote.databinding.ActivityInfoBinding
import com.example.contactsnote.Model.myApp

class InfoActivity : AppCompatActivity() {
    lateinit var binding: ActivityInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<dataBook>("info" )
        if (data != null) {
            setdata(data)
        }

        when (myApp.ischeckd){
            "haftom" -> binding.PayeForShow.text = "پایه هفتم"
            "hashtom" -> binding.PayeForShow.text = "پایه هشتم"
            "nohom" -> binding.PayeForShow.text = "پایه نهم" }
    }

    private fun setdata(data: dataBook) {
        binding.txtname.text = data.name
        Glide.with(this).load(data.img).error(R.drawable.book2).into(binding.imgbook)
        binding.paye.text = data.paye
        binding.date.text = data.date
        binding.page.text = data.page
        binding.info.text = data.info


    }
}