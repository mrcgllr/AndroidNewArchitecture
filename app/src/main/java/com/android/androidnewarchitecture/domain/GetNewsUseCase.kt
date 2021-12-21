package com.android.androidnewarchitecture.domain

import com.android.androidnewarchitecture.data.model.Article
import com.android.androidnewarchitecture.data.repository.NewsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetNewsUseCase @Inject constructor(
    private val newsRepository: NewsRepository
) {

    suspend operator fun invoke(): List<Article> = withContext(Dispatchers.IO) {
        return@withContext newsRepository.getNews()
    }
}