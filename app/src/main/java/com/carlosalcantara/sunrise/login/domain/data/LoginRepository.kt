package com.carlosalcantara.sunrise.login.domain.data

import com.carlosalcantara.sunrise.login.domain.data.network.LoginService

class LoginRepository {
    private val api = LoginService()

    suspend fun doLogin(user:String, password:String):Boolean{
        return api.doLogin(user, password)
    }
}