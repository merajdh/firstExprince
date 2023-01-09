package com.example.contactsnote.Model

import android.os.Parcelable
import android.view.View
import kotlinx.parcelize.Parcelize

@Parcelize
data class dataBook (
    val img : String ,
    val name: String ,
    val date: String ,
    val paye: String ,
    val page : String,
    val info : String,


        ):Parcelable