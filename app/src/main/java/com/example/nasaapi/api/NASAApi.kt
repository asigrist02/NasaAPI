package com.example.nasaapi.api

import retrofit2.http.GET
import retrofit2.http.Query
import java.util.Date

private const val API_KEY = "zChhHdeoeSMu8FdQwvGJLKULFNqDcILDUI8fvgpW"

interface NASAApi {
    /*@GET("/")
    suspend fun fetchContents(): String*/
    @GET("planetary/apod")
    suspend fun fetchPhotos(
        @Query("api_key") apiKey: String = API_KEY,
        @Query("count") count: Int = 1
    ): NasaResponse
}