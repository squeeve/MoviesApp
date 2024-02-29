package com.example.moviesapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.squareup.picasso.Picasso

class RandMovieFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.movie_details, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val poster: ImageView = view.findViewById(R.id.poster_pic)
        val metadata: TextView = view.findViewById(R.id.movie_meta)
        //val url = arguments?.getString("url")
        poster.contentDescription = arguments?.getString("name")
        poster.contentDescription = arguments?.getString("string")
        metadata.text = arguments?.getString("string")
        Picasso.get()
            .load(arguments?.getString("poster"))
            .placeholder(R.drawable.poster_placeholder)
            .into(poster)
    }

}

