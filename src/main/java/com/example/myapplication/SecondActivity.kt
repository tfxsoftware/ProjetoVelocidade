package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val calculo = findViewById<TextView>(R.id.labelCalculo)
        val botao = findViewById<Button>(R.id.buttonVoltar)
        calculo.text = intent.getStringExtra("calculo")
        botao.setOnClickListener{
            val i:Intent = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}