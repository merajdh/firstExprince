package com.example.contactsnote.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.contactsnote.databinding.DialogFragmentBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class DialogFragmentQuiz() : BottomSheetDialogFragment()  {
    lateinit var binding: DialogFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogFragmentBinding.inflate(layoutInflater , container , false)

        val  bundle = arguments
        val currectPoint = bundle?.getString("CurrentScorre")
        val WrongPoint = bundle?.getString("WrongtScorre" )
        binding.txtCurrentAnswar.text = currectPoint
        binding.txtWrongAnswar.text = WrongPoint
        Toast.makeText(context, "$WrongPoint", Toast.LENGTH_SHORT).show()
        Toast.makeText(context, "$currectPoint", Toast.LENGTH_SHORT).show()



        binding.showResualt.setOnClickListener {
            val Intent2 = Intent(context , Activity_Profile::class.java)
            bundle!!.putString("currect" , currectPoint)
            bundle!!.putString("wrong" , WrongPoint)
            startActivity(Intent2)
        }

        return binding.root
    }



}