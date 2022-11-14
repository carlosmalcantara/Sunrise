package com.carlosalcantara.sunrise.login.domain.data

import com.carlosalcantara.sunrise.login.domain.data.network.LoginService
import javax.inject.Inject

class LoginRepository @Inject constructor(private val api : LoginService){

    suspend fun doLogin(user:String, password:String):Boolean{
        return api.doLogin(user, password)
    }
}