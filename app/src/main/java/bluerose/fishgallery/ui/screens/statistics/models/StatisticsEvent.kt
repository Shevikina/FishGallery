package bluerose.fishgallery.ui.screens.statistics.models

sealed class StatisticsEvent {
    data object EnterScreen : StatisticsEvent()
    data object ReloadScreen : StatisticsEvent()
    data object OpenCatchScreen : StatisticsEvent()
    data object ShowContacts : StatisticsEvent()
}