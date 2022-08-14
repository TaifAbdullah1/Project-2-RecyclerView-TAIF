package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Plant

class Datasource {

    fun loadPlant() : List<Plant>{
        return listOf(
            Plant(R.string.a1, R.drawable.a1),
            Plant(R.string.a2, R.drawable.a2),
            Plant(R.string.a3, R.drawable.a_3),
            Plant(R.string.a4, R.drawable.a4),
            Plant(R.string.a5, R.drawable.a5),
            Plant(R.string.a6, R.drawable._a)
        )
    }
}