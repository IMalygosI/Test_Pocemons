package com.example.pokemons

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.PopupMenu
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class SortByName : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sort_by_name)

        val sortButton: ImageButton = findViewById(R.id.Sort_Button)

        val Bulbasaur2: ImageButton = findViewById(R.id.Bulbasaur)
        val Charmander2: ImageButton = findViewById(R.id.Charmander)
        val Squirtle2: ImageButton = findViewById(R.id.Squirtle)
        val Butterfree2: ImageButton = findViewById(R.id.Butterfree)
        val Pikapikachu2: ImageButton = findViewById(R.id.Pikapikachu)
        val Ditto2: ImageButton = findViewById(R.id.Ditto)
        val Mew2: ImageButton = findViewById(R.id.Mew)
        val Aron2: ImageButton = findViewById(R.id.Aron)
        val Gastly2: ImageButton = findViewById(R.id.Gastly)

        sortButton.setOnClickListener { view ->
            val popupMenu = PopupMenu(this@SortByName, view)
            popupMenu.inflate(R.menu.sort_by)
            popupMenu.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.Number -> {
                        val intent = Intent(this@SortByName, SortByNumber::class.java)
                        startActivity(intent)
                        finish()
                        true
                    }
                    R.id.Name -> {
                        // Нет необходимости запускать SortByName, так как мы уже здесь
                        true
                    }
                    else -> false
                }
            }
            popupMenu.show()
        }

        Bulbasaur2.setOnClickListener { view ->
            val intent = Intent(this@SortByName, Bulbasaur::class.java)
            startActivity(intent)
            finish()
        }

        Charmander2.setOnClickListener { view ->
            val intent = Intent(this@SortByName, Charmander::class.java)
            startActivity(intent)
            finish()
        }

        Butterfree2.setOnClickListener { view ->
            val intent = Intent(this@SortByName, Butterfly::class.java)
            startActivity(intent)
            finish()
        }

        Pikapikachu2.setOnClickListener { view ->
            val intent = Intent(this@SortByName, Pika::class.java)
            startActivity(intent)
            finish()
        }

        Squirtle2.setOnClickListener { view ->
            val intent = Intent(this@SortByName, Squirtle::class.java)
            startActivity(intent)
            finish()
        }

        Gastly2.setOnClickListener { view ->
            val intent = Intent(this@SortByName, Gastly::class.java)
            startActivity(intent)
            finish()
        }

        Ditto2.setOnClickListener { view ->
            val intent = Intent(this@SortByName, Ditto::class.java)
            startActivity(intent)
            finish()
        }

        Mew2.setOnClickListener { view ->
            val intent = Intent(this@SortByName, Mew::class.java)
            startActivity(intent)
            finish()
        }

        Aron2.setOnClickListener { view ->
            val intent = Intent(this@SortByName, Aron::class.java)
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
