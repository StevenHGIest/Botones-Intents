package edu.iest.botones_intents

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var etCalifiacacion: EditText? = null
    private var bnEnviar: Button? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializar()
        asignarEventos()
    }
    fun inicializar() {
        etCalifiacacion = findViewById<EditText>(R.id.etCalifiacacion)
        bnEnviar =  findViewById<Button>(R.id.bnEnviar)
    }

    fun asignarEventos(){
        bnEnviar?.setOnClickListener {
            val i = Intent(this, Resultado::class.java)
            i.putExtra("calificacion", etCalifiacacion?.text.toString().toFloat())
            startActivity(i)
        }
    }
}