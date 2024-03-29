package com.example.mvvmsample.ui.auth

import androidx.lifecycle.LiveData
import com.example.mvvmsample.data.db.entities.User

interface AuthListener {
    fun onStarted()
    fun onSuccess(user: User)
    fun onFailure(message: String)
}