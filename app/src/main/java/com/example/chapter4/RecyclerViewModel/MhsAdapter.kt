package com.example.chapter4.RecyclerViewModel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4.R

class MhsAdapter (var listMhs : ArrayList<ListMhs>) : RecyclerView.Adapter<MhsAdapter.ViewHolder>() {
    var onClick:((ListMhs) -> Unit)? = null

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)  {
        var namaMhs = itemView.findViewById<TextView>(R.id.namaMhs)
        var npmMhs = itemView.findViewById<TextView>(R.id.npmMhs)
        var imgMhs = itemView.findViewById<ImageView>(R.id.imgMhs)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_mhs, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaMhs.text = listMhs[position].nama
        holder.npmMhs.text = listMhs[position].npm
        holder.imgMhs.setImageResource(listMhs[position].img)
    }

    override fun getItemCount(): Int = listMhs.size

    fun setDataMhs(mhsList: ArrayList<ListMhs>){
        this.listMhs = mhsList
    }
}