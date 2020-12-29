package com.alfred0ga.indigo.data.remote.response


import com.google.gson.annotations.SerializedName

data class Response(
    val dsRespuesta: DsRespuesta,
    @SerializedName("Fecha")
    val fecha: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("IsActionPermitted")
    val isActionPermitted: Boolean,
    @SerializedName("IsExists")
    val isExists: Boolean,
    @SerializedName("IsOk")
    val isOk: Boolean,
    @SerializedName("IsOnline")
    val isOnline: Boolean,
    @SerializedName("Mensaje")
    val mensaje: String,
    @SerializedName("MensajeID")
    val mensajeID: Int,
    @SerializedName("NoFilas")
    val noFilas: Int,
    @SerializedName("Nota")
    val nota: Any,
    @SerializedName("Password")
    val password: Any,
    @SerializedName("Permiso")
    val permiso: Boolean,
    @SerializedName("TipoUsuario")
    val tipoUsuario: Any,
    @SerializedName("URL")
    val uRL: String,
    @SerializedName("UserName")
    val userName: String
)