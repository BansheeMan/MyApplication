package com.example.myapplication

import java.lang.Math.abs

class Kata7_reduce_forEach_arr {


    fun grow2(arr: IntArray): Int = arr.reduce { a, b -> a * b }


    fun grow1(arr: IntArray): Int {
        var result : Int =1
        arr.forEach {
            result *= it
        }
        return result
    }

    fun grow(arr: IntArray): Int {
        var w : Int = 1
        for(i in arr.indices){w*=arr[i]}
        return w
    }

}