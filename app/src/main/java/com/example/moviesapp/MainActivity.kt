package com.example.moviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // top bar
        val actionBar = findViewById<Toolbar>(R.id.topToolbar)
        setSupportActionBar(actionBar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_nav_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        when (item.itemId) {
            R.id.activity1_about_item -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_view, About.newInstance())
                .commit()

            R.id.activity2_catalog_item -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_view, Catalog.newInstance())
                .commit()

            R.id.activity3_rand_item -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_view, RandMovie.newInstance())
                .commit()
        }
        return super.onOptionsItemSelected(item)
    }

}