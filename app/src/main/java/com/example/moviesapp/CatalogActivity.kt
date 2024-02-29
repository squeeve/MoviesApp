package com.example.moviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class CatalogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        val catalog = CatalogAdapter()
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = catalog
    }
}