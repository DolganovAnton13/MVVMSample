package com.example.mvvmsample.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import com.example.mvvmsample.R
import com.example.mvvmsample.util.toast
import com.example.mvvmsample.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), AuthListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel=viewModel

        viewModel.authListener=this
    }

    override fun onStarted() {
             toast("Login Started")
    }

    override fun onSuccess() {
        toast("success")
    }

    override fun onFailure(message: String) {
                toast(message)
    }


}
