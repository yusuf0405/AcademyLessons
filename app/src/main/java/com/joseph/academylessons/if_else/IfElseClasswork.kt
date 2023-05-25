package com.joseph.academylessons.if_else

import android.util.Log

class IfElseClasswork {

    init {


        // Пример первый

        val isSubscribe: Boolean = false
        var message: String = ""

        if (isSubscribe) {
            message = "У ваc есть подписка"
        } else {
            message = "У ваc нету подписки"
        }

        Log.i("ITAcademy", message)

        // Пример второй

        val age: Int = -33
        var userMessage: String = ""

        if (age < 0) {
            userMessage = "Введите нормальный возраст"
        } else if (age >= 0 && age <= 10) {
            userMessage = "Дитя"
        } else if (age >= 10 && age <= 20) {
            userMessage = "Подросток"
        } else if (age >= 20 && age < 30) {
            userMessage = "Молодость"
        } else if (age >= 30 && age <= 55) {
            userMessage = "Средний возраст"
        } else {
            userMessage = "Старость"
        }

        Log.i("ITAcademy", userMessage)


        //Пример третий
        val temperature: Double = 25.0
        var temperatureMessage: String = ""

        if (temperature >= 0 && temperature <= 20) {
            temperatureMessage = "Холодная"
        } else if (temperature >= -20 && temperature <= 0) {
            temperatureMessage = "Мороз"
        } else if (temperature >= 20 && temperature <= 40) {
            temperatureMessage = "Жарко"
        } else if (temperature <= -20) {
            temperatureMessage = "Анамальный холод"
        } else {
            temperatureMessage = "Анамальная жара"
        }
        Log.i("ITAcademy", temperatureMessage)


    }


}