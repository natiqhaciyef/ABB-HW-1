package com.example.abb_tasks.data.model

import java.io.Serializable

data class ChocolateModel(
    val image: String,
    val imagePng: String,
    val type: String,
    val price: Int,
    val description: String
): Serializable
