package com.android.androidnewarchitecture.di

import com.android.androidnewarchitecture.data.repository.NewsRepository
import com.android.androidnewarchitecture.data.repository.SourceRepository
import com.android.androidnewarchitecture.domain.GetNewsUseCase
import com.android.androidnewarchitecture.domain.GetSourceUseCase
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideGetNewsUseCase(repository: NewsRepository) = GetNewsUseCase(repository)

    @Provides
    @Singleton
    fun provideGetSourceUseCase(repository: SourceRepository) = GetSourceUseCase(repository)
}