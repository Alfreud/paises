package com.alfred0ga.indigo.data.remote.response


import com.google.gson.annotations.SerializedName

data class DsRespuesta(
    @SerializedName("Paises")
    val paises: List<Paise>
)