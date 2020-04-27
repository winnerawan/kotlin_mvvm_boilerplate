package com.example.kotlin_mvvm_boilerplate.data.repository

import com.example.kotlin_mvvm_boilerplate.data.api.ApiHelper


class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun ping() = apiHelper.ping()
}