package com.example.moviesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navigationView = findViewById<NavigationView>(R.id.drawer_view)
        navigationView.setNavigationItemSelectedListener(this)
        // top bar
        val actionBar = findViewById<Toolbar>(R.id.topToolbar)
        setSupportActionBar(actionBar)

        val drawerToggler = ActionBarDrawerToggle(this, drawerLayout, actionBar, R.string.nav_open, R.string.nav_close)
        drawerLayout.addDrawerListener(drawerToggler)
        drawerToggler.syncState()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_nav_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    /*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //super.onViewCreated(view, savedInstanceState)
        val navigationView = view.findViewById<NavigationView>(R.id.fragment_view)
        val navController = Navigation.findNavController(view)
        NavigationUI.setupWithNavController(navigationView, navController)
    } */

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        when (item.itemId) {
            R.id.activity1_about_item -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_view, About.newInstance())
                .addToBackStack(null)
                .commit()

            /* R.id.activity2_catalog_item -> startActivity(Intent(this, CatalogActivity::class.java)) */
            R.id.activity2_catalog_item -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_view, Catalog.newInstance())
                .addToBackStack(null)
                .commit()
            R.id.activity3_rand_item -> {
                val randMovie = Intent(this, RandMovieActivity::class.java)
                val position = (0..<listing.size).random()
                Log.d("MainActivity" , "position = ${position}")
                randMovie.putExtra("position", position)
                startActivity(randMovie)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav1_about_item -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_view, About.newInstance())
                .addToBackStack(null)
                .commit()

            R.id.nav2_catalog_item -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_view, Catalog.newInstance())
                .addToBackStack(null)
                .commit()

            R.id.activity3_rand_item -> {
                val randMovie = Intent(this, RandMovieActivity::class.java)
                val position = (0..<listing.size).random()
                Log.d("MainActivity" , "position = ${position}")
                randMovie.putExtra("position", position)
                startActivity(randMovie)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}