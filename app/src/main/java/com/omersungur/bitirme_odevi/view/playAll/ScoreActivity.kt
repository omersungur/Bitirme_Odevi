package com.omersungur.bitirme_odevi.view.playAll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.omersungur.bitirme_odevi.R
import com.omersungur.bitirme_odevi.common.Sayilar.dogru
import com.omersungur.bitirme_odevi.view.MainActivity
import kotlinx.android.synthetic.main.activity_score.anaEkranButton
import kotlinx.android.synthetic.main.activity_score.scoreText

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        scoreText.text = "SCORE: $dogru/6"
        anaEkranButton.setOnClickListener {
            val intent = Intent(this@ScoreActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}