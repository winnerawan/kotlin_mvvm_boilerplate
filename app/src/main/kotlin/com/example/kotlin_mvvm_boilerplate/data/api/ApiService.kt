package com.example.kotlin_mvvm_boilerplate.data.api

import retrofit2.http.GET

interface ApiService {

    @GET("ping")
    suspend fun ping()
}