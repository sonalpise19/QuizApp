package com.coding.quizdesignapp.model.repo

import com.coding.quizdesignapp.model.data.ServiceApi
import com.coding.quizdesignapp.model.response.ResponseItem
import com.coding.quizdesignapp.model.response.TestData
import javax.inject.Inject

class InsepectionRepo @Inject constructor(private val serviceApi: ServiceApi) {

    suspend fun getInsepctionData(): ResponseItem {
        return serviceApi.getInsepctionDta()
    }

    suspend fun getTestData(): TestData {
        return serviceApi.getTestData()
    }
}