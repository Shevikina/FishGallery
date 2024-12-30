package bluerose.fishgallery.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryColor,
    secondary = SecondaryColor,
    surface = SurfaceColor,
    tertiary = Pink80,
    onPrimary = OnPrimaryColor,
    onSecondary = OnSecondaryColor,
    onSurface = OnSurfaceColor
)

private val LightColorScheme = lightColorScheme(
    primary = PrimaryColor,
    secondary = SecondaryColor,
    surface = SurfaceColor,
    tertiary = Pink40,
    onPrimary = OnPrimaryColor,
    onSecondary = OnSecondaryColor,
    onSurface = OnSurfaceColor
)

@Composable
fun FishGalleryTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content,
        shapes = shapes
    )
}