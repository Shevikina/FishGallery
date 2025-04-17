package bluerose.fishgallery.models

sealed class CatchViewState{
    data object Loading : CatchViewState()
    data class Error(val description: String, val icon: Int) : CatchViewState()
    data class Display(val fishCatchGallery: List<String>) : CatchViewState()
}