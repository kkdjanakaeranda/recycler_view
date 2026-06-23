package com.example.recy_morning.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recy_morning.R
import com.example.recy_morning.activities.view

class CustomAdapter(private val mList: List<String>): RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        // get references to elements in our list item
        val titleTextView = itemView.findViewById<TextView>(R.id.title_text_view)
        val viewbutton = itemView.findViewById<Button>(R.id.viewbtn)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        //inflate ui and return individual list
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        //update individual list items
        val country = mList[position]
        holder.titleTextView.text = country

        holder.viewbutton.setOnClickListener {
            val intentobj = Intent(holder.itemView.context, view::class.java)
            intentobj.putExtra("text",country)
            holder.itemView.context.startActivity(intentobj)
        }
    }

    override fun getItemCount(): Int {
        return mList.count()
    }





}