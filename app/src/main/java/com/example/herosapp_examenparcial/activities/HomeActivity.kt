package com.example.herosapp_examenparcial.activities


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.herosapp_examenparcial.MainActivity
import com.example.herosapp_examenparcial.R
import com.example.herosapp_examenparcial.models.User

class HomeActivity : AppCompatActivity() {
    lateinit var usernameTV : TextView
    lateinit var logoutBtn : ImageView
    lateinit var categoryRecyclerView : RecyclerView
    lateinit var restaurantRecyclerView: RecyclerView
    lateinit var foodRecyclerView: RecyclerView
}