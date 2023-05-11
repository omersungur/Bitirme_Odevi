package com.omersungur.bitirme_odevi.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.omersungur.bitirme_odevi.view.learnActivities.LearnAnimalVoiceActivity
import com.omersungur.bitirme_odevi.view.learnActivities.LearnBoyutlarActivity
import com.omersungur.bitirme_odevi.view.learnActivities.LearnFruitActivity
import com.omersungur.bitirme_odevi.view.learnActivities.LearnNumbersActivity
import com.omersungur.bitirme_odevi.view.learnActivities.LearnVehicleActivity

class LearnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.omersungur.bitirme_odevi.R.layout.activity_learn)

    }

    fun learnNum(view: View) {
        val intent = Intent(this, LearnNumbersActivity::class.java)
        startActivity(intent)
    }
    fun learnAnimalVoice(view: View) {
        val intent = Intent(this, LearnAnimalVoiceActivity::class.java)
        startActivity(intent)
    }

    fun learnBoyutlar(view: View) {
        val intent = Intent(this, LearnBoyutlarActivity::class.java)
        startActivity(intent)
    }

    fun learnVehicle(view: View) {
        val intent = Intent(this, LearnVehicleActivity::class.java)
        startActivity(intent)
    }

    fun learnFruit(view: View) {
        val intent = Intent(this, LearnFruitActivity::class.java)
        startActivity(intent)
    }
}