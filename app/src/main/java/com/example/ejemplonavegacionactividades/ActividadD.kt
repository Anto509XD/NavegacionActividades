package com.example.ejemplonavegacionactividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

//Actividad D

class ActividadD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_d)

        val mensaje= intent.getStringExtra("mensaje")

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }
}