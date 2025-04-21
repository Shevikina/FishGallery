package bluerose.fishgallery.models.events

sealed class StatisticsEvent {
    data object EnterScreen : StatisticsEvent()
    data object ReloadScreen : StatisticsEvent()
}