package com.example.listviewicon_briz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewicon_briz.Adapter.Bahasa_PemrogramanList
import com.example.listviewicon_briz.Model.Bahasa_Pemrograman
import com.example.listviewicon_briz.Model.Bahasa_PemrogramanData

class MainActivity : AppCompatActivity() {
    private lateinit var rvBahasa_Pemrograman: RecyclerView
    private var list: ArrayList<Bahasa_Pemrograman> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBahasa_Pemrograman = findViewById(R.id.rv_Bahasa_Pemrograman)
        rvBahasa_Pemrograman.setHasFixedSize(true)
        list.addAll(Bahasa_PemrogramanData.Bahasa_PemrogramanList)
        showBahasa_Pemrograman()
    }

    private fun showBahasa_Pemrograman(){
        rvBahasa_Pemrograman.layoutManager = LinearLayoutManager(this)
        rvBahasa_Pemrograman.adapter = Bahasa_PemrogramanList(this,list){
            Toast.makeText(this,it.detail,Toast.LENGTH_SHORT).show();
        }
    }
}
