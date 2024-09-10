package com.example.android_with_kotlin_creating_an_app

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "teste", Toast.LENGTH_SHORT).show()
    }
}