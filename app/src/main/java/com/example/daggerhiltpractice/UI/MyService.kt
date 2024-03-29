package com.example.daggerhiltpractice.UI

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.daggerhiltpractice.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service()  {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

}
