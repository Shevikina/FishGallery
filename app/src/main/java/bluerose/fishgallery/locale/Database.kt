package bluerose.fishgallery.locale

import bluerose.fishgallery.R
import bluerose.fishgallery.ui.screens.custom_catch.models.CatchInfo

object Database {
    val catchList = listOf(
        CatchInfo(
            label = "Призрачный дельфи",
            catchValue = "50 000 000",
            imageId = R.drawable.app1_image1
        ),
        CatchInfo(
            label = "Алмазный ус",
            catchValue = "48 000 000",
            imageId = R.drawable.app1_image2
        ),
        CatchInfo(
            label = "Шестиперая аку",
            catchValue = "10 000 000",
            imageId = R.drawable.app1_image3,
        )
    )
}