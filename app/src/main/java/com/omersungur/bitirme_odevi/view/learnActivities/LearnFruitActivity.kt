package com.omersungur.bitirme_odevi.view.learnActivities

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.omersungur.bitirme_odevi.R

class LearnFruitActivity : AppCompatActivity() {

    private lateinit var player : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_fruit)
    }

    fun voiceApple(view: View) {
        player = MediaPlayer.create(this@LearnFruitActivity,R.raw.elma)
        player.start()
    }
    fun voiceLemon(view: View) {
        player = MediaPlayer.create(this@LearnFruitActivity,R.raw.limon)
        player.start()
    }
    fun voiceStrawberry(view: View) {
        player = MediaPlayer.create(this@LearnFruitActivity,R.raw.cilek)
        player.start()
    }
    fun voiceMelon(view: View) {
        player = MediaPlayer.create(this@LearnFruitActivity,R.raw.kavun)
        player.start()
    }
    fun voicePeach(view: View) {
        player = MediaPlayer.create(this@LearnFruitActivity,R.raw.seftali)
        player.start()
    }
    fun voicePear(view: View) {
        player = MediaPlayer.create(this@LearnFruitActivity,R.raw.armut)
        player.start()
    }
    fun voiceCherry(view: View) {
        player = MediaPlayer.create(this@LearnFruitActivity,R.raw.kiraz)
        player.start()
    }
    fun voiceWatermelon(view: View) {
        player = MediaPlayer.create(this@LearnFruitActivity,R.raw.karpuz)
        player.start()
    }
    fun voiceBanana(view: View) {
        player = MediaPlayer.create(this@LearnFruitActivity,R.raw.muz)
        player.start()
    }
    fun voiceOrange(view: View) {
        player = MediaPlayer.create(this@LearnFruitActivity,R.raw.portakal)
        player.start()
    }
}