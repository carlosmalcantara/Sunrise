package com.carlosalcantara.sunrise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.carlosalcantara.sunrise.login.ui.LoginViewModel
import com.carlosalcantara.sunrise.presentation.WeatherDisplayDailyCard
import com.carlosalcantara.sunrise.presentation.composables.AboutSunrise
import com.carlosalcantara.sunrise.presentation.data.Datos_Tiempo

import com.carlosalcantara.sunrise.ui.theme.SunriseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val loginViewModel:LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SunriseTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    //LoginScreen(loginViewModel)
                    WeatherDisplayDailyCard(
                        daily = Datos_Tiempo()
                    )
                }

            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SunriseTheme {
        WeatherDisplayDailyCard(daily = Datos_Tiempo()
        )
    }
}