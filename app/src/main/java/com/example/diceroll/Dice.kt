package com.example.diceroll

class Dice(var side : Int) {

    fun roll() : Int {

        return (1..side).random()
    }
}