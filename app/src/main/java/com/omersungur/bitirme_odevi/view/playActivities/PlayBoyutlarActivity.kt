package com.omersungur.bitirme_odevi.view.playActivities

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.omersungur.bitirme_odevi.R
import java.util.Random

class PlayBoyutlarActivity : AppCompatActivity() {

    private lateinit var player : MediaPlayer
    private lateinit var player2 : MediaPlayer
    private lateinit var player3 : MediaPlayer
    private lateinit var playerD: MediaPlayer
    private lateinit var playerY: MediaPlayer
    var selectedCar = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_boyutlar)

        playerD = MediaPlayer.create(this, R.raw.dogru_araba)
        playerY = MediaPlayer.create(this, R.raw.yanlis_araba)

        player = MediaPlayer.create(this, R.raw.buyuk_araba)
        player2 = MediaPlayer.create(this, R.raw.orta_araba)
        player3 = MediaPlayer.create(this, R.raw.kucuk_araba_sec)

        val carList = listOf(
            player,
            player2,
            player3,
        )
        val rand = Random()
        val randomNumber: Int = rand.nextInt(3)

        val selectedMediaPlayer = carList[randomNumber]
        selectedMediaPlayer.start()

        when(randomNumber) {
            0 -> {
                selectedCar = "Büyük"
            }
            1 -> {
                selectedCar = "Orta"
            }
            2 -> {
                selectedCar = "Küçük"
            }
        }

    }

    private fun restartAct() {
        Handler().postDelayed({
            val intent = Intent(this@PlayBoyutlarActivity, PlayBoyutlarActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

    fun playBuyukAraba(view: View) {
        if (selectedCar == "Büyük") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
    fun playOrtaAraba(view: View) {
        if (selectedCar == "Orta") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
    fun playKucukAraba(view: View) {
        if (selectedCar == "Küçük") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
}