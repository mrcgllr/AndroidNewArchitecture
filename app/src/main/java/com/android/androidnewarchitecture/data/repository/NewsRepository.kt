package com.android.androidnewarchitecture.data.repository

import com.android.androidnewarchitecture.data.model.Article
import com.android.androidnewarchitecture.data.service.NewsService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NewsRepository @Inject constructor(private val newsService: NewsService) {

    val newsCachedData = mutableListOf<Article>()

    suspend fun getNews(){
        withContext(Dispatchers.IO){
            newsCachedData.clear()
            newsCachedData.addAll(newsService.getArticles().articles)
            return@withContext newsCachedData
        }
    }
}