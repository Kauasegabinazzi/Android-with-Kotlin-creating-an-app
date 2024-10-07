package com.example.android_with_kotlin_creating_an_app.Dao

import com.example.android_with_kotlin_creating_an_app.model.Product

class ProductDao {

    private val products = mutableListOf<Product>()

    fun add(product: Product){
        products.add(product);
    }

    fun searchAll() : List<Product>{
        return products.toList()
    }
}