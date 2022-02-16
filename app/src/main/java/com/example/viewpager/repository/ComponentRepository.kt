package com.example.viewpager.repository

import com.example.viewpager.api.RetrofitInstance
import com.example.viewpager.models.Component
import retrofit2.Call
import retrofit2.Response

class ComponentRepository {
    suspend fun getDetails(id:String): Response<Component> {
        return RetrofitInstance.api.getDetails(id)
    }
}