package com.example.kotlin_mvvm_boilerplate.ui.main.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.kotlin_mvvm_boilerplate.R
import com.example.kotlin_mvvm_boilerplate.data.api.ApiHelper
import com.example.kotlin_mvvm_boilerplate.data.api.RetrofitBuilder
import com.example.kotlin_mvvm_boilerplate.ui.base.ViewModelFactory
import com.example.kotlin_mvvm_boilerplate.ui.main.viewmodel.MainViewModel
import com.example.kotlin_mvvm_boilerplate.utils.Status

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewModel()
        setupObservers()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(ApiHelper(RetrofitBuilder.apiService))
        ).get(MainViewModel::class.java)
    }

    private fun setupObservers() {
        viewModel.getUsers().observe(this, Observer {
            it?.let { resource ->
                when (resource.status) {
                    Status.SUCCESS -> {

                    }
                    Status.ERROR -> {
                        Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                    }
                    Status.LOADING -> {

                    }
                }
            }
        })
    }
}