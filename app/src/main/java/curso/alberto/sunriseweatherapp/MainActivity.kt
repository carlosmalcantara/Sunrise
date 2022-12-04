package curso.alberto.sunriseweatherapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.core.location.LocationManagerCompat.getCurrentLocation
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import curso.alberto.sunriseweatherapp.presentation.MainScreen
import curso.alberto.sunriseweatherapp.ui.theme.SunriseWeatherAppTheme
import curso.alberto.sunriseweatherapp_.presentation.composables.composables.AppBar.MainViewModel
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SunriseWeatherAppTheme {

                MainScreen(MainViewModel = mainViewModel)
                
            }
        }
    }
}

