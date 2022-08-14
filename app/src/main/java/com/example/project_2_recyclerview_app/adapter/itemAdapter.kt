package com.example.project_2_recyclerview_app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.data.Datasource
import com.example.project_2_recyclerview_app.model.Plant

class itemAdapter(private val dataset : List<Plant>,  private val context: Context)
    : RecyclerView.Adapter<itemAdapter.PlantViewHolder>(){


    class PlantViewHolder(private val  view :View)
         :RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return PlantViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: PlantViewHolder, position: Int) {
      val item = dataset[position]
        holder.textView.text= context.resources.getString(item.plantStringId)
        holder.imageView.setImageResource(item.plantImageId)
    }

    override fun getItemCount(): Int =dataset.size


}