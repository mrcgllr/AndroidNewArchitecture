package com.android.androidnewarchitecture.di

import com.android.androidnewarchitecture.data.repository.NewsRepository
import com.android.androidnewarchitecture.data.repository.SourceRepository
import com.android.androidnewarchitecture.data.service.NewsService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideNewsRepository(network: NewsService) = NewsRepository(network)

    @Provides
    @Singleton
    fun provideSourceRepository(network: NewsService) = SourceRepository(network)
}