package curso.alberto.sunriseweatherapp.ui.theme

import android.annotation.SuppressLint
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val teal500 = Color(0xFF3F9CE6)
val teal700 = Color(0xFFCCE6F1)

val yellow200 = Color(0xFFE0CD6A)
val yellow500 = Color(0xFFF7E7CB)
val teal900 = Color(0xFF7FD5FA)




val BlueCard = Color(0xFF83C8F2)
val GreyCard = Color(0xFFF5F5F5)


val SecondaryButton: ButtonColors
    @Composable
    get() = buttonColors(MaterialTheme.colors.secondary)