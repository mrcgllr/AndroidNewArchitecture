package com.android.androidnewarchitecture.data.repository

import com.android.androidnewarchitecture.data.model.Source
import com.android.androidnewarchitecture.data.service.NewsService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class SourceRepository @Inject constructor(private val newsService: NewsService) {

    val sourceCachedData = mutableListOf<Source>()

    suspend fun getNews() {
        withContext(Dispatchers.IO) {
            sourceCachedData.clear()
            sourceCachedData.addAll(newsService.getSource().sources)
            return@withContext sourceCachedData
        }
    }
}