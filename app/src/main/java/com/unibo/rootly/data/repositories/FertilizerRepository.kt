package com.unibo.rootly.data.repositories

import com.unibo.rootly.data.database.Fertilizer
import com.unibo.rootly.data.database.daos.FertilizerDao
import java.time.LocalDate

class FertilizerRepository(
    private val fertilizerDao: FertilizerDao
) {
    suspend fun insert(fertilizer: Fertilizer) = fertilizerDao.insertFertilizer(fertilizer)

    fun getDuesBeforeDateFavorites(userId: Int, date: LocalDate = LocalDate.now()) = fertilizerDao.getFertilizeBeforeDateFavorites(userId,date)

    fun getAllFavorites(userId: Int) = fertilizerDao.getAllFertilizeFavorites(userId)

    fun getDuesBeforeDate(userId: Int, date: LocalDate = LocalDate.now()) = fertilizerDao.getFertilizeBeforeDate(userId,date)

    fun getAll(userId: Int) = fertilizerDao.getAllFertilize(userId)

    suspend fun remove(plantId: Int, date: LocalDate) {
        fertilizerDao.removeFertilize(plantId,date)
    }

    fun getLastFertilizeDate(plantId: Int) = fertilizerDao.getLastFertilizeDate(plantId)

    fun getTimesFertilized(userId: Int) = fertilizerDao.getTimesFertilized(userId)
}