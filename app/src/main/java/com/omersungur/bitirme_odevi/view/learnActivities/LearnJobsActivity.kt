package com.omersungur.bitirme_odevi.view.learnActivities

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.omersungur.bitirme_odevi.R

class LearnJobsActivity : AppCompatActivity() {

    private lateinit var player : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_jobs)
    }

    fun voicePoliceLearn(view: View) {
        player = MediaPlayer.create(this@LearnJobsActivity,R.raw.polis)
        player.start()
    }
    fun voicePostmanLearn(view: View) {
        player = MediaPlayer.create(this@LearnJobsActivity,R.raw.postaci)
        player.start()
    }
    fun voiceTechLearn(view: View) {
        player = MediaPlayer.create(this@LearnJobsActivity,R.raw.teknisyen)
        player.start()
    }
    fun voicePilotLearn(view: View) {
        player = MediaPlayer.create(this@LearnJobsActivity,R.raw.pilot)
        player.start()
    }
    fun voiceMechanicLearn(view: View) {
        player = MediaPlayer.create(this@LearnJobsActivity,R.raw.tamirci)
        player.start()
    }
    fun voiceSoldierLearn(view: View) {
        player = MediaPlayer.create(this@LearnJobsActivity,R.raw.asker)
        player.start()
    }
    fun voiceSoldierTeacher(view: View) {
        player = MediaPlayer.create(this@LearnJobsActivity,R.raw.ogretmen)
        player.start()
    }
    fun voiceDoctorLearn(view: View) {
        player = MediaPlayer.create(this@LearnJobsActivity,R.raw.doktor)
        player.start()
    }
    fun voiceReporterLearn(view: View) {
        player = MediaPlayer.create(this@LearnJobsActivity,R.raw.haberci)
        player.start()
    }

    fun voiceSingerLearn(view: View) {
        player = MediaPlayer.create(this@LearnJobsActivity,R.raw.sarkici)
        player.start()
    }
}