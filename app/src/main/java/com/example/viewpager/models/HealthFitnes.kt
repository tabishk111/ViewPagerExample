package com.example.viewpager.models

data class HealthFitnes(
    val _id: String,
    val category: String,
    val description: String,
    val duration: String,
    val profile: Profile,
    val thumbnail: String,
    val timestamp: Double,
    val title: String,
    val upload_file: String
)