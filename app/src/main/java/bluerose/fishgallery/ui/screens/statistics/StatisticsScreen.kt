package bluerose.fishgallery.ui.screens.statistics

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import bluerose.fishgallery.ui.navigation.NavScreen
import bluerose.fishgallery.ui.screens.statistics.models.StatisticsEvent
import bluerose.fishgallery.ui.screens.statistics.views.StatisticsViewDisplay
import bluerose.fishgallery.ui.theme.FishGalleryTheme
import bluerose.fishgallery.ui.theme.components.JetDialog

@Composable
fun StatisticsScreen(navController: NavController) {
    val isVisibleDialog = remember { mutableStateOf(false) }

    StatisticsViewDisplay(onIconClick = { isVisibleDialog.value = true }) { event ->
        when (event) {
            StatisticsEvent.OpenCatchScreen -> {
                navController.navigate(NavScreen.Catch)
            }

            StatisticsEvent.EnterScreen -> {} // TODO: добавить обработку события открытия окна

            StatisticsEvent.ReloadScreen -> {} // TODO: добавить обработку события перезагрузки окна
        }
    }

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
fun StatisticsScreenPreview() {
    FishGalleryTheme {
        StatisticsScreen(rememberNavController())
    }
}
