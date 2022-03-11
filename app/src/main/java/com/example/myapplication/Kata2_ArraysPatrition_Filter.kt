package com.example.myapplication

import java.lang.Math.abs

class Kata2_ArraysPatrition_Filter {

    fun countPositivesSumNegatives0(input: Array<Int>?): Array<Int> {
        if(input == null || input.isEmpty()) return emptyArray()
        val (positive, negative) = input.partition { it>0 }
        return arrayOf(positive.count(), negative.sum())
    }

    fun countPositivesSumNegatives1(input: Array<Int>?): Array<Int> {
        if(input == null || input.size == 0) return emptyArray()
        val (positive, negative) = input.partition { it>0 }
        return arrayOf(positive.count(), negative.sum())
    }

    fun countPositivesSumNegatives2(input : Array<Int>?) : Array<Int> =
        if (input == null || input.isEmpty())
            arrayOf()
        else
            arrayOf(input.filter{ it > 0 }.count(), input.filter{ it < 0 }.sum())



}