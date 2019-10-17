package com.example.listviewicon_briz.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewicon_briz.R
import com.example.listviewicon_briz.Model.Bahasa_Pemrograman
import com.example.listviewicon_briz.Model.Bahasa_PemrogramanData.Bahasa_PemrogramanList


class Bahasa_PemrogramanList(private val context: Context, private val Bahasa_Pemrograman : ArrayList <Bahasa_Pemrograman>,
                             private val listener: (Bahasa_Pemrograman) -> Unit): RecyclerView.Adapter<Bahasa_PemrogramanList.viewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Bahasa_PemrogramanList.viewHolder {
        return viewHolder(LayoutInflater.from(context).inflate(R.layout.bahasa_pemrogramanitem, parent, false))
    }

    override fun getItemCount(): Int {
        return Bahasa_PemrogramanList.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.bindBahasa_Pemrograman(Bahasa_Pemrograman[position], listener)

    }

    class viewHolder(view: View):RecyclerView.ViewHolder(view){
        var tvName: TextView = view.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = view.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = view.findViewById(R.id.img_item_poster)

        fun bindBahasa_Pemrograman(Bahasa_Pemrograman: Bahasa_Pemrograman, listener: (Bahasa_Pemrograman) -> Unit){
            tvName.text = Bahasa_Pemrograman.name
            tvDetail.text = Bahasa_Pemrograman.detail
            Glide.with(itemView.context)
                .load(Bahasa_Pemrograman.poster)
                .into(imgPoster)
        }
    }
}