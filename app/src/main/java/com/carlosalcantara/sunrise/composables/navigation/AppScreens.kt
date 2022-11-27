package com.carlosalcantara.sunrise.composables.navigation

sealed class AppScreens(val route: String) {

    object SplashScreen: AppScreens("splash_screen")
    object MainScreen: AppScreens("main_screen")
    object CityScreen: AppScreens("city_screen")
    object AboutScreen: AppScreens("about_screen")

    object Pantalla_1_Screen: AppScreens("pantalla1_screen")
    object Pantalla_2_Screen: AppScreens("pantalla2_screen/{age}"){
        fun createRoute(age: Float) = "pantalla2_screen/$age"
    }
    object Pantalla_3_Screen: AppScreens("pantalla3_screen?name={name}&wind={wind}") {
        fun createRoute(name: String) = "pantalla3_screen?name=$name"

    }

}