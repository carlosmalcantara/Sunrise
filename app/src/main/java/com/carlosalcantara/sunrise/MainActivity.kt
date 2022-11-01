package com.carlosalcantara.sunrise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.carlosalcantara.sunrise.login.ui.LoginViewModel
import com.carlosalcantara.sunrise.login.ui.LoginScreen

import com.carlosalcantara.sunrise.ui.theme.SunriseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SunriseTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    LoginScreen(LoginViewModel())
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
        Greeting("Android")
    }
}