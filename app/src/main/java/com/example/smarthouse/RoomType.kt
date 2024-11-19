package com.example.smarthouse

import kotlinx.serialization.Serializable

@Serializable
data class RoomType(
    val id: String,
    val name: String,
    val iconUrl :String
)
