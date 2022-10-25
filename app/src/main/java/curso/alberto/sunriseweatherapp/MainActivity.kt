package curso.alberto.sunriseweatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.location.LocationManagerCompat.getCurrentLocation
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import curso.alberto.sunriseweatherapp.presentation.MainScreen
import curso.alberto.sunriseweatherapp.ui.theme.SunriseWeatherAppTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SunriseWeatherAppTheme {

                MainScreen()
                
            }
        }
    }
}

