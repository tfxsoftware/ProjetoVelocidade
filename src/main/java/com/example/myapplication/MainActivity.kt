package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pInicial = findViewById<EditText>(R.id.editPosicaoInicial)
        val pFinal = findViewById<EditText>(R.id.editPosicaoFinal)
        val tInicial = findViewById<EditText>(R.id.editTempoInicial)
        val tFinal = findViewById<EditText>(R.id.editPosicaoFinal)
        val botao = findViewById<Button>(R.id.button)

        botao.setOnClickListener{
                var speed:Speed = Speed(
                    pInicial.text.toString().toDouble(),
                    pFinal.text.toString().toDouble(),
                    tInicial.text.toString().toDouble(),
                    tFinal.text.toString().toDouble()
                )
            val calculo = speed.calculaVelocidade()
            val i: Intent = Intent(this, SecondActivity::class.java)
            i.putExtra("calculo", calculo)
            startActivity(i)
        }
    }
}