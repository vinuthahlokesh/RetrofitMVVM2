package com.example.retrofitmvvm2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitmvvm2.R
import com.example.retrofitmvvm2.repositry.ApiCallBback
import com.example.retrofitmvvm2.repositry.ApiCallbackForCategories
import com.example.retrofitmvvm2.repositry.Categories
import com.example.retrofitmvvm2.repositry.RecyclerAdapter
import com.example.retrofitmvvm2.viewmodel.ModelResponseClass

class ProductsMainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_main)

        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val responseViewModel =  ViewModelProvider(this).get(ModelResponseClass::class.java)
        responseViewModel.getproductsdata(object : ApiCallbackForCategories {
            override fun onResponse(response: List<Categories>) {
                recyclerView.adapter = RecyclerAdapter(response)
            }

            override fun onFailure(t: Throwable) {
                Toast.makeText(this@ProductsMainActivity,t.toString(), Toast.LENGTH_SHORT).show()
            }


        })

    }

}
