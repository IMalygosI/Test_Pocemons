package com.example.pokemons

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.PopupMenu
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class SortByNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sort_by_number)

        val sortButton: ImageButton = findViewById(R.id.Sort_Button)

        val Bulbasaur1: ImageButton = findViewById(R.id.Bulbasaur)
        val Charmander1: ImageButton = findViewById(R.id.Charmander)
        val Squirtle1: ImageButton = findViewById(R.id.Squirtle)
        val Butterfree1: ImageButton = findViewById(R.id.Butterfree)
        val Pikapikachu1: ImageButton = findViewById(R.id.Pikapikachu)
        val Ditto1: ImageButton = findViewById(R.id.Ditto)
        val Mew1: ImageButton = findViewById(R.id.Mew)
        val Aron1: ImageButton = findViewById(R.id.Aron)
        val Gastly1: ImageButton = findViewById(R.id.Gastly)

        sortButton.setOnClickListener { view ->
            val popupMenu = PopupMenu(this@SortByNumber, view)
            popupMenu.inflate(R.menu.sort_by)
            popupMenu.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.Number -> {
                        // Нет необходимости запускать SortByName, так как мы уже здесь
                        true
                    }
                    R.id.Name -> {
                        val intent = Intent(this@SortByNumber, SortByName::class.java)
                        startActivity(intent)
                        finish()
                        true
                    }
                    else -> false
                }
            }
            popupMenu.show()
        }

        Bulbasaur1.setOnClickListener { view ->
            val intent = Intent(this@SortByNumber, Bulbasaur::class.java)
            startActivity(intent)
            finish()
        }

        Charmander1.setOnClickListener { view ->
            val intent = Intent(this@SortByNumber, Charmander::class.java)
            startActivity(intent)
            finish()
        }

        Butterfree1.setOnClickListener { view ->
            val intent = Intent(this@SortByNumber, Butterfly::class.java)
            startActivity(intent)
            finish()
        }

        Pikapikachu1.setOnClickListener { view ->
            val intent = Intent(this@SortByNumber, Pika::class.java)
            startActivity(intent)
            finish()
        }

        Squirtle1.setOnClickListener { view ->
            val intent = Intent(this@SortByNumber, Squirtle::class.java)
            startActivity(intent)
            finish()
        }

        Gastly1.setOnClickListener { view ->
            val intent = Intent(this@SortByNumber, Gastly::class.java)
            startActivity(intent)
            finish()
        }

        Ditto1.setOnClickListener { view ->
            val intent = Intent(this@SortByNumber, Ditto::class.java)
            startActivity(intent)
            finish()
        }

        Mew1.setOnClickListener { view ->
            val intent = Intent(this@SortByNumber, Mew::class.java)
            startActivity(intent)
            finish()
        }

        Aron1.setOnClickListener { view ->
            val intent = Intent(this@SortByNumber, Aron::class.java)
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