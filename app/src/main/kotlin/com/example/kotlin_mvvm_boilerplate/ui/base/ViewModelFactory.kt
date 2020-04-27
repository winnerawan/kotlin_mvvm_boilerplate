package com.example.kotlin_mvvm_boilerplate.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_mvvm_boilerplate.data.api.ApiHelper

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        throw IllegalArgumentException("Unknown class name")
    }

}