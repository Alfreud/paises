package com.alfred0ga.indigo.repositories

import com.alfred0ga.indigo.data.remote.PaisesAPI
import javax.inject.Inject

class MainRepo @Inject constructor(
    private val paisesAPI: PaisesAPI
){
    suspend fun getPaises() = paisesAPI.searchForCountry()
}