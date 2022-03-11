package com.example.myapplication

import java.lang.Math.abs
import java.lang.Math.ceil

class Kata5_century_StringIT {

    fun century(number: Int) = if(number%100==0) number/100 else number/100+1

    fun century1(number: Int) = (number +99) / 100

    fun century2(number: Int) = ceil(number / 100.0).toInt()

    //--------------------------------------------------------------------------
    val greet: (String)->String = {"Hello, $it how are you doing today?"}

}