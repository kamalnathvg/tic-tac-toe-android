package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GameBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_board)

        title = "New Game"


    }
}