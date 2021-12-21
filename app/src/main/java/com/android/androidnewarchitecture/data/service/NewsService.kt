package com.android.androidnewarchitecture.data.service

import com.android.androidnewarchitecture.data.model.NewsResponse
import com.android.androidnewarchitecture.data.model.SourceResponse
import retrofit2.http.GET

interface NewsService {

    @GET("everything")
    suspend fun getArticles(): NewsResponse

    @GET("top-headlines/sources")
    suspend fun getSource(): SourceResponse
}