package com.example.newhomework5.vmmv.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.newhomework5.vmmv.data.remote.dto.PostModel
import com.example.newhomework5.vmmv.domain.model.DomainPostList

class RecyclerAdapter (

    private val item: DomainPostList,
    private val onItemClickEvent: (View) -> Unit) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.twHeading)
        val descriptionTextView:TextView = itemView.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
val itemView =LayoutInflater.from(parent.context)
    .inflate(R.layout.list_item, parent,false)

itemView.setOnClickListener {
    onItemClickEvent(it)
}
return MyViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.apply {
           titleTextView.text = item.posts[position].title
           descriptionTextView.text = item.posts[position].description
       }
    }

    override fun getItemCount(): Int {
        return item.posts.size
    }
}
