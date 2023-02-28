package edu.iest.botones_intents

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class Resultado : AppCompatActivity() {
    private var bnRegresar: Button? = null
    private var tvResultado: TextView? = null
    private var calificacion: Float? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        inicializacion()
        renderText()
        asignarEventos()
    }

    fun inicializacion() {
        bnRegresar = findViewById(R.id.bnRegresar)
        tvResultado = findViewById(R.id.tvResultado)
        calificacion = intent.getFloatExtra("calificacion", 0F)

    }

    fun renderText() {
        if (calificacion!! > 10F){
            tvResultado?.text = "Califiación no valida"
            tvResultado?.setTextColor(Color.parseColor("#ffd966"))
        }else if (calificacion!! >= 7F) {
            tvResultado?.text = "Felicidades aprobaste la materia con $calificacion"
            tvResultado?.setTextColor(Color.parseColor("#38761d"))
        }else{
            tvResultado?.text = "Obtiviste un $calificacion"
            tvResultado?.setTextColor(Color.parseColor("#cc0000"))
        }
    }

    fun asignarEventos(){
        bnRegresar?.setOnClickListener {
            finish()
        }
    }

}