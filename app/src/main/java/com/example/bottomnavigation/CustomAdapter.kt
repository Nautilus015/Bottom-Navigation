package com.example.bottomnavigation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(var list : ArrayList<MyData>)
    : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycleitems,parent,false))
    }

    class ViewHolder(itemVeiw:View):RecyclerView.ViewHolder(itemVeiw) {
        val name : TextView = itemVeiw.findViewById(R.id.myname)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.name.text = list[position].name
        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context, "$position", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}