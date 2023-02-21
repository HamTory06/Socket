package com.example.socket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socket.databinding.ActivityMainBinding
import io.socket.client.Socket
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    //binding
    private var mbinding: ActivityMainBinding ?= null
    private val binding get() = mbinding!!
    //Socket
    lateinit var mSocket: Socket
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        thread {
            mSocket = SocketApplication.get()
            mSocket.connect()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        //소켓 연결 해제
        mSocket.disconnect()
    }
}