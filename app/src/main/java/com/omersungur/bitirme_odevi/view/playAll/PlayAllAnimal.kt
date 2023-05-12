package com.omersungur.bitirme_odevi.view.playAll

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.omersungur.bitirme_odevi.R
import com.omersungur.bitirme_odevi.common.Sayilar
import com.omersungur.bitirme_odevi.view.playActivities.PlayAnimalActivity
import java.util.Random

class PlayAllAnimal : AppCompatActivity() {
    private lateinit var player: MediaPlayer
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
    private var selectedAnimal = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_animal)

        playerD = MediaPlayer.create(this, R.raw.dogru_hayvan)
        playerY = MediaPlayer.create(this, R.raw.yanliss)


        player2 = MediaPlayer.create(this, R.raw.voice_cat)
        player3 = MediaPlayer.create(this, R.raw.voice_bee)
        player4 = MediaPlayer.create(this, R.raw.voice_elephant)
        player5 = MediaPlayer.create(this, R.raw.voice_dog)
        player6 = MediaPlayer.create(this, R.raw.voice_horse)
        player7 = MediaPlayer.create(this, R.raw.voice_frog)
        player8 = MediaPlayer.create(this, R.raw.voice_chicken)
        player9 = MediaPlayer.create(this, R.raw.voice_monkey)
        player10 = MediaPlayer.create(this, R.raw.voice_cow)
        player11 = MediaPlayer.create(this, R.raw.voice_lion)

        val animalVoiceList = listOf(
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

        val selectedMediaPlayer = animalVoiceList[randomNumber]
        selectedMediaPlayer.start()

        if (randomNumber == 0) {
            selectedAnimal = "Kedi"
        } else if (randomNumber == 1) {
            selectedAnimal = "Arı"
        } else if (randomNumber == 2) {
            selectedAnimal = "Fil"
        } else if (randomNumber == 3) {
            selectedAnimal = "Köpek"
        } else if (randomNumber == 4) {
            selectedAnimal = "At"
        } else if (randomNumber == 5) {
            selectedAnimal = "Kurbağa"
        } else if (randomNumber == 6) {
            selectedAnimal = "Tavuk"
        } else if (randomNumber == 7) {
            selectedAnimal = "Maymun"
        } else if (randomNumber == 8) {
            selectedAnimal = "İnek"
        } else {
            selectedAnimal = "Aslan"
        }

        player = MediaPlayer.create(this, R.raw.sescikaran_hayvani_sec)
        Handler().postDelayed({
            player.start()
        }, 2000)

    }

    private fun changeActivity() {
        Handler().postDelayed({
            val intent = Intent(this@PlayAllAnimal, PlayAllVehicle::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

    fun voiceBeePlay(view: View) {
        if (selectedAnimal == "Arı") {
            playerD = MediaPlayer.create(this, R.raw.dogru_hayvan)
            playerD.start()
            Sayilar.dogru++
            changeActivity()

        } else {
            playerY = MediaPlayer.create(this, R.raw.yanlis_hayvan)
            playerY.start()
            changeActivity()
        }
    }

    fun voiceCatPlay(view: View) {
        if (selectedAnimal == "Kedi") {
            playerD.start()
            Sayilar.dogru++
            changeActivity()

        } else {
            playerY.start()
            changeActivity()
        }
    }
    fun voiceElephantPlay(view: View) {
        if (selectedAnimal == "Fil") {
            playerD.start()
            Sayilar.dogru++
            changeActivity()

        } else {
            playerY.start()
            changeActivity()
        }
    }
    fun voiceDogPlay(view: View) {
        if (selectedAnimal == "Köpek") {
            playerD.start()
            Sayilar.dogru++
            changeActivity()

        } else {
            playerY.start()
            changeActivity()
        }
    }
    fun voiceHorsePlay(view: View) {
        if (selectedAnimal == "At") {
            playerD.start()
            Sayilar.dogru++
            changeActivity()

        } else {
            playerY.start()
            changeActivity()
        }
    }
    fun voiceFrogPlay(view: View) {
        if (selectedAnimal == "Kurbağa") {
            playerD.start()
            Sayilar.dogru++
            changeActivity()

        } else {
            playerY.start()
            changeActivity()
        }
    }
    fun voiceChickenPlay(view: View) {
        if (selectedAnimal == "Tavuk") {
            playerD.start()
            Sayilar.dogru++
            changeActivity()

        } else {
            playerY.start()
            changeActivity()
        }
    }
    fun voiceMonkeyPlay(view: View) {
        if (selectedAnimal == "Maymun") {
            playerD.start()
            Sayilar.dogru++
            changeActivity()

        } else {
            playerY.start()
            changeActivity()
        }
    }
    fun voiceCowPlay(view: View) {
        if (selectedAnimal == "İnek") {
            playerD.start()
            Sayilar.dogru++
            changeActivity()

        } else {
            playerY.start()
            changeActivity()
        }
    }
    fun voiceLionPlay(view: View) {
        if (selectedAnimal == "Aslan") {
            playerD.start()
            Sayilar.dogru++
            changeActivity()

        } else {
            playerY.start()
            changeActivity()
        }
    }
}