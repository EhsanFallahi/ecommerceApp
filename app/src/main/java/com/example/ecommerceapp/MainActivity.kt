package com.example.ecommerceapp

import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        nav_view.setNavigationItemSelectedListener {
            it.isChecked=true
            drawer_layout.closeDrawers()
            true
        }

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        drawer_layout.openDrawer(GravityCompat.END)
        return true
    }

}