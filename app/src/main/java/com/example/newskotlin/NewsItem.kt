package com.example.newskotlin

data class NewsItem(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)