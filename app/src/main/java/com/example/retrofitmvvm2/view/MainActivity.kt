package com.example.retrofitmvvm2.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.retrofitmvvm2.R

class MainActivity : AppCompatActivity() {
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.button1)
        btn2 = findViewById(R.id.button2)
        btn3 = findViewById(R.id.button3)
        btn4 = findViewById(R.id.button4)
        btn5 = findViewById(R.id.button5)
        btn6 = findViewById(R.id.button6)
        btn7 = findViewById(R.id.button7)

        btn1.setOnClickListener {
            val intent = Intent(this, PostsMainActivity::class.java)
            startActivity(intent)

        }

        btn2.setOnClickListener {
            val intent = Intent(this, UsersMainActivity::class.java)
            startActivity(intent)

        }
        btn3.setOnClickListener {
            val intent = Intent(this, CommentsMainActivity::class.java)
            startActivity(intent)

        }
        btn4.setOnClickListener {
        val intent = Intent(this, TodosMainActivity::class.java)
        startActivity(intent)

        }
        btn5.setOnClickListener {
            val intent = Intent(this, CategoriesMainActivity::class.java)
            startActivity(intent)

        }
        btn6.setOnClickListener {
            val intent = Intent(this, ProductsMainActivity::class.java)
            startActivity(intent)

        }
        btn7.setOnClickListener {
            val intent = Intent(this, ProductCategoriesMainActivity::class.java)
            startActivity(intent)

        }
    }
}
