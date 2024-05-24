package com.coding.quizdesignapp.model.data

import com.coding.quizdesignapp.model.response.ResponseItem
import com.coding.quizdesignapp.model.response.TestData
import retrofit2.http.GET

interface ServiceApi {
    @GET("3")
    suspend fun getInsepctionDta(): ResponseItem


    @GET("1")
    suspend fun getTestData(): TestData
}