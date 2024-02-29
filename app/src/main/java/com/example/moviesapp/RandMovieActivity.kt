package com.example.moviesapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class RandMovieActivity : FragmentActivity() {
    private lateinit var viewPager : ViewPager2
    private lateinit var tabLayout : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rand_movie)

        val intent = this.intent
        val position: Int = intent.getIntExtra("position", 0)
        Log.d("RandMovieActivity" , "position = ${position}")

        viewPager = findViewById<ViewPager2>(R.id.pager)
        tabLayout = findViewById<TabLayout>(R.id.tab_layout)

        val randMovieAdapter = RandMoviePagerAdapter(this)
        viewPager.adapter = randMovieAdapter

        TabLayoutMediator(tabLayout, viewPager) { tab, pos ->
            val movie: Movie = listing[pos]
            tab.text = movie.name
        }.attach()

        viewPager.setCurrentItem(position, true)

        Log.d("tabLayout", "About to select a view")
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                Log.d("tabLayout", "Selected a view")
                viewPager.setCurrentItem(tab.position, true)
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }
}

class RandMoviePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = listing.size

    override fun createFragment(position: Int): Fragment {
        val fragment = RandMovieFragment()
        val bundle = Bundle().apply {
            putString("name", listing[position].name)
            putString("string", listing[position].DetailsString())
            putString("poster", listing[position].imageUrl)
            putString("url", listing[position].url)
        }
        fragment.arguments = bundle
        return fragment
    }
}