package com.example.moviesapp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class RandMovie : Fragment() {

    companion object {
        fun newInstance() = RandMovie()
    }

    private lateinit var viewModel: RandMovieViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rand_movie, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RandMovieViewModel::class.java)
        // TODO: Use the ViewModel
    }

}