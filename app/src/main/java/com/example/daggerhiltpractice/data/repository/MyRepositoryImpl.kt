package com.example.daggerhiltpractice.data.repository

import android.app.Application
import com.example.daggerhiltpractice.R
import com.example.daggerhiltpractice.data.remote.MyApi
import com.example.daggerhiltpractice.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appname = appContext.getString(R.string.app_name)
        println("This is hello from the repository and the app name is $appname")
    }

    override suspend fun getAllNews() {

    }

}