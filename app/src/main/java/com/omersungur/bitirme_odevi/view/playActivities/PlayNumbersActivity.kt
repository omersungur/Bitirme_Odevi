package com.omersungur.bitirme_odevi.view.playActivities

import android.content.ClipData
import android.content.ClipDescription
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.view.DragEvent
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.omersungur.bitirme_odevi.R
import kotlinx.android.synthetic.main.activity_play_numbers.*
import java.util.Random

class PlayNumbersActivity : AppCompatActivity() {

    private val numberList = listOf("Bir","İki","Üç","Dört","Beş","Altı","Yedi","Sekiz","Dokuz")
    private var numberNamee = ""
    private var isNumSelected = false
    private lateinit var player : MediaPlayer
    private lateinit var handler : Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_numbers)

        val rand = Random()
        val randomNumber: Int = rand.nextInt(9)

        numberName.text = numberList[randomNumber]

        when(numberName.text) {
            "Bir" -> {
                player = MediaPlayer.create(this@PlayNumbersActivity,R.raw.birkutu)
                player.start()
            }
            "İki" -> {
                player = MediaPlayer.create(this@PlayNumbersActivity,R.raw.ikikutu)
                player.start()
            }
            "Üç" -> {
                player = MediaPlayer.create(this@PlayNumbersActivity,R.raw.uckutu)
                player.start()
            }
            "Dört" -> {
                player = MediaPlayer.create(this@PlayNumbersActivity,R.raw.dortkutu)
                player.start()
            }
            "Beş" -> {
                player = MediaPlayer.create(this@PlayNumbersActivity,R.raw.beskutu)
                player.start()
            }
            "Altı" -> {
                player = MediaPlayer.create(this@PlayNumbersActivity,R.raw.altikutu)
                player.start()
            }
            "Yedi" -> {
                player = MediaPlayer.create(this@PlayNumbersActivity,R.raw.yedikutu)
                player.start()
            }
            "Sekiz" -> {
                player = MediaPlayer.create(this@PlayNumbersActivity,R.raw.sekizkutu)
                player.start()
            }
            "Dokuz" -> {
                player = MediaPlayer.create(this@PlayNumbersActivity,R.raw.dokuzkutu)
                player.start()
            }

        }

        playNumConstraint.setOnDragListener(dragListenerOne)
        boxLayout.setOnDragListener(dragListenerOne)

        playNumber1.setOnLongClickListener {
            val clipText = "Başarılı!"
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText,mimeTypes,item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data,dragShadowBuilder,it,0)

            it.visibility = View.INVISIBLE
            numberNamee = "Bir"
            true
        }

        playNumber2.setOnLongClickListener {
            val clipText = "Başarılı!"
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText,mimeTypes,item)
            numberNamee = "İki"

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data,dragShadowBuilder,it,0)

            it.visibility = View.INVISIBLE
            true
        }

        playNumber3.setOnLongClickListener {
            val clipText = "Başarılı!"
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText,mimeTypes,item)
            numberNamee = "Üç"

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data,dragShadowBuilder,it,0)

            it.visibility = View.INVISIBLE
            true
        }

        playNumber4.setOnLongClickListener {
            val clipText = "Başarılı!"
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText,mimeTypes,item)
            numberNamee = "Dört"

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data,dragShadowBuilder,it,0)

            it.visibility = View.INVISIBLE
            true
        }

        playNumber5.setOnLongClickListener {
            val clipText = "Başarılı!"
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText,mimeTypes,item)
            numberNamee = "Beş"

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data,dragShadowBuilder,it,0)

            it.visibility = View.INVISIBLE
            true
        }

        playNumber6.setOnLongClickListener {
            val clipText = "Başarılı!"
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText,mimeTypes,item)
            numberNamee = "Altı"

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data,dragShadowBuilder,it,0)

            it.visibility = View.INVISIBLE
            true
        }

        playNumber7.setOnLongClickListener {
            val clipText = "Başarılı!"
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText,mimeTypes,item)
            numberNamee = "Yedi"

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data,dragShadowBuilder,it,0)

            it.visibility = View.INVISIBLE
            true
        }

        playNumber8.setOnLongClickListener {
            val clipText = "Başarılı!"
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText,mimeTypes,item)
            numberNamee = "Sekiz"

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data,dragShadowBuilder,it,0)

            it.visibility = View.INVISIBLE
            true
        }

        playNumber9.setOnLongClickListener {
            val clipText = "Başarılı!"
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText,mimeTypes,item)
            numberNamee = "Dokuz"

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data,dragShadowBuilder,it,0)

            it.visibility = View.INVISIBLE
            true
        }
    }

    val dragListenerOne = View.OnDragListener { view, event ->
        when(event.action) {
            DragEvent.ACTION_DRAG_STARTED -> {
                event.clipDescription.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)
            }
            DragEvent.ACTION_DRAG_ENTERED -> {
                view.invalidate()
                true
            }

            DragEvent.ACTION_DRAG_LOCATION -> true
            DragEvent.ACTION_DRAG_EXITED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DROP -> {
                //val item = event.clipData.getItemAt(0)
                //val dragData = item.text
                //Toast.makeText(this,dragData,Toast.LENGTH_LONG).show()

                view.invalidate()

                handler = Handler()

                if(numberNamee == numberName.text) {
                    val v = event.localState as View
                    val owner = v.parent as ViewGroup
                    owner.removeView(v)
                    val destination = view as ConstraintLayout
                    destination.addView(v)
                    v.visibility = View.VISIBLE
                    isNumSelected = true
                    player = MediaPlayer.create(this@PlayNumbersActivity,R.raw.dogru)
                    player.start()

                    Handler().postDelayed({
                        val intent = Intent(this@PlayNumbersActivity, PlayNumbersActivity::class.java)
                        startActivity(intent)
                        finish()
                    }, 4000)

                    true
                } else{
                    isNumSelected = false
                    player = MediaPlayer.create(this@PlayNumbersActivity,R.raw.yanlis)
                    player.start()
                    false
                }


            }
            DragEvent.ACTION_DRAG_ENDED -> {
                if(!isNumSelected) {
                    val v = event.localState as View
                    val owner = v.parent as ViewGroup
                    owner.removeView(v)
                    val destination = view as ConstraintLayout
                    destination.addView(v)
                    v.visibility = View.VISIBLE
                }
                view.invalidate()
                true
            }
            else -> false
        }
    }

}