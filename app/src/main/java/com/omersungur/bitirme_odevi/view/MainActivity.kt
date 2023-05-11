package com.omersungur.bitirme_odevi.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.omersungur.bitirme_odevi.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*window.decorView.rootView.setOnTouchListener(View.OnTouchListener { v, event ->
            return@OnTouchListener true
        })*/
    }

    fun playButton(view : View) {
        val intent = Intent(this,PlayActivity::class.java)
        startActivity(intent)
    }

    fun learnButton(view : View) {
        val intent = Intent(this,LearnActivity::class.java)
        startActivity(intent)
    }

    fun playAllButton(view : View) {
        val intent = Intent(this,PlayAllActivity::class.java)
        startActivity(intent)
    }
}