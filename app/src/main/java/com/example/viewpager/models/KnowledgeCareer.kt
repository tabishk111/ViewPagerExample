package com.example.viewpager.models

data class KnowledgeCareer(
    val _id: String,
    val category: String,
    val description: String,
    val duration: String,
    val profile: ProfileX,
    val thumbnail: String,
    val timestamp: Double,
    val title: String,
    val upload_file: String
)