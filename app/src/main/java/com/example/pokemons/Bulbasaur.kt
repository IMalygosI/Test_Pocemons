package com.example.pokemons

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Bulbasaur : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bulbasaur)

        val dalee: ImageView = findViewById(R.id.dalee)
        val exitButton: ImageView = findViewById(R.id.exitButton)

        dalee.setOnClickListener { view ->
            val intent = Intent(this@Bulbasaur, Charmander::class.java)
            startActivity(intent)
            finish()
        }
        exitButton.setOnClickListener { view ->
            val intent = Intent(this@Bulbasaur, SortByNumber::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this).apply {
            setTitle("Подтверждение выхода")
            setMessage("Вы уверены, что хотите выйти?")
            setPositiveButton("Да") { dialog, which ->
                super.onBackPressed()
            }
            setNegativeButton("Нет") { dialog, which ->
            }
            setCancelable(true)
        }.create().show()
    }
}