package com.example.android.marsrealestate.network

import com.squareup.moshi.Json

data class MarsProperty(
        val id: String,
        @Json(name = "img_src") val imgSourceUrl: String,
        val type: String,
        val price: Double
)
