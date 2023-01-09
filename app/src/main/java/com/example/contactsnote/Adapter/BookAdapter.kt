package com.example.contactsnote.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.contactsnote.Model.dataBook
import com.example.contactsnote.R
import com.example.contactsnote.databinding.RecycelBooksBinding

class BookAdapter(val Data: ArrayList<dataBook>, val interfacee : clicked) :
    RecyclerView.Adapter<BookAdapter.ViweHolder>() {
    lateinit var binding: RecycelBooksBinding



    inner class ViweHolder ( itemint : View) : RecyclerView.ViewHolder(itemint){


        fun Databind( dataFood: dataBook) {
            Glide.with(binding.root.context)
                .load(dataFood.img)
                .error(R.drawable.book)
                .into(binding.imgList)
            binding.book.text = dataFood.name
            binding.dateChap.text = dataFood.date
            binding.payeDarsi.text =  dataFood.paye

            itemView.setOnClickListener {
               interfacee.check_click(dataFood)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViweHolder {
        binding = RecycelBooksBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViweHolder(binding.root)
    }

    override fun getItemCount(): Int {

        return Data.size

    }

    override fun onBindViewHolder(holder: ViweHolder, position: Int) {
        holder.Databind(Data[position])
    }

    interface clicked {
        fun check_click(data : dataBook)
    }



}