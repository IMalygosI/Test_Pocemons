package com.example.pokemons

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Aron  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aron)

        val nazad: ImageView = findViewById(R.id.nazad)
        val exitButton: ImageView = findViewById(R.id.exitButton)

        nazad.setOnClickListener { view ->
            val intent = Intent(this, Mew::class.java)
            startActivity(intent)
            finish()
        }

        exitButton.setOnClickListener { view ->
            val intent = Intent(this, SortByNumber::class.java)
            startActivity(intent)
            finish()
        }
    }
}