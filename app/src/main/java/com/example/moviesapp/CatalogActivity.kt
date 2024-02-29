package com.example.moviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class CatalogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        val catalog = CatalogAdapter() // Get the adapter that binds data to view
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view) // get the view, and then
        recyclerView.adapter = catalog // Set its adapter to that acquired adapter.
    }
}