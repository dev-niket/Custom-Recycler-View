package com.example.customrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val names = arrayOf("Name A", "Name B", "Name C")
    val age = arrayOf(25,33,27)
    val locations = arrayOf("Mumbai", "Bangalore", "Delhi NCR")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val employeeRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val adapter = EmployeeAdapter(names, age, locations)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        employeeRecyclerView.layoutManager = layoutManager
        employeeRecyclerView.adapter = adapter
    }
}