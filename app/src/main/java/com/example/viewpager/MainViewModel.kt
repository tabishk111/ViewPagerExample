package com.example.viewpager

import android.app.Application
import android.util.Log
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.viewpager.models.Component
import com.example.viewpager.repository.ComponentRepository
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import retrofit2.Response
import retrofit2.await
import java.util.ArrayList

class MainViewModel(app: Application, val componentRepository: ComponentRepository,

) : AndroidViewModel(app)  {
    lateinit var newDetails: Component

    fun pushPath(id:String) {
        viewModelScope.launch {
            runCatching {
                val response = componentRepository.getDetails(id)
                newDetails = response.body()!!
                Log.e("message", newDetails.toString())
            }
        }
    }
}