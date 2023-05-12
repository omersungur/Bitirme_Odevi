package com.omersungur.bitirme_odevi.view.playAll

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.omersungur.bitirme_odevi.R
import com.omersungur.bitirme_odevi.view.playActivities.PlayJobsActivity
import java.util.Random

class PlayAllJobs : AppCompatActivity() {

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
    private var selectedJob = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_all_jobs)
        playerD = MediaPlayer.create(this, R.raw.dogru_meslek)
        playerY = MediaPlayer.create(this, R.raw.yanliss)


        player2 = MediaPlayer.create(this, R.raw.polis_sec)
        player3 = MediaPlayer.create(this, R.raw.postaci_sec)
        player4 = MediaPlayer.create(this, R.raw.sarkici_sec)
        player5 = MediaPlayer.create(this, R.raw.teknisyen_sec)
        player6 = MediaPlayer.create(this, R.raw.pilot_sec)
        player7 = MediaPlayer.create(this, R.raw.tamirci_sec)
        player8 = MediaPlayer.create(this, R.raw.asker_sec)
        player9 = MediaPlayer.create(this, R.raw.ogretmen_sec)
        player10 = MediaPlayer.create(this, R.raw.doktor_sec)
        player11 = MediaPlayer.create(this, R.raw.haberci_seb)

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

        when (randomNumber) {
            0 -> {
                selectedJob = "Polis"
            }

            1 -> {
                selectedJob = "Postacı"
            }

            2 -> {
                selectedJob = "Şarkıcı"
            }

            3 -> {
                selectedJob = "Teknisyen"
            }

            4 -> {
                selectedJob = "Pilot"
            }

            5 -> {
                selectedJob = "Tamirci"
            }

            6 -> {
                selectedJob = "Asker"
            }

            7 -> {
                selectedJob = "Öğretmen"
            }

            8 -> {
                selectedJob = "Doktor"
            }

            9 -> {
                selectedJob = "Haberci"
            }
        }
    }
    private fun changeA() {
        Handler().postDelayed({
            val intent = Intent(this@PlayAllJobs, ScoreActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

    fun voicePolicePlay(view: View) {
        if (selectedJob == "Police") {
            playerD.start()
            changeA()
        } else {
            playerY.start()
            changeA()

        }
    }
    fun voicePostmanPlay(view: View) {
        if (selectedJob == "Postacı") {
            playerD.start()
            changeA()
        } else {
            playerY.start()
            changeA()

        }
    }
    fun voiceSingerPlay(view: View) {
        if (selectedJob == "Şarkıcı") {
            playerD.start()
            changeA()
        } else {
            playerY.start()
            changeA()

        }
    }
    fun voiceTechPlay(view: View) {
        if (selectedJob == "Teknisyen") {
            playerD.start()
            changeA()
        } else {
            playerY.start()
            changeA()

        }
    }
    fun voicePilotPlay(view: View) {
        if (selectedJob == "Pilot") {
            playerD.start()
            changeA()
        } else {
            playerY.start()
            changeA()

        }
    }
    fun voiceMechanicPlay(view: View) {
        if (selectedJob == "Tamirci") {
            playerD.start()
            changeA()
        } else {
            playerY.start()
            changeA()

        }
    }
    fun voiceSoldierPlay(view: View) {
        if (selectedJob == "Asker") {
            playerD.start()
            changeA()
        } else {
            playerY.start()
            changeA()

        }
    }
    fun voiceTeacherPlay(view: View) {
        if (selectedJob == "Öğretmen") {
            playerD.start()
            changeA()
        } else {
            playerY.start()
            changeA()

        }
    }
    fun voiceDoctorPlay(view: View) {
        if (selectedJob == "Doktor") {
            playerD.start()
            changeA()
        } else {
            playerY.start()
            changeA()

        }
    }
    fun voiceReporterPlay(view: View) {
        if (selectedJob == "Haberci") {
            playerD.start()
            changeA()
        } else {
            playerY.start()
            changeA()

        }
    }
}