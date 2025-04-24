package bluerose.fishgallery.ui.screens.custom_catch

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import bluerose.fishgallery.ui.screens.custom_catch.models.CatchEvent
import bluerose.fishgallery.ui.screens.custom_catch.views.CatchViewDisplay
import bluerose.fishgallery.ui.theme.FishGalleryTheme
import bluerose.fishgallery.ui.theme.components.JetDialog

@Composable
fun CatchScreen(navController: NavController) {
    CatchViewDisplay { event ->
        when (event) {
            CatchEvent.CloseScreen -> {
                navController.popBackStack()
            }

            CatchEvent.EnterScreen -> {} // TODO: добавить обработку события открытия окна

            CatchEvent.ReloadScreen -> {} // TODO: добавить обработку события перезагрузки окна
        }
    }

    // Было в тз, но по факту не используется:
    val isVisibleDialog = remember { mutableStateOf(false) }
    if (isVisibleDialog.value)
        Dialog(onDismissRequest = { isVisibleDialog.value = false }) {
            JetDialog(
                title = "Наши контакты",
                body = "E-mail: blue-rose@our.galaxy\nАдресат: Джонни Сильверхэд",
                buttonText = "ОК",
                onClose = { isVisibleDialog.value = false }
            )
        }
}

@Preview(showSystemUi = true)
@Composable
fun CatchScreenPreview() {
    FishGalleryTheme {
        CatchScreen(rememberNavController())
    }
}