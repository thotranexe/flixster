package com.codepath.flixster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codepath.flixster.R
import com.codepath.flixster.R.id



/**
 * The MainActivity for the BestSellerList app.
 * Launches a [BestSellerBooksFragment].
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(id.content, FlixsterFragment(), null).commit()
    }
}