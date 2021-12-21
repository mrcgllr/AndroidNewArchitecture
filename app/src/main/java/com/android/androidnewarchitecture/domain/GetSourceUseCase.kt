package com.android.androidnewarchitecture.domain

import com.android.androidnewarchitecture.data.model.Source
import com.android.androidnewarchitecture.data.repository.SourceRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetSourceUseCase @Inject constructor(
    private val sourceRepository: SourceRepository
) {

    suspend operator fun invoke(): List<Source> = withContext(Dispatchers.IO) {
        return@withContext sourceRepository.getSource()
    }
}