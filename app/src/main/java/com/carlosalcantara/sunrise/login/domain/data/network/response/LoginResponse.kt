package com.carlosalcantara.sunrise.login.domain.data.network.response

import com.google.gson.annotations.SerializedName

data class LoginResponse (@SerializedName("success") val success: Boolean)
