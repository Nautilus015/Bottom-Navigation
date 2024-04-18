package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.container,HomeFragment()).commit()
        bottomNav = findViewById(R.id.bottomNav)
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.homefragment -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container,HomeFragment()).commit()
                    true
                }
                R.id.profilefragment -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container,ProfileFragment()).commit()
                    true
                }
                R.id.settingfragment -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container,SettingFragment()).commit()
                    true
                } else -> {true}
            }
        }
    }
}