package com.revo.tugas5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnsuhu :Button
    private lateinit var btnhitung : Button
    private lateinit var btnruang : Button
    private lateinit var btnbilangan : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnsuhu = findViewById(R.id.btnsuhu)
        btnhitung = findViewById(R.id.btnhitung)
        btnruang = findViewById(R.id.btnruang)
        btnbilangan = findViewById(R.id.btnbilangan)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        btnsuhu.setOnClickListener() {
            val intent = Intent(this@MainActivity, KonversiSuhu::class.java)
            startActivity(intent)
        }

        btnhitung.setOnClickListener() {
            val intent = Intent(this@MainActivity, DiskonBelanja::class.java)
            startActivity(intent)
        }

        btnruang.setOnClickListener() {
            val intent = Intent(this@MainActivity, BangunRuang::class.java)
            startActivity(intent)
        }

        btnbilangan.setOnClickListener() {
            val intent = Intent(this@MainActivity, Bilangan::class.java)
            startActivity(intent)
        }
    }
}