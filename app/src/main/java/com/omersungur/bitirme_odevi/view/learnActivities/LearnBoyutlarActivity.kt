package com.omersungur.bitirme_odevi.view.learnActivities

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.omersungur.bitirme_odevi.R

class LearnBoyutlarActivity : AppCompatActivity() {

    private lateinit var player : MediaPlayer
    private lateinit var player2 : MediaPlayer
    private lateinit var player3 : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_boyutlar)

        player = MediaPlayer.create(this, R.raw.buyukk)
        player2 = MediaPlayer.create(this, R.raw.ortaa)
        player3 = MediaPlayer.create(this, R.raw.kucukk)
    }

    fun buyukPortakal(view: View) {
        player.start()
    }
    fun kucukPortakal(view: View) {
        player3.start()
    }
    fun ortaPortakal(view: View) {
        player2.start()
    }
}