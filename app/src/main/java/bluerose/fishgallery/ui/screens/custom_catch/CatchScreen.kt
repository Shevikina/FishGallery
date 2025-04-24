package bluerose.fishgallery.ui.screens.custom_catch

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import bluerose.fishgallery.ui.screens.custom_catch.models.CatchEvent
import bluerose.fishgallery.ui.screens.custom_catch.views.CatchViewDisplay
import bluerose.fishgallery.ui.theme.FishGalleryTheme

@Composable
fun CatchScreen(navController: NavController) {
    CatchViewDisplay { event ->
        when (event) {
            CatchEvent.CloseScreen -> {
                navController.popBackStack()
            }

            else -> {}
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun CatchScreenPreview() {
    FishGalleryTheme {
        CatchScreen(rememberNavController())
    }
}