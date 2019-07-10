package com.example.mvvmsample.data.repositories


import com.example.mvvmsample.data.network.MyApi
import com.example.mvvmsample.data.network.responses.AuthResponse

import retrofit2.Response

class UserRepository {

    suspend fun userLogin(email: String, password: String): Response<AuthResponse> {

        return MyApi().userLogin(email, password)
    }
}

