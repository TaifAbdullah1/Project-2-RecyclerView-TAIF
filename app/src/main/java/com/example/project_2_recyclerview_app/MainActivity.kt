package com.example.project_2_recyclerview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.adapter.itemAdapter
import com.example.project_2_recyclerview_app.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Connect the adapter with the data here
        // Bind the recyclerview and the adapter here
        val plantList = Datasource().loadPlant()

        // adapter
        val adapter = itemAdapter(plantList, this)

        // recyclerView
        val recyclerView : RecyclerView = findViewById(R.id.rv_plant)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
    }
}