package com.example.android_with_kotlin_creating_an_app.activity


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_with_kotlin_creating_an_app.FormProductActivity
import com.example.android_with_kotlin_creating_an_app.R
import com.example.android_with_kotlin_creating_an_app.model.Product
import com.example.android_with_kotlin_creating_an_app.recyclerViewAdapter.ProductsListAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val name = findViewById<TextView>(R.id.name)
//        name.setText("codigo")
//        val descrica = findViewById<TextView>(R.id.descricao)
//        descrica.setText("laranja")
//        val value = findViewById<TextView>(R.id.value)
//        value.setText("19")
        var reclyclerView = findViewById<RecyclerView>(R.id.recycler)
        reclyclerView.adapter = ProductsListAdapter(context = this, products = listOf(
            Product(name = "teste", description = "teste desc", values = BigDecimal("19.99")),
            Product(name = "teste2", description = "teste2 desc", values = BigDecimal("21.99")),
            Product(name = "teste3", description = "teste3 desc", values = BigDecimal("26.99"))
        ))
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener{
            val intent = Intent(this, FormProductActivity::class.java)
            startActivity(intent)
        }
    }
}