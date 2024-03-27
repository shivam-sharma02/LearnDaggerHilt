package com.example.daggerhiltpractice.data.remote

import retrofit2.http.GET

interface MyApi {
    @GET("type")
    suspend fun getAllNews()
}