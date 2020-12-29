package com.alfred0ga.indigo.data.remote.response


import com.google.gson.annotations.SerializedName

data class Paise(
    val idPais: String,
    @SerializedName("Pais")
    val pais: String
)