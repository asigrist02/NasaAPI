package com.example.nasaapi.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PhotoResponse (
    @Json(name = "image") val galleryItems:List<GalleryItem>
)