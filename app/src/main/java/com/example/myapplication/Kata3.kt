package com.example.myapplication

import java.lang.Math.abs

class Kata3 {

    fun litres1(time: Double): Int { return (time/2).toInt() }

    fun litres2(time: Double) = Math.floor(time/2).toInt()

    fun litres3(time: Double) = time.toInt() / 2


}