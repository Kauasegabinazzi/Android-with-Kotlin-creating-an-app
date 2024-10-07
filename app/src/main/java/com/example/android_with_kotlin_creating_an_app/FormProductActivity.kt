package com.example.android_with_kotlin_creating_an_app

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.android_with_kotlin_creating_an_app.Dao.ProductDao
import com.example.android_with_kotlin_creating_an_app.model.Product
import java.math.BigDecimal

class FormProductActivity : AppCompatActivity(R.layout.activity_form_product) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener {
            val nameField = findViewById<EditText>(R.id.nome)
            var name = nameField.text.toString()
            val descriptionField = findViewById<EditText>(R.id.descricao)
            val description = descriptionField.text.toString()
            val valueField= findViewById<EditText>(R.id.valor)
            val valueText = valueField.text.toString()
            val value = if(valueText.isBlank()) {
                BigDecimal.ZERO
            } else {
                BigDecimal(valueText)
            }
            val newProduct = Product(
                name = name,
                description = description,
                values = value
            )
            Log.i("FormularioProduto", "onCreate: $newProduct")
            val dao = ProductDao()
            dao.add(newProduct)
            Log.i("FormularioProduto", "onCreate: ${dao.searchAll()}")
        }
    }
}

