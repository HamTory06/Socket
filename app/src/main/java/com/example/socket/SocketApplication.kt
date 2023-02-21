package com.example.socket

import android.util.Log
import io.socket.client.IO
import io.socket.client.Socket
import java.net.URISyntaxException

class SocketApplication {
    companion object{
        private lateinit var socket: Socket
        fun get(): Socket {
            try {
                socket = IO.socket("http://220.94.98.54:7999/")
            } catch (e: URISyntaxException){
                Log.e("상태",e.reason)
            }
            return socket
        }
    }
}