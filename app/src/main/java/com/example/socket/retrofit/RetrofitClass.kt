package com.example.socket.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClass{
    companion object {

        private const val baseurl = "http://220.94.98.54:7999/api"
        private var server = Retrofit.Builder()
            .baseUrl(baseurl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        private var api:API = server.create(API::class.java)
    }
}
