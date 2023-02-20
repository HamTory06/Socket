package com.example.socket

import java.net.URISyntaxException
import io.socket.client.Socket
import io.socket.client.IO

class SocketApplication {
    companion object{
        private lateinit var socket: Socket
        fun get(): Socket {
            try {
                socket = IO.socket("https://192.168.0.70:8080")
            } catch (e: URISyntaxException){
                e.printStackTrace()
            }
            return socket
        }
    }
}