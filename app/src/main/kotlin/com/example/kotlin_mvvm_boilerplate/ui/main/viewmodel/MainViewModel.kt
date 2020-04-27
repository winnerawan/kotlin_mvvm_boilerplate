package com.example.kotlin_mvvm_boilerplate.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.kotlin_mvvm_boilerplate.data.repository.MainRepository
import com.example.kotlin_mvvm_boilerplate.utils.Resource
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.ping()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, msg = exception.message ?: "Error Occurred!"))
        }
    }
}