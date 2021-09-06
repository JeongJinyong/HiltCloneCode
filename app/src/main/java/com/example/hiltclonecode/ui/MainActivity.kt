package com.example.hiltclonecode.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltclonecode.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}