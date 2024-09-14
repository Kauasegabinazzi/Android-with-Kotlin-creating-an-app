package com.example.android_with_kotlin_creating_an_app.recyclerViewAdapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_with_kotlin_creating_an_app.model.Product

class ProductsListAdapter(private val products: List<Product>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = products.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}
