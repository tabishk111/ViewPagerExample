package com.example.viewpager.models

import com.google.gson.JsonArray
import com.google.gson.annotations.SerializedName

data class Component (
    val message: Message? = null,
    val status: Boolean? = null
)

data class Message (
    @SerializedName("Trending Technology")
    val trendingTechnology: List<HealthFitness>? = null,

    @SerializedName("Trending News")
    val trendingNews: List<HealthFitness>? = null,

    @SerializedName("Entertainment")
    val entertainment: List<Any?>? = null,

    @SerializedName("Health & Fitness")
    val healthFitness: List<HealthFitness>? = null,

    @SerializedName("Knowledge & Careers")
    val knowledgeCareers: List<HealthFitness>? = null
)

data class HealthFitness (
    @SerializedName("_id")
    val id: String? = null,

    val profile: Profile? = null,
    val title: String? = null,
    val description: String? = null,
    val thumbnail: String? = null,
    val duration: String? = null,
    val category: String? = null,

    @SerializedName("upload_file")
    val uploadFile: String? = null,

    val timestamp: Double? = null
)

data class Profile (
    @SerializedName("_id")
    val id: String? = null,

    val name: String? = null,

    @SerializedName("channel_name")
    val channelName: String? = null,

    @SerializedName("profile_picture")
    val profilePicture: String? = null
)