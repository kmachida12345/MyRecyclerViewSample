package com.test.myrecyclerviewsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(val listItemData: ArrayList<ListItemData>): RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>() {




    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val text: TextView = itemView.findViewById(R.id.sampleTxt)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = listItemData[position]

        holder.text.text = listItem.text
    }

    override fun getItemCount(): Int {
        return listItemData.size
    }
}