package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Characters(
    val id: Int,
    val name: String,
    val image: String,
    val designation: String,
    val famousDialogue: String,
    val tags: List<String>,
    val about: String,
    val rating: Double,
    val power: Int,
    val intelligence: Int,
    val abilities: List<String>,
    val kills: Int

    )