package com.example.viewpager

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.viewpager.models.Component
import com.example.viewpager.repository.ComponentRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(app: Application, val componentRepository: ComponentRepository) : AndroidViewModel(app)  {

    val newDetails: MutableLiveData<Response<Component>> = MutableLiveData()

    fun pushPath(id:String) {
        viewModelScope.launch {
            val response = componentRepository.getDetails(id)
            newDetails.value = response
        }
    }
}