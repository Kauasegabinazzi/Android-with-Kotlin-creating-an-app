package com.example.android_with_kotlin_creating_an_app.recyclerViewAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_with_kotlin_creating_an_app.R
import com.example.android_with_kotlin_creating_an_app.model.Product

class ProductsListAdapter(private val context: Context ,private val products: List<Product>) : RecyclerView.Adapter<ProductsListAdapter.ViewHolders>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsListAdapter.ViewHolders {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item,parent,false )
        return ViewHolders(view)
    }

    override fun getItemCount(): Int = products.size

    override fun onBindViewHolder(holder: ProductsListAdapter.ViewHolders, position: Int) {
        TODO("Not yet implemented")
    }

    class ViewHolders(view: View) : RecyclerView.ViewHolder(view)

}
