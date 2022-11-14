package com.carlosalcantara.sunrise

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun SimpleRecyclerView() {
    val myList = listOf("Juan", "Lola", "Rosa", "Carlos")
    LazyColumn {
        item { Text(text = "Primer item") }
        items(myList){
            Text(text="Hola me llamo $it")
        }
    }
}