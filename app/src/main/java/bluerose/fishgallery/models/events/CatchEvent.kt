package bluerose.fishgallery.models.events

sealed class CatchEvent {
    data object EnterScreen : CatchEvent()
    data object ReloadScreen : CatchEvent()
}