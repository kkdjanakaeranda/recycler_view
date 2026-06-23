package com.example.recy_morning.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recy_morning.R
import com.example.recy_morning.adapters.CustomAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val recyclerview = findViewById<RecyclerView>(R.id.list_view)
        recyclerview.setHasFixedSize(true)

        recyclerview.layoutManager = LinearLayoutManager(this)
        //  set data with adapter

        val countryList = mutableListOf<String>("India", "USA", "South Africa", "UK" ,"Argentina", "Australia", "Brazil", "Canada", "China" , "Denmark", "Egypt", "France", "Germany", "India" , "USA", "South Africa", "UK" ,"Argentina", "Australia", "Brazil", "Canada", "China" , "Denmark", "Egypt", "France", "Germany", "India")
        recyclerview.adapter = CustomAdapter(countryList)

    }
}