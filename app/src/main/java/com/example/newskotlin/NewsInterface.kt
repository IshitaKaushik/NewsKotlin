package com.example.newskotlin

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsInterface {

    @GET("/v2/top-headlines")
    suspend fun getArticles(@Query("country") country: String, @Query("apiKey") apiKey: String) : Response<NewsItem>
    //suspend fun getArticles() : Response<NewsItem>
}