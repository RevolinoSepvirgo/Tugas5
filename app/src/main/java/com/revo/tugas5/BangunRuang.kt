package com.revo.tugas5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BangunRuang : AppCompatActivity() {


    private lateinit var etPanjang : EditText
    private lateinit var etLebar : EditText
    private lateinit var etTinggi : EditText
    private lateinit var btnLuas : Button
    private lateinit var btnVolume : Button
    private lateinit var txtHasil : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bangun_ruang)

        etPanjang = findViewById(R.id.etPanjang)
        etLebar = findViewById(R.id.etLebar)
        etTinggi = findViewById(R.id.etTinggi)
        btnLuas= findViewById(R.id.btnLuas)
        btnVolume = findViewById(R.id.btnVolume)
        txtHasil = findViewById(R.id.txtHasil)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLuas.setOnClickListener() {
            val panjang = etPanjang.text.toString().toInt()
            val lebar = etLebar.text.toString().toInt()
            val tinggi = etTinggi.text.toString().toInt()
            val hasil = 2 * ( panjang * lebar + panjang * tinggi + lebar * tinggi )
            txtHasil.setText("Luas Permukaan Balok adalah " + hasil)
        }

        btnVolume.setOnClickListener() {
            val panjang = etPanjang.text.toString().toInt()
            val lebar = etLebar.text.toString().toInt()
            val tinggi = etTinggi.text.toString().toInt()
            val hasil = panjang * lebar * tinggi
            txtHasil.setText("Volume Balok adalah " + hasil)
        }
    }
}