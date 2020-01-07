package com.click.apkgame.shoppy.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.R.attr.description
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.NonNull
import android.widget.TextView
import com.click.apkgame.shoppy.R
import com.click.apkgame.shoppy.model.Collection


class DCRececlerAdapter(val collections : ArrayList<Collection>) : RecyclerView.Adapter<DCRececlerAdapter.MyViewHolder>(){


    var list = arrayListOf<Collection>()

    init {
        //list = collections
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.defult_collection_item , parent , false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return collections.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val collection  = collections.get(position)
        holder.cover_photo.setImageResource(collection.cover_photo)
        holder.name.setText(collection.name)
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val cover_photo: ImageView = itemView.findViewById(R.id.image)
        val name: TextView = itemView.findViewById(R.id.name)

    }

}

