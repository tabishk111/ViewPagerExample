package com.example.viewpager.api

import com.example.viewpager.models.Component
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ComponentAPI {
    @GET("suggested/video/{id}")
    suspend fun getDetails(
        @Path("id") id:String
    ) : Response<Component>
}