package com.example.viewpager

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewpager.repository.ComponentRepository

class MainViewModelProviderFactory(val app: Application, val componentRepository: ComponentRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(app, componentRepository) as T
    }
}