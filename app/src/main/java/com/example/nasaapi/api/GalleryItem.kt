package com.example.nasaapi.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GalleryItem (

    val title:String?,
    @Json(name = "url") val url:String?,
    val copyright:String?,
    val date: String?,
    val explanation:String?,
    val hdurl: String?,
    val media_type:String?,
    val service_version: String?
)