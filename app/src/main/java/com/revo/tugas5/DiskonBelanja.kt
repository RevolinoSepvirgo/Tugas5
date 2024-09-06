package com.revo.tugas5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DiskonBelanja : AppCompatActivity() {
    private lateinit var ettotal : EditText
    private lateinit var btndiskon : Button
    private lateinit var txthasil : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diskon_belanja)


        ettotal= findViewById(R.id.ettotal)
       btndiskon = findViewById(R.id.btndiskon)
        txthasil = findViewById(R.id.txthasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btndiskon.setOnClickListener() {
            val totalBelanja = ettotal.text.toString().toInt()

            if ( totalBelanja >= 100000 && totalBelanja <= 500000 ) {
                val diskon = ettotal.text.toString().toInt() * 0.1
               txthasil.setText("Diskon anda sebesar " + diskon)
            } else if ( totalBelanja > 500000 && totalBelanja <= 1000000 ) {
                val diskon = ettotal.text.toString().toInt() * 0.2
                txthasil.setText("Diskon anda sebesar " + diskon)
            } else if ( totalBelanja > 1000000 ) {
                val diskon =ettotal.text.toString().toInt() * 0.3
               txthasil.setText("Diskon anda sebesar " + diskon)
            } else {
                txthasil.setText("Anda tidak mendapatkan diskon")
            }
        }
    }
}