package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val dice1 = Dice(6)
    private val luckyNumber = 4
    var rolledNum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val txtResult : TextView = findViewById(R.id.textView)
        val diceImage: ImageView = findViewById(R.id.imageView)
        val btnRoll: Button = findViewById(R.id.button)

        btnRoll.setOnClickListener {

            val rollResult = dice1.roll()

            when (rollResult) {

                luckyNumber -> {

                    diceImage.setImageResource(R.drawable.dice_4)
                    Toast.makeText(this, "You won!", Toast.LENGTH_LONG).show()
                    rolledNum = 0
                }
                1 -> {

                    diceImage.setImageResource(R.drawable.dice_1)
                    rolledNum += 1
                    Toast.makeText(this, "So sorry! You rolled a $rolledNum. Try again!", Toast.LENGTH_SHORT).show()
                }
                2 -> {

                    diceImage.setImageResource(R.drawable.dice_2)
                    rolledNum += 1
                    Toast.makeText(this, "So sorry! You rolled a $rolledNum. Try again!", Toast.LENGTH_SHORT).show()
                }
                3 -> {

                    diceImage.setImageResource(R.drawable.dice_3)
                    rolledNum += 1
                    Toast.makeText(this, "So sorry! You rolled a $rolledNum. Try again!", Toast.LENGTH_SHORT).show()
                }
                5 -> {

                    diceImage.setImageResource(R.drawable.dice_5)
                    rolledNum += 1
                    Toast.makeText(this, "So sorry! You rolled a $rolledNum. Try again!", Toast.LENGTH_SHORT).show()
                }
                6 -> {

                    diceImage.setImageResource(R.drawable.dice_6)
                    rolledNum += 1
                    Toast.makeText(this, "So sorry! You rolled a $rolledNum. Try again!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}