package com.example.daggerhiltpractice.UI

import androidx.lifecycle.ViewModel
import com.example.daggerhiltpractice.data.repository.MyRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MyViewModel @Inject constructor(
    private val myrepository: MyRepositoryImpl
): ViewModel() {
}