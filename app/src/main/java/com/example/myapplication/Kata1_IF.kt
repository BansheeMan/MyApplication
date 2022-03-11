package com.example.myapplication

import java.lang.Math.abs

class Kata1_IF {

    private fun makeNegative0(x: Int):Int{
        var y = x
        if (x>0) y = x*-1
        return y
    }

    private fun makeNegative1(x: Int) = if(x>0) -x else x

    private fun makeNegative2(x: Int) = -abs(x)



}