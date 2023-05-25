package com.joseph.academylessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.joseph.academylessons.arrays.ArraysClassWork
import com.joseph.academylessons.collections.CollectionsClassWork
import com.joseph.academylessons.for_while.ForWhileClasswork
import com.joseph.academylessons.if_else.IfElseClasswork
import com.joseph.academylessons.`when`.WhenClasswork

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        IfElseClasswork()
//        WhenClasswork()
//        ForWhileClasswork()
        ArraysClassWork()
        CollectionsClassWork()

        // val
        // var
        var zagalovok: String = "Instagram"
        Log.i("AndroidAcademy", zagalovok)
        zagalovok = "Telegram"
        Log.i("AndroidAcademy", zagalovok)


        //
        val age: Int = 20
//        val age: String = "20"
        val year: Int = 5

        val sum: Int = age + year
        Log.i("androidAcademy=3++", sum.toString())

        val intNumber: Int = 4
        val shortNumber: Short = 4
        val byteNumber: Byte = 1
        val longNumber: Long = 42434242L

        val doubleMany = 38450.50
        val flotMany = 38450.50f

        val isRight: Boolean = true

        val symbol: Char = ' '

        val userMonyDisplay: String = doubleMany.toString() + " " + "R" + "fokefoe" + "oeodf"
        Log.i("Joseph", userMonyDisplay)

        val a: Int = 101
        val b: Int = 100

        val check = a == b


    }
}