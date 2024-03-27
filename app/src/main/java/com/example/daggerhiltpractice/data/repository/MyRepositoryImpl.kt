package com.example.daggerhiltpractice.data.repository

import com.example.daggerhiltpractice.data.remote.MyApi
import com.example.daggerhiltpractice.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi
): MyRepository {

    override suspend fun getAllNews() {

    }

}