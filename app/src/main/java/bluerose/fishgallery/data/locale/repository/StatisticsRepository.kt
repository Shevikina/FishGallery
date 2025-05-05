package bluerose.fishgallery.data.locale.repository

import bluerose.fishgallery.data.locale.Database
import bluerose.fishgallery.data.locale.entity.FishCatchDetails
import bluerose.fishgallery.data.locale.entity.StatisticsDetails

class StatisticsRepository {
    fun getCommonStatistics(): StatisticsDetails = Database.statisticsDetails

    fun getFishCatchStatistics(): List<FishCatchDetails> = Database.catchList
}