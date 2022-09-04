package com.example.dz7_3

import android.provider.Settings
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadGlide(url:String){
    Glide.with(this).load(url).into(this)
}