package com.joseph.academylessons.arrays

import android.util.Log

class ArraysClassWork {

    init {
//        exampleFirst()
//        exampleSecond()
//        exampleThird()
//        exampleFour()
        exampleFifth()
    }

    fun exampleFirst() {
        val array: Array<Int> = arrayOf(1, 2, 3, 4)

        for (element in array) {
            Log.i("ITAcademy", element.toString())
        }

    }

    fun exampleSecond() {
        val names: Array<String> = arrayOf(
            "Bob",
            "Keane",
            "Michel",
            "Jack"
        )
        val bob: String = names.first()
        Log.i("ITAcademy", bob)
    }

    private fun exampleThird() {
        var i = 0
        val numbers: Array<Int> = Array(10, { i++ })
        for (number in numbers) {
            Log.i("ITAcademy", number.toString())
        }
    }

    fun exampleFour() {
        val array = mutableListOf<String>()
        Log.i(
            "ITAcademy",
            "Количество элементов в массиве = ${array.size}"
        )
        array.add("Bob")
        array.add("Michel")
        array.add(0, "Tom")
        array.add(2, "Jerry")

        Log.i(
            "ITAcademy",
            "Количество элементов в массиве = ${array.size}"
        )

        for (name in array) {
            Log.i(
                "ITAcademy",
                "Элемент = $name"
            )
        }
    }

    fun exampleFifth() {
        val array = mutableListOf<Double>()
        array.add(0.0)
        array.add(0.12)

        if (array.isNotEmpty()) {
            Log.i("ITAcademy", array.first().toString())
        } else {
            Log.i("ITAcademy", "Массив пустой")
        }

        array.removeAt(1)
        for (element in array) {
            Log.i("ITAcademy", element.toString())

        }
    }
}