package com.example.proyectoeatalarm

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Recomendaciones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recomendaciones)
    }



    fun abrirHomeAlarma(view: View){
        val intent = Intent(this,MainActivity::class.java).apply { }
        startActivity(intent)
    }


}
