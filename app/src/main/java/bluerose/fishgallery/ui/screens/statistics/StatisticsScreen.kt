package bluerose.fishgallery.ui.screens.statistics

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import bluerose.fishgallery.ui.navigation.NavScreen
import bluerose.fishgallery.ui.screens.statistics.models.StatisticsAction
import bluerose.fishgallery.ui.screens.statistics.models.StatisticsEvent
import bluerose.fishgallery.ui.screens.statistics.views.StatisticsViewDisplay
import bluerose.fishgallery.ui.theme.FishGalleryTheme
import bluerose.fishgallery.ui.theme.components.JetDialog

@Composable
fun StatisticsScreen(navController: NavController) {
    val viewAction = remember { mutableStateOf<StatisticsAction?>(null) }
    when (val action = viewAction.value) {
        is StatisticsAction.ShowDialog -> {
            Dialog(onDismissRequest = { viewAction.value = null }) {
                JetDialog(
                    title = action.title,
                    body = action.message,
                    buttonText = action.buttonText,
                    onClose = { viewAction.value = null }
                )
            }
        }

        else -> {}
    }

    StatisticsViewDisplay { event ->
        when (event) {
            is StatisticsEvent.OpenCatchScreen -> {
                navController.navigate(NavScreen.Catch)
            }

            is StatisticsEvent.ShowContacts -> {
                viewAction.value = StatisticsAction.ShowDialog(
                    title = "Наши контакты",
                    message = "E-mail: blue-rose@our.galaxy\nАдресат: Джонни Сильверхэд",
                    buttonText = "OK"
                )
            }

            is StatisticsEvent.EnterScreen -> {} // TODO: добавить обработку события открытия окна

            is StatisticsEvent.ReloadScreen -> {} // TODO: добавить обработку события перезагрузки окна
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun StatisticsScreenPreview() {
    FishGalleryTheme {
        StatisticsScreen(rememberNavController())
    }
}
