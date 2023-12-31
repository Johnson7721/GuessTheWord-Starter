package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel
class GameViewModel : ViewModel() {

    // The current word
    var word = ""

    // The current score
     var score = 0



    private lateinit var wordList: MutableList<String>

    private fun resetList() {
        wordList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
        wordList.shuffle()
    }

    private fun nextWord() {
        if (!wordList.isEmpty()) {
            //Select and remove a word from the list
            word = wordList.removeAt(0)
        }

    }





    /** Methods for buttons presses **/
    init {
        resetList()
        nextWord()
        Log.i("GameViewModel", "GameViewModel created!")
    }

     fun onSkip() {
         score--
    nextWord()


    }

     fun onCorrect() {
         score++
       nextWord()
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed!")
    }
}