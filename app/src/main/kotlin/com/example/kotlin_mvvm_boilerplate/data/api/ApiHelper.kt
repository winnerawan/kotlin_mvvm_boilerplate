package com.example.kotlin_mvvm_boilerplate.data.api

class ApiHelper(private val apiService: ApiService) {

    suspend fun ping() =  apiService.ping()
}