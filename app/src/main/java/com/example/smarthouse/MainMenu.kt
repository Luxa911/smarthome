package com.example.smarthouse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
val menu :RecyclerView = findViewById(R.id.menu)
        menu.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
val men : ArrayList<String> = ArrayList()
       men.add("Комнаты")
        men.add("Устройства")
        men.add("Пользователи")
menu.adapter = menu_adapter(men)
    }

}