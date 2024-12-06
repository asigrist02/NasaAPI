package com.example.nasaapi

import com.example.nasaapi.api.GalleryItem
import com.example.nasaapi.api.NASAApi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create

class PhotoRepository {

    private val nasaApi:NASAApi

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.nasa.gov/")
            //.addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        nasaApi = retrofit.create()
    }
    //suspend fun  fetchContents() = nasaApi.fetchContents()
    //suspend fun  fetchPhotos() = nasaApi.fetchPhotos()
    suspend fun fetchPhotos(): List<GalleryItem> = nasaApi.fetchPhotos().photos.galleryItems
}