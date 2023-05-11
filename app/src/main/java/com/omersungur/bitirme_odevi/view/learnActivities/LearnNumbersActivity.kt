package com.omersungur.bitirme_odevi.view.learnActivities

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.omersungur.bitirme_odevi.R

class LearnNumbersActivity : AppCompatActivity() {

    private lateinit var player : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_numbers)
    }

    fun numberOne(view : View) {

        player = MediaPlayer.create(this,R.raw.bir)

        player.start()
    }

    fun numberTwo(view : View) {

        player = MediaPlayer.create(this,R.raw.iki)

        player.start()
    }

    fun numberThree(view : View) {

        player = MediaPlayer.create(this,R.raw.uc)

        player.start()
    }

    fun numberFour(view : View) {

        player = MediaPlayer.create(this,R.raw.dort)

        player.start()
    }

    fun numberFive(view : View) {

        player = MediaPlayer.create(this,R.raw.bes)

        player.start()
    }

    fun numberSix(view : View) {

        player = MediaPlayer.create(this,R.raw.alti)

        player.start()
    }

    fun numberSeven(view : View) {

        player = MediaPlayer.create(this,R.raw.yedi)

        player.start()
    }

    fun numberEight(view : View) {

        player = MediaPlayer.create(this,R.raw.sekiz)

        player.start()
    }

    fun numberNine(view : View) {

        player = MediaPlayer.create(this,R.raw.dokuz)

        player.start()
    }

    fun numberTen(view : View) {

        player = MediaPlayer.create(this,R.raw.on)

        player.start()
    }
}