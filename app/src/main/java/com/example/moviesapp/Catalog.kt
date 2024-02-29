package com.example.moviesapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Catalog : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.fragment_catalog)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val catalog = CatalogAdapter()
        val someView = inflater.inflate(R.layout.fragment_catalog, container, false) // Inflate the layout for this fragment
        val recyclerView: RecyclerView = someView.findViewById(R.id.recycler_view)
        recyclerView.adapter = catalog

        return someView
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            Catalog().apply {
            }
    }
}