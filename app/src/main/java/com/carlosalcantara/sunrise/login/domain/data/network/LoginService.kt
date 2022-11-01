package com.carlosalcantara.sunrise.login.domain.data.network

import com.carlosalcantara.sunrise.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user:String, password:String):Boolean{
        return withContext(Dispatchers.IO){
            val respond = retrofit.create(LoginClient::class.java).doLogin()
            respond.body()?.success ?:false
        }
    }
}