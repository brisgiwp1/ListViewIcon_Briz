package com.example.listviewicon_briz.Model
import com.example.listviewicon_briz.Adapter.Bahasa_PemrogramanList
import com.example.listviewicon_briz.R
import com.example.listviewicon_briz.Model.Bahasa_Pemrograman as Bahasa_Pemrograman

object Bahasa_PemrogramanData {
    private val nama_Bahasa_Pemrograman = arrayOf(
        "Ruby",
        "Ralis",
        "Phyton",
        "Java Script",
        "PHP"
    )

    private val detail = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language",
        "Ruby on Ralis is a server-side web application development framework written in Ruby language",
        "Phyton is interpreted scripting and object-oriented programming language",
        "Java Script is an object-based scripting language",
        "PHP is an interpreted language, i.e., there is no need for compilation"
    )

    private val Bahasa_PemrogramanPoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.ralis,
        R.drawable.phyton,
        R.drawable.javascript,
        R.drawable.php
    )

    val Bahasa_PemrogramanList: ArrayList<com.example.listviewicon_briz.Model.Bahasa_Pemrograman>
        get(){
            val list = arrayListOf<com.example.listviewicon_briz.Model.Bahasa_Pemrograman>()
            for (position in nama_Bahasa_Pemrograman.indices){
                val Bahasa_Pemrograman = com.example.listviewicon_briz.Model.Bahasa_Pemrograman()
                Bahasa_Pemrograman.name = nama_Bahasa_Pemrograman[position]
                Bahasa_Pemrograman.detail = detail[position]
                Bahasa_Pemrograman.poster = Bahasa_PemrogramanPoster[position]
                list.add(Bahasa_Pemrograman)
            }
            return list
        }
}