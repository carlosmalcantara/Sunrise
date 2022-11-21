package curso.alberto.sunriseweatherapp.presentation.composables


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import curso.alberto.sunriseweatherapp.ui.theme.GreyCard




@Composable
fun WeatherDataInfo(

    details: List<WeatherDetails>
) {

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
       // horizontalArrangement = Arrangement.SpaceBetween,
        // content padding
        contentPadding = PaddingValues(
            start = 5.dp,
            top = 8.dp,
            end = 5.dp,
            bottom = 5.dp
        ),

       content = {
           items(details.size) {
              DetailsItem(details = details[it])
            }
        })
}


@Composable
fun DetailsItem(
    details: WeatherDetails
)  {
    BoxWithConstraints(
        modifier = Modifier
            .padding(5.dp)
            .aspectRatio(2f)
            .clip(RoundedCornerShape(25.dp))
            .background(GreyCard)
    ) {
        val width = constraints.maxWidth
        val height = constraints.maxHeight
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Icon(
            painter = painterResource(id = details.icon),
            contentDescription = details.units,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .size(55.dp)
                .padding(6.dp)
        )
        Column(
            modifier = Modifier.align(Alignment.BottomEnd)
        ) {

            Text(
                modifier = Modifier
                    .align(Alignment.End),
                text = details.units,
                lineHeight = 11.sp
            )
             Text (
                text = details.data,
                lineHeight = 15.sp
            )

        }

    }
}






