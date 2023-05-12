package com.omersungur.bitirme_odevi.view.playAll

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.omersungur.bitirme_odevi.R
import com.omersungur.bitirme_odevi.common.Sayilar
import java.util.Random

class PlayAllVehicle : AppCompatActivity() {

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
    private var selectedVehicle = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_all_vehicle)

        playerD = MediaPlayer.create(this, R.raw.dogru_tasit)
        playerY = MediaPlayer.create(this, R.raw.yanliss)

        player2 = MediaPlayer.create(this, R.raw.ekran_otobus)
        player3 = MediaPlayer.create(this, R.raw.ekran_ambulans)
        player4 = MediaPlayer.create(this, R.raw.ekran_araba)
        player5 = MediaPlayer.create(this, R.raw.ekran_helikopter)
        player6 = MediaPlayer.create(this, R.raw.ekran_motosiklet)
        player7 = MediaPlayer.create(this, R.raw.ekran_ucak)
        player8 = MediaPlayer.create(this, R.raw.ekran_gemi)
        player9 = MediaPlayer.create(this, R.raw.ekran_kamyon)
        player10 = MediaPlayer.create(this, R.raw.ekran_minibus)
        player11 = MediaPlayer.create(this, R.raw.ekran_bisiklet)

        val vehicleVoiceList = listOf(
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

        val selectedMediaPlayer = vehicleVoiceList[randomNumber]
        selectedMediaPlayer.start()

        when(randomNumber) {
            0 -> {
                selectedVehicle = "Otobüs"
            }
            1 -> {
                selectedVehicle = "Ambulans"
            }
            2 -> {
                selectedVehicle = "Araba"
            }
            3 -> {
                selectedVehicle = "Helikopter"
            }
            4 -> {
                selectedVehicle = "Motosiklet"
            }
            5 -> {
                selectedVehicle = "Uçak"
            }
            6 -> {
                selectedVehicle = "Gemi"
            }
            7 -> {
                selectedVehicle = "Kamyon"
            }
            8 -> {
                selectedVehicle = "Minibüs"
            }
            9 -> {
                selectedVehicle = "Bisiklet"
            }
        }
    }

    fun changeActiv() {
        Handler().postDelayed({
            val intent = Intent(this@PlayAllVehicle, PlayAllBoyutlar::class.java)
            startActivity(intent)
            finish()
        }, 3500)
    }

    fun vehicleBusPlay(view: View) {
        if (selectedVehicle == "Otobüs") {
            playerD.start()
            Sayilar.dogru++
            changeActiv()
        } else {
            playerY.start()
            changeActiv()

        }
    }
    fun vehicleAmbulancePlay(view: View) {
        if (selectedVehicle == "Ambulans") {
            playerD.start()
            Sayilar.dogru++
            changeActiv()

        } else {
            playerY.start()
            changeActiv()

        }
    }
    fun vehicleCarPlay(view: View) {
        if (selectedVehicle == "Araba") {
            playerD.start()
            Sayilar.dogru++
            changeActiv()
        } else {
            playerY.start()
            changeActiv()

        }
    }
    fun vehicleHelicopterPlay(view: View) {
        if (selectedVehicle == "Helikopter") {
            playerD.start()
            Sayilar.dogru++
            changeActiv()
        } else {
            playerY.start()
            changeActiv()

        }
    }
    fun vehicleMotorcyclePlay(view: View) {
        if (selectedVehicle == "Motosiklet") {
            playerD.start()
            Sayilar.dogru++
            changeActiv()
        } else {
            playerY.start()
            changeActiv()

        }
    }
    fun vehiclePlanePlay(view: View) {
        if (selectedVehicle == "Uçak") {
            playerD.start()
            Sayilar.dogru++
            changeActiv()
        } else {
            playerY.start()
            changeActiv()
        }
    }
    fun vehicleShipPlay(view: View) {
        if (selectedVehicle == "Gemi") {
            playerD.start()
            Sayilar.dogru++
            changeActiv()
        } else {
            playerY.start()
            changeActiv()
        }
    }
    fun vehicleTruckPlay(view: View) {
        if (selectedVehicle == "Kamyon") {
            playerD.start()
            Sayilar.dogru++
            changeActiv()
        } else {
            playerY.start()
            changeActiv()
        }
    }
    fun vehicleBicyclePlay(view: View) {
        if (selectedVehicle == "Bisiklet") {
            playerD.start()
            Sayilar.dogru++
            changeActiv()
        } else {
            playerY.start()
            changeActiv()
        }
    }
    fun vehicleVanPlay(view: View) {
        if (selectedVehicle == "Minibüs") {
            playerD.start()
            Sayilar.dogru++
            changeActiv()
        } else {
            playerY.start()
            changeActiv()
        }
    }
}