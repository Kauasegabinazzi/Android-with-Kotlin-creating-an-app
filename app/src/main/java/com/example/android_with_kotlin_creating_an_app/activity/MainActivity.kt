package com.example.android_with_kotlin_creating_an_app.activity


import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.android_with_kotlin_creating_an_app.R
import com.example.android_with_kotlin_creating_an_app.recyclerViewAdapter.ProductsListAdapter

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val name = findViewById<TextView>(R.id.name)
//        name.setText("codigo")
//        val descrica = findViewById<TextView>(R.id.descricao)
//        descrica.setText("laranja")
//        val value = findViewById<TextView>(R.id.value)
//        value.setText("19")
        var reclyclerView = findViewById<RecyclerView>(R.id.recycler)
        reclyclerView.adapter = ProductsListAdapter()
    }
}