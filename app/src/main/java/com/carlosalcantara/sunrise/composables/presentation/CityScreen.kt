package com.carlosalcantara.sunrise.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.carlosalcantara.sunrise.composables.navigation.AppScreens


@Composable
fun CityScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "ArrowBack",
                modifier = Modifier.clickable { navController.popBackStack() }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "CityScreen")
        }
    }) {
        CityTextField(navController)
    }

}

@Composable
fun CityTextField(navController: NavController) {

    var name by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(top = 36.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(1f),
            label = { Text(text = "Add city name", color = Color.DarkGray) },
            maxLines = 1,
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.DarkGray,
                unfocusedBorderColor = Color.LightGray
            )
        )
        Button(onClick = {
            navController.navigate(route = AppScreens.Pantalla_1_Screen.route + "/$name")
        }) {
            Text("Pasa el name a Pantalla 1")
        }
        Text(text = "Este es el texto a pantalla 1 (No vacio): $name")

        Button(
            onClick = {
                navController.navigate(route = AppScreens.Pantalla_2_Screen.createRoute(38.36F))
            }) {
            Text("Pasa el número a Pantalla 2")
        }
        Text(text = "El float pasado es 38.36F")

        Button(
            onClick = {
                navController.navigate(route = "pantalla3_screen")
            }) {
            Text("A pantalla 3")
        }
        Text(text = "With default value=Alcalá")
    }


}

