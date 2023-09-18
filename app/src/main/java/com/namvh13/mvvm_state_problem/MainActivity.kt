package com.namvh13.mvvm_state_problem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.namvh13.mvvm_state_problem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.incrementButton.setOnClickListener {
            counter++
            binding.couterTV.text = counter.toString()
        }
    }
}