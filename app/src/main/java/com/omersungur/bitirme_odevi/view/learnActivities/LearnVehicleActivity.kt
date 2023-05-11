package com.omersungur.bitirme_odevi.view.learnActivities

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.omersungur.bitirme_odevi.R

class LearnVehicleActivity : AppCompatActivity() {

    private lateinit var player : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_vehicle)
    }

    fun vehicleBus(view: View) {
        player = MediaPlayer.create(this@LearnVehicleActivity,R.raw.otobus)
        player.start()
    }
    fun vehicleAmbulance(view: View) {
        player = MediaPlayer.create(this@LearnVehicleActivity,R.raw.ambulans)
        player.start()
    }
    fun vehicleCar(view: View) {
        player = MediaPlayer.create(this@LearnVehicleActivity,R.raw.araba)
        player.start()
    }
    fun vehicleHelicopter(view: View) {
        player = MediaPlayer.create(this@LearnVehicleActivity,R.raw.helikopter)
        player.start()
    }

    fun vehicleMotorcycle(view: View) {
        player = MediaPlayer.create(this@LearnVehicleActivity,R.raw.motosiklet)
        player.start()
    }
    fun vehiclePlane(view: View) {
        player = MediaPlayer.create(this@LearnVehicleActivity,R.raw.ucak)
        player.start()
    }
    fun vehicleShip(view: View) {
        player = MediaPlayer.create(this@LearnVehicleActivity,R.raw.gemi)
        player.start()
    }
    fun vehicleTruck(view: View) {
        player = MediaPlayer.create(this@LearnVehicleActivity,R.raw.kamyon)
        player.start()
    }
    fun vehicleVan(view: View) {
        player = MediaPlayer.create(this@LearnVehicleActivity,R.raw.minibus)
        player.start()
    }
    fun vehicleBicycle(view: View) {
        player = MediaPlayer.create(this@LearnVehicleActivity,R.raw.bisiklet)
        player.start()
    }
}