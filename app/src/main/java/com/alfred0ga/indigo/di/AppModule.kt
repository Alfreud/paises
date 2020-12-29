package com.alfred0ga.indigo.di

import com.alfred0ga.indigo.data.remote.PaisesAPI
import com.alfred0ga.indigo.repositories.MainRepo
import com.alfred0ga.indigo.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDefaultMainRepository(
        api: PaisesAPI
    ) = MainRepo(api) as MainRepo

    @Singleton
    @Provides
    fun providePaisesApi(): PaisesAPI {
        return  Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PaisesAPI::class.java)
    }
}