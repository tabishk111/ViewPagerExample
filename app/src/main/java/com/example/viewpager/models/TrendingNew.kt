package com.example.viewpager.models

data class TrendingNew(
    val _id: String,
    val category: String,
    val description: String,
    val duration: String,
    val profile: ProfileXX,
    val thumbnail: String,
    val timestamp: Double,
    val title: String,
    val upload_file: String
)