package com.example.myapplication2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cat = Cat(resources.getString(R.string.cat_name), 3)
        val catInfo: TextView = findViewById(R.id.cat_info)
        val catCopyInfo: TextView = findViewById(R.id.cat_copy_info)

        val btnShowProperty: MaterialButton = findViewById(R.id.btn_show_properties)
        btnShowProperty.setOnClickListener {
            catInfo.text = cat.toString()
        }

        val btnShowCopyProperty: MaterialButton = findViewById(R.id.btn_show_copy_properties)
        btnShowCopyProperty.setOnClickListener {
            val copyCat: Cat = cat.copy(age = 2)
            catCopyInfo.text = copyCat.toString()
        }
    }
}