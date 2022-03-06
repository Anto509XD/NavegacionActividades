package com.example.ejemplonavegacionactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

//actividad C

class ActividadC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_c)

        val mensaje= intent.getStringExtra("mensaje")
        val mensajeDeA= intent.getStringExtra("mensajeA")
        val Boton= findViewById<Button>(R.id.Boton)

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

        Boton.setOnClickListener {
            finish()
        }
    }
}