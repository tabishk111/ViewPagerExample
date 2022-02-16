package com.example.viewpager.models

// To parse the JSON, install kotlin's serialization plugin and do:
//
// val json    = Json(JsonConfiguration.Stable)
// val welcome = json.parse(Welcome.serializer(), jsonString)

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

@Serializable
data class Component (
    val message: Message,
    val status: Boolean
)

@Serializable
data class Message (
    @SerialName("Trending Technology")
    val trendingTechnology: List<HealthFitness>,

    @SerialName("Trending News")
    val trendingNews: List<HealthFitness>,

    @SerialName("Entertainment")
    val entertainment: JsonArray,

    @SerialName("Health & Fitness")
    val healthFitness: List<HealthFitness>,

    @SerialName("Knowledge & Careers")
    val knowledgeCareers: List<HealthFitness>
)

@Serializable
data class HealthFitness (
    @SerialName("_id")
    val id: String,

    val profile: Profile,
    val title: String,
    val description: String,
    val thumbnail: String,
    val duration: String,
    val category: String,

    @SerialName("upload_file")
    val uploadFile: String,

    val timestamp: Double
)

@Serializable
data class Profile (
    @SerialName("_id")
    val id: String,

    val name: String,

    @SerialName("channel_name")
    val channelName: String,

    @SerialName("profile_picture")
    val profilePicture: String
)
