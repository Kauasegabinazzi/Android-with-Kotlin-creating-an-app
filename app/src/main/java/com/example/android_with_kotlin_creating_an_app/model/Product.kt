package com.example.android_with_kotlin_creating_an_app.model

import java.math.BigDecimal

data class Product (
    val name: String,
    val description: String,
    val values: BigDecimal
)
