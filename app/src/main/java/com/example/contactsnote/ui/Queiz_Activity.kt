package com.example.contactsnote.ui

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.contactsnote.Model.Constant
import com.example.contactsnote.Model.DataQuestion
import com.example.contactsnote.R
import com.example.contactsnote.databinding.ActivityQueizBinding

class Queiz_Activity : AppCompatActivity() {
    lateinit var binding: ActivityQueizBinding
    lateinit var getList: ArrayList<DataQuestion>
    var current = 0
    var nowIsSelect = 0
    var CurrectScorre = 0
    var WrongScorre = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueizBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val Intent1 = intent.getStringExtra("names")
        val Intent2 = intent.getStringExtra("names2")
        val Intent3 = intent.getStringExtra("names3")
        Log.v("test",Intent1.toString())
        binding.btnShowResualt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", Intent1)
            bundle.putString("number", Intent2)
            bundle.putString("password", Intent3)
            bundle.putString("CurrentScorre", CurrectScorre.toString())
            bundle.putString("WrongtScorre", WrongScorre.toString())
            val myDialog = DialogFragmentQuiz()
            myDialog.show(supportFragmentManager, null)
            myDialog.arguments = bundle
            Log.v("test",Intent1.toString())

        }

        binding.animQa.playAnimation()
        getList = Constant.getQuestion()
        Load()

    }

    fun Load() {
        val question = getList[current]
        binding.txtQuestion1.text = question.question
        binding.txtOption1.text = question.OneOption
        binding.txtOption2.text = question.TwoOption
        binding.txtOption3.text = question.ThreeOption
        binding.txtOption4.text = question.FourOption
    }

    fun OnClickDselect() {
        var options = ArrayList<TextView>()
        options.add(binding.txtOption1)
        options.add(binding.txtOption2)
        options.add(binding.txtOption3)
        options.add(binding.txtOption4)

        for (option in options) {
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.btn_back)
            option.setTextColor(Color.parseColor("#4C4C4C"))

        }

    }

    fun OnClickdOptions(view: View) {

        OnClickDselect()
        var ClickSelect = view as TextView
        ClickSelect.typeface = Typeface.DEFAULT_BOLD
        ClickSelect.background = ContextCompat.getDrawable(this, R.drawable.btn_back_selected)
        ClickSelect.setTextColor(Color.parseColor("#000000"))

        when (ClickSelect.tag.toString()) {

            "option1" -> {
                nowIsSelect = 1
            }
            "option2" -> {
                nowIsSelect = 2
            }
            "option3" -> {
                nowIsSelect = 3
            }
            "option4" -> {
                nowIsSelect = 4
            }
        }
    }


    fun submit(view: View) {
       if (nowIsSelect == 0) {
            binding.btnNextQuestion.text = "This is My Answar"
       }

        if (nowIsSelect == 0 && current < getList.size - 1) {
            // if Empty
            current++
            Toast.makeText(this, "$CurrectScorre / $WrongScorre", Toast.LENGTH_SHORT).show()
            Load()
            OnClickDselect()
            nowIsSelect = 0

        } else {
            // if True
            if (nowIsSelect == getList[current].CurrentOption) {
                binding.btnNextQuestion.text = "Next Question"
                Toast.makeText(this, "$CurrectScorre / $WrongScorre", Toast.LENGTH_SHORT).show()
                CurrectScorre++
                nowIsSelect = 0
            }

                else if (current == getList.size -1) {
                    binding.btnNextQuestion.visibility = View.GONE
                    binding.btnShowResualt.visibility = View.VISIBLE
                }

            else {
                // if False
                WrongScorre ++
                binding.btnNextQuestion.text = "Next Question"
                nowIsSelect = 0
                Toast.makeText(this, "$CurrectScorre / $WrongScorre", Toast.LENGTH_SHORT).show()
            }

        }
    }




    fun backChangeForQuiz(Id: Int, DrawAbele: Int) {

    }

}