package com.example.dicerecap

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var mp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.imageDice)
        mp = MediaPlayer.create(this, R.raw.dice_roll)
        val btnRow = findViewById<Button>(R.id.btnRow)


        btnRow.setOnClickListener {
            rowDice()
            mp.start()
        }
    }

    private fun rowDice() {
        val random = Random.nextInt(6) + 1
        val allDrawables = when (random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

        diceImage.setImageResource(allDrawables).toString()
    }


}
