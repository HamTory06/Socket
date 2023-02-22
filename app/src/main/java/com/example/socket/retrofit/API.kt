package com.example.socket.retrofit

import retrofit2.http.POST

interface API {
    @POST("/chat/create")
    fun createRoom(
        
    )

    @POST("/chat/find")
    fun findRoom(

    )
}