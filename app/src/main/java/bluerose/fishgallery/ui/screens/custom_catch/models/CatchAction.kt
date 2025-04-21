package bluerose.fishgallery.ui.screens.custom_catch.models

sealed class CatchAction {
    data class ShowDialog(
        val title: String,
        val message: String,
        val buttonText: String
    ) : CatchAction()
}