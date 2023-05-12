package com.omersungur.bitirme_odevi.view.playActivities

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.omersungur.bitirme_odevi.R
import java.util.Random

class PlayFruitActivity : AppCompatActivity() {

    private lateinit var player : MediaPlayer
    private lateinit var player2: MediaPlayer
    private lateinit var player3: MediaPlayer
    private lateinit var player4: MediaPlayer
    private lateinit var player5: MediaPlayer
    private lateinit var player6: MediaPlayer
    private lateinit var player7: MediaPlayer
    private lateinit var player8: MediaPlayer
    private lateinit var player9: MediaPlayer
    private lateinit var player10: MediaPlayer
    private lateinit var player11: MediaPlayer
    private lateinit var playerD: MediaPlayer
    private lateinit var playerY: MediaPlayer
    private var selectedFruit = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_fruit)

        playerD = MediaPlayer.create(this, R.raw.dogru_meyve)
        playerY = MediaPlayer.create(this, R.raw.yanlis_meyve)


        player2 = MediaPlayer.create(this, R.raw.elma_sec)
        player3 = MediaPlayer.create(this, R.raw.limon_sec)
        player4 = MediaPlayer.create(this, R.raw.cilek_sec)
        player5 = MediaPlayer.create(this, R.raw.kavun_sec)
        player6 = MediaPlayer.create(this, R.raw.seftali_sec)
        player7 = MediaPlayer.create(this, R.raw.armut_sec)
        player8 = MediaPlayer.create(this, R.raw.kiraz_sec)
        player9 = MediaPlayer.create(this, R.raw.karpuz_sec)
        player10 = MediaPlayer.create(this, R.raw.muz_sec)
        player11 = MediaPlayer.create(this, R.raw.portakal_sec)

        val fruitVoiceList = listOf(
            player2,
            player3,
            player4,
            player5,
            player6,
            player7,
            player8,
            player9,
            player10,
            player11
        )
        val rand = Random()
        val randomNumber: Int = rand.nextInt(10)

        val selectedMediaPlayer = fruitVoiceList[randomNumber]
        selectedMediaPlayer.start()

        when(randomNumber) {
            0 -> {
                selectedFruit = "Elma"
            }
            1 -> {
                selectedFruit = "Limon"
            }
            2 -> {
                selectedFruit = "Çilek"
            }
            3 -> {
                selectedFruit = "Karpuz"
            }
            4 -> {
                selectedFruit = "Şeftali"
            }
            5 -> {
                selectedFruit = "Armut"
            }
            6 -> {
                selectedFruit = "Kiraz"
            }
            7 -> {
                selectedFruit = "Karpuz"
            }
            8 -> {
                selectedFruit = "Muz"
            }
            9 -> {
                selectedFruit = "Portakal"
            }
        }
    }

    private fun restartAct() {
        Handler().postDelayed({
            val intent = Intent(this@PlayFruitActivity, PlayFruitActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

    fun voiceApplePlay(view: View) {
        if (selectedFruit == "Elma") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
    fun voiceLemonPlay(view: View) {
        if (selectedFruit == "Limon") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
    fun voiceStrawberryPlay(view: View) {
        if (selectedFruit == "Çilek") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
    fun voiceMelonPlay(view: View) {
        if (selectedFruit == "Kavun") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
    fun voicePeachPlay(view: View) {
        if (selectedFruit == "Şeftali") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
    fun voicePearPlay(view: View) {
        if (selectedFruit == "Armut") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
    fun voiceCherryPlay(view: View) {
        if (selectedFruit == "Kiraz") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
    fun voiceWatermelonPlay(view: View) {
        if (selectedFruit == "Karpuz") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
    fun voiceBananaPlay(view: View) {
        if (selectedFruit == "Muz") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
    fun voiceOrangePlay(view: View) {
        if (selectedFruit == "Portakal") {
            playerD.start()
            restartAct()
        } else {
            playerY.start()

        }
    }
}