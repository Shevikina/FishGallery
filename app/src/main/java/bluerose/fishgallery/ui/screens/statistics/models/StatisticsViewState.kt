package bluerose.fishgallery.ui.screens.statistics.models

sealed class StatisticsViewState {
    data object Loading : StatisticsViewState()
    data class Error(val description: String, val icon: Int) : StatisticsViewState()
    data class Display(val fishCatch: Int, val profit: Int, val partners: Int) : StatisticsViewState()
}