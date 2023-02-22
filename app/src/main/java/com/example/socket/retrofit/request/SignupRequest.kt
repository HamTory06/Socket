package com.example.socket.retrofit.request

import com.google.gson.annotations.SerializedName

data class SignupRequest(
    @SerializedName("access")
    val access: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("idx")
    val idx: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("password")
    val password: String
)
