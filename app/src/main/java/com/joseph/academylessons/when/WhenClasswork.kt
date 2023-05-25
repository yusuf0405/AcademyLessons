package com.joseph.academylessons.`when`

import android.util.Log

class WhenClasswork {



    init {
        val temperature: Int = 15
        var temperatureMessage: String = ""

        when (temperature) {
            in 0..20 -> {
                temperatureMessage = "Холодная"
            }
            in 0 downTo -20 -> {
                temperatureMessage = "Мороз"
            }
            in 20..40 -> {
                temperatureMessage = "Жарко"
            }
            in -20 downTo -100 -> {
                temperatureMessage = "Анамальный холод"
            }
            in 40..180 -> {
                temperatureMessage = "Анамальная жара"
            }
            else -> {
                temperatureMessage = "Очень тепло или же холдно"
            }
        }

        Log.i("ITAcademy", temperatureMessage)

    }
}