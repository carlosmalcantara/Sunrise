package com.carlosalcantara.sunrise.composables.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.carlosalcantara.sunrise.composables.navigation.AppScreens

@Composable
fun Pantalla1Screen(navController: NavHostController, name: String) {
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Go back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "FirstScreen")
        }
    }) {
        Text(text = "texto: $name")
        Pantalla1(navController, name)
    }
}

@Composable
fun Pantalla1(navController: NavController, name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = name, fontSize = 24.sp)
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "GoBack")
        }
    }
}
