package com.revo.tugas5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class KonversiSuhu : AppCompatActivity() {


    private lateinit var etsuhu : EditText
    private lateinit var btnfahrenheit : Button
    private lateinit var btnkelvin : Button
    private lateinit var btnreamur : Button
    private lateinit var txthasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_konversi_suhu)


        etsuhu = findViewById(R.id.etsuhu)
        btnfahrenheit = findViewById(R.id.btnfahrenheit)
        btnkelvin = findViewById(R.id.btnkelvin)
        btnreamur = findViewById(R.id.btnreamur)
        txthasil = findViewById(R.id.txthasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnfahrenheit.setOnClickListener() {
            val hasil = (9 / 5) * etsuhu.text.toString().toInt() + 32
            txthasil.setText("Hasil Konversinya = " + hasil)
        }

        btnkelvin.setOnClickListener() {
            val hasil = etsuhu.text.toString().toInt() + 273.15
            txthasil.setText("Hasil Konversinya = " + hasil)
        }

        btnreamur.setOnClickListener() {
            val hasil = etsuhu.text.toString().toInt() * 0.8
            txthasil.setText("Hasil Konversinya = " + hasil)
        }
    }
}