package com.carlosalcantara.sunrise.composables.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.carlosalcantara.sunrise.composables.CityScreen
import com.carlosalcantara.sunrise.composables.MainScreen
import com.carlosalcantara.sunrise.composables.presentation.AboutSunriseScreen
import com.carlosalcantara.sunrise.composables.presentation.Pantalla1Screen
import com.carlosalcantara.sunrise.composables.presentation.Pantalla2Screen
import com.carlosalcantara.sunrise.composables.presentation.Pantalla3Screen
import com.carlosalcantara.sunrise.presentation.navigation.SplashScreen


@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen.route
    ) {
        composable(AppScreens.SplashScreen.route) {
            SplashScreen(navController)
        }

        composable(AppScreens.MainScreen.route) {
            MainScreen(navController)
        }

        composable(AppScreens.CityScreen.route) {
            CityScreen(navController)
        }

        composable(AppScreens.AboutScreen.route) {
            AboutSunriseScreen(navController)
        }


        composable(AppScreens.Pantalla_1_Screen.route + "/{name}")
        { backStackEntry ->
            Pantalla1Screen(
                navController,
                backStackEntry.arguments?.getString("name").orEmpty()
                //backStackEntry.arguments?.getInt("age") ?: 0
            )
        }

        composable(
            AppScreens.Pantalla_2_Screen.route,
            arguments = listOf(navArgument("age") { type = NavType.FloatType })
        )
        { backStackEntry ->
            Pantalla2Screen(
                navController,
                backStackEntry.arguments?.getFloat("age") ?:0.00F
            )
        }

        composable(
            AppScreens.Pantalla_3_Screen.route,
            arguments = listOf(navArgument("name") { defaultValue = "Alcalá" })
        )
        { backStackEntry ->
            Pantalla3Screen(
                navController,
                backStackEntry.arguments?.getString("name")
            )
        }


    }

}
