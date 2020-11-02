package com.example.retrofitmvvm2.repositry

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitmvvm2.R

class RecyclerAdapter(private val dataList: List<Any>) : RecyclerView.Adapter<RecyclerAdapter.ResponseViewHolder>() {
    class ResponseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemText: TextView = itemView.findViewById(R.id.text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResponseViewHolder {
        return ResponseViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.textview, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ResponseViewHolder, position: Int) {
        holder.itemText.text = dataList[position].toString()
    }

    override fun getItemCount(): Int = dataList.size
}
