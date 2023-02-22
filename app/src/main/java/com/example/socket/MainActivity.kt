package com.example.socket

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.socket.databinding.ActivityMainBinding
import io.socket.client.Socket
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    //binding
    private var mbinding: ActivityMainBinding ?= null
    private val binding get() = mbinding!!
    //Socket
    private lateinit var mSocket:Socket
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //SocketApplication클래스의 인스턴스를 반환하는 메서드
        thread {
            mSocket = SocketApplication.get()
            mSocket.connect()
        }

    }

    override fun onResume() {
        super.onResume()
        mSocket.on(Socket.EVENT_CONNECT) {
            Log.d("상태", "Socket connected")
        }.on(Socket.EVENT_CONNECT_ERROR) {
            Log.d("상태","실패: ${it[0]}")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        //소켓 연결 해제
        mSocket.disconnect()
    }
}