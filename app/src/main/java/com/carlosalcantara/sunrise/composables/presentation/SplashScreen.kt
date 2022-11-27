package com.carlosalcantara.sunrise.presentation.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.carlosalcantara.sunrise.composables.navigation.AppScreens
import kotlinx.coroutines.delay
import com.carlosalcantara.sunrise.R


@Composable
fun SplashScreen(navController: NavHostController) {
    LaunchedEffect(key1 = true){
        delay(3000)
        navController.popBackStack()
        //navController.navigate(AppScreens.MainScreen.route)
        //navController.navigate(AppScreens.Pantalla1Screen.route)
        navController.navigate(AppScreens.CityScreen.route)
    }
    Splash()
}

@Composable
fun Splash(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.sunriselogo), contentDescription = "logo Sunrise",
        Modifier.size(240.dp))
        Text(text = "Welcome", fontSize = 30.sp, fontWeight = FontWeight.Bold)
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    Splash()
}






