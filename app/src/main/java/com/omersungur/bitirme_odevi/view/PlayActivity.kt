package com.omersungur.bitirme_odevi.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.omersungur.bitirme_odevi.R
import com.omersungur.bitirme_odevi.view.learnActivities.LearnNumbersActivity
import com.omersungur.bitirme_odevi.view.learnActivities.LearnVehicleActivity
import com.omersungur.bitirme_odevi.view.playActivities.PlayAnimalActivity
import com.omersungur.bitirme_odevi.view.playActivities.PlayBoyutlarActivity
import com.omersungur.bitirme_odevi.view.playActivities.PlayFruitActivity
import com.omersungur.bitirme_odevi.view.playActivities.PlayNumbersActivity
import com.omersungur.bitirme_odevi.view.playActivities.PlayVehicleActivity

class PlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)
    }

    fun playNum(view: View) {
        val intent = Intent(this, PlayNumbersActivity::class.java)
        startActivity(intent)
    }

    fun playAnimal(view : View) {
        val intent = Intent(this, PlayAnimalActivity::class.java)
        startActivity(intent)
    }

    fun playBoyutlar(view: View) {
        val intent = Intent(this, PlayBoyutlarActivity::class.java)
        startActivity(intent)
    }

    fun playVehicle(view: View) {
        val intent = Intent(this, PlayVehicleActivity::class.java)
        startActivity(intent)
    }

    fun playFruit(view: View) {
        val intent = Intent(this, PlayFruitActivity::class.java)
        startActivity(intent)
    }
}