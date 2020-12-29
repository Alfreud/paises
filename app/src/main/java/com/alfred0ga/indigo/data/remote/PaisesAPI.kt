package com.alfred0ga.indigo.data.remote

import com.alfred0ga.indigo.data.remote.response.DsRespuesta
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

interface PaisesAPI {

    @POST
    suspend fun searchForCountry(): Response<DsRespuesta>
}