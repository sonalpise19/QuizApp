package com.coding.quizdesignapp.di

import com.coding.quizdesignapp.model.data.ServiceApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class InsepctionAPIProvider {

    @Provides
    @Singleton
    fun provideAuthInterceptorOkHttpClient(): OkHttpClient {
        return OkHttpClient
            .Builder()
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit
            .Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(API_URL)
            .build()
    }
    companion object {
     //   const val API_URL = "http://127.0.0.1:5001/api/inspections/"

        const val API_URL = "https://jsonplaceholder.typicode.com/todos/"
    }

    @Provides
    fun provideRestApiService(retrofit: Retrofit): ServiceApi {
        return retrofit.create(ServiceApi::class.java)
    }
}