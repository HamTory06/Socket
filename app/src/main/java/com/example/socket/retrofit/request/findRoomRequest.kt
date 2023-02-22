package com.example.socket.retrofit.request

import com.google.gson.annotations.SerializedName

data class findRoomRequest(
    @SerializedName("access")
    val access: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("roomId")
    val roomId: String
)
