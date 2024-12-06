package com.example.android_with_kotlin_creating_an_app.activity


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.android_with_kotlin_creating_an_app.Dao.ProductDao
import com.example.android_with_kotlin_creating_an_app.FormProductActivity
import com.example.android_with_kotlin_creating_an_app.R
import com.example.android_with_kotlin_creating_an_app.recyclerViewAdapter.ProductsListAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaProdutosActivity : AppCompatActivity(R.layout.activity_lista_produtos) {

    private val dao = ProductDao()
    private val adapter = ProductsListAdapter(context = this, products = dao.searchAll())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        extracted()
        configutaFab()
    }

    override fun onResume() {
        super.onResume()
        adapter.atualiza(dao.searchAll())
    }

    private fun configutaFab() {
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormProductActivity::class.java)
            startActivity(intent)
        }
    }

    private fun extracted() {
        var reclyclerView = findViewById<RecyclerView>(R.id.recycler)
        reclyclerView.adapter = adapter
    }
}