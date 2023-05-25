package com.joseph.academylessons.collections

import android.util.Log

class CollectionsClassWork {

    init {
//        exampleFirst()
//        exampleSecond()
//        exampleThird()
        exampleFour()

    }

    private fun exampleFirst() {
        // создание типа лист
        val list = listOf<Short>()

        // создание типа мютаблист
        val mutableList = mutableListOf<String>()

        // Обект лист мы в дальнейшем не можем изменять
        //list.add - отсуствует
        //list.remove - отсуствует

        //Обычное добавление
        mutableList.add(element = "Bob")

        //Выборочное добавление
        mutableList.add(index = 0, element = "Tom")

        //Обычное удаление обекта
        mutableList.remove(element = "Bob")

        //Обычное удаление с помошью индекса
        mutableList.removeAt(index = 0)

        //Пример добавление одного списка к другому
        val secondMutableList = mutableListOf<String>()
        secondMutableList.add("Taxi")
        secondMutableList.add("NARUTO")

        mutableList.addAll(elements = secondMutableList)
        mutableList.add("passenger")

        Log.i("ITAcademy", mutableList.toString())

        mutableList.clear()
        Log.i("ITAcademy", mutableList.toString())

        //Способ перебирать обекты с помошью for
        for (element in mutableList) {
        }

        //Способ перебирать обекты с помошью forEach
        mutableList.forEach { element ->
        }
    }

    private fun exampleSecond() {
        val set = setOf<String>()
        val mutableSet = mutableSetOf<String>()

        mutableSet.add("Bob")
        mutableSet.add("Bob")

        Log.i("ITAcademy", mutableSet.toString())

        mutableSet.remove("Bob")

        mutableSet.forEach { element ->
        }

        mutableSet.forEachIndexed { index, element ->
        }
    }

    private fun exampleThird() {
        val map = mapOf<String, Int>()
        val mutableMap = mutableMapOf<String, Int>()

        mutableMap.put(key = "1234", value = 9)
        mutableMap.put(key = "", value = 10)

        val nine = mutableMap[""]

        Log.i("ITAcademy", nine.toString())
    }

    private fun exampleFour() {
        val hashSet = hashSetOf<String>()
        hashSet.add("dd")
        hashSet.add("dd")
        Log.i("ITAcademy", hashSet.toString())
    }

}