package bluerose.fishgallery.data.locale

import bluerose.fishgallery.R
import bluerose.fishgallery.data.locale.entity.StatisticsDetails
import bluerose.fishgallery.data.locale.entity.FishCatchDetails

object Database {
    val statisticsDetails = StatisticsDetails(
        profit = 5400000.0,
        fishCatch = 108000000,
        partnerCount = 1500
    )

    val catchList = listOf(
        FishCatchDetails(
            fishName = "Призрачный дельфи",
            fishCatch = "50 000 000",
            imageId = R.drawable.app1_image1
        ),
        FishCatchDetails(
            fishName = "Алмазный ус",
            fishCatch = "48 000 000",
            imageId = R.drawable.app1_image2
        ),
        FishCatchDetails(
            fishName = "Шестиперая аку",
            fishCatch = "10 000 000",
            imageId = R.drawable.app1_image3,
        )
    )
}