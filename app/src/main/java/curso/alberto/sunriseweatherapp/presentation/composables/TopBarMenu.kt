package curso.alberto.sunriseweatherapp.presentation.composables

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope



@Composable
fun TopBarMenu(
  //  scope: CoroutineScope,
   // scaffoldState: ScaffoldState
) {
    var showMenu by remember {
        mutableStateOf(false)
    }
    TopAppBar(
        title = { Text(text = "Sunrise Weather") },
        backgroundColor = Color.White,
        elevation = 0.dp,
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "Boton Favorito"
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Refresh,
                    contentDescription = "Boton refrescar"
                )
            }
            IconButton(onClick = { showMenu = !showMenu }) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "Boton menú"
                )
            }
            DropdownMenu(
                expanded = showMenu,
                onDismissRequest = { showMenu = false },
                modifier = Modifier.width(150.dp)
            ) {
                DropdownMenuItem(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Icono Buscar ciudad"
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text("Search by cities")
                }
                DropdownMenuItem(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = "Icono Compartir"
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text("Share")
                }
                DropdownMenuItem(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Settings,
                        contentDescription = "Icono Configuracion"
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text("Settings")
                }
                DropdownMenuItem(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "Icono Nosotros"
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text("About us")
                }


            }


        }
)
    }



