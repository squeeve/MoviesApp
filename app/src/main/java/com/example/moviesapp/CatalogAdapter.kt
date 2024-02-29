package com.example.moviesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class CatalogAdapter() : RecyclerView.Adapter<CatalogAdapter.CatalogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.items_list, parent, false)
        return CatalogViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CatalogViewHolder, position: Int) {
        holder.bind(listing[position])
    }

    override fun getItemCount(): Int = listing.size

    class CatalogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieName: TextView = itemView.findViewById(R.id.movie_name)
        val movieData: TextView = itemView.findViewById(R.id.movie_data)
        val moviePoster: ImageView = itemView.findViewById(R.id.poster_pic)

        fun bind(item: Movie) {
            movieName.text = item.name
            movieData.text = "Director: ${item.director}\n${item.year}"
            moviePoster.contentDescription = item.name
            Picasso.get()
                .load(item.imageUrl)
                .placeholder(R.drawable.poster_placeholder)
                .into(moviePoster)
        }
    }
}