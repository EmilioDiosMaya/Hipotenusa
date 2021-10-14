package com.example.hipotenusa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var etCatetoB: EditText
    private lateinit var etCatetoC: EditText
    private lateinit var etResultado: EditText
    private lateinit var btnLimpiar: Button
    private lateinit var btnCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etCatetoB = findViewById(R.id.etCatetoB)
        etCatetoC = findViewById(R.id.etCatetoC)
        etResultado = findViewById(R.id.etResultado)
        btnLimpiar = findViewById(R.id.btnLimpiar)
        btnCalcular = findViewById(R.id.btnCalcular)

        btnLimpiar?.setOnClickListener{
            etCatetoB.setText("")
            etCatetoC.setText("")
            etResultado.setText("")
        }

        btnCalcular?.setOnClickListener{
            var catetoB = Math.pow(etCatetoB?.text.toString().toDouble(),2.0)
            var catetoC = Math.pow(etCatetoC?.text.toString().toDouble(),2.0)
            var resultadoxd = sqrt(catetoB + catetoC)

            etResultado.setText(resultadoxd.toString())
        }
    }


}