package com.example.daggerhiltpractice.data.repository

import android.app.Application
import android.util.Log
import com.example.daggerhiltpractice.R
import com.example.daggerhiltpractice.data.remote.MyApi
import com.example.daggerhiltpractice.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appname = appContext.getString(R.string.app_name)
        println("This is hello from the repository and the app name is $appname")
        Log.e("AjKuchTufani", "Hello there this is MyRepository implementation and the app name is $appname")
    }

    override suspend fun getAllNews() {

    }

}