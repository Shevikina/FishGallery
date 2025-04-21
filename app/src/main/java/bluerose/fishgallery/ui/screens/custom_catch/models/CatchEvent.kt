package bluerose.fishgallery.ui.screens.custom_catch.models

sealed class CatchEvent {
    data object EnterScreen : CatchEvent()
    data object ReloadScreen : CatchEvent()
}