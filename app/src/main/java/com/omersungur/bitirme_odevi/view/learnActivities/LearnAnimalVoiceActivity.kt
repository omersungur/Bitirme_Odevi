package com.omersungur.bitirme_odevi.view.learnActivities

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.omersungur.bitirme_odevi.R

class LearnAnimalVoiceActivity : AppCompatActivity() {

    private lateinit var player : MediaPlayer
    private lateinit var player2 : MediaPlayer
    private lateinit var handler : Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_animal_voice)
    }

    fun voiceCat(view: View) {
        player = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.animal_voice_kedi)

        Handler().postDelayed({
            player.start()
        }, 2500)

        player2 = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.voice_cat)
        player2.start()

    }

    fun voiceBee(view: View) {
        player = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.animal_voice_ari)
        Handler().postDelayed({
            player.start()
        }, 2000)

        player2 = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.voice_bee)
        player2.start()
    }
    fun voiceElephant(view: View) {
        player = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.animal_voice_fil)
        Handler().postDelayed({
            player.start()
        }, 2000)

        player2 = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.voice_elephant)
        player2.start()
    }
    fun voiceDog(view: View) {
        player = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.animal_voice_kopek)
        Handler().postDelayed({
            player.start()
        }, 2000)

        player2 = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.voice_dog)
        player2.start()
    }
    fun voiceHorse(view: View) {
        player = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.animal_voice_at)
        Handler().postDelayed({
            player.start()
        }, 2000)

        player2 = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.voice_horse)
        player2.start()
    }
    fun voiceFrog(view: View) {
        player = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.animal_voice_kurbaga)
        Handler().postDelayed({
            player.start()
        }, 2000)

        player2 = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.voice_frog)
        player2.start()
    }
    fun voiceChicken(view: View) {
        player = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.animal_voice_chicken)
        Handler().postDelayed({
            player.start()
        }, 2000)

        player2 = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.voice_chicken)
        player2.start()
    }
    fun voiceMonkey(view: View) {
        player = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.animal_voice_maymun)
        Handler().postDelayed({
            player.start()
        }, 2000)

        player2 = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.voice_monkey)
        player2.start()
    }
    fun voiceCow(view: View) {
        player = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.animal_voice_inek)
        Handler().postDelayed({
            player.start()
        }, 2000)

        player2 = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.voice_cow)
        player2.start()
    }
    fun voiceLion(view: View) {
        player = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.animal_voice_aslan)
        Handler().postDelayed({
            player.start()
        }, 2000)

        player2 = MediaPlayer.create(this@LearnAnimalVoiceActivity,R.raw.voice_lion)
        player2.start()
    }
}