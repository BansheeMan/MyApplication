package com.example.myapplication

import java.lang.Math.abs

class Kata6_Try_Catch {

    fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
        return try{
            if(dadYearsOld/sonYearsOld < 2){
                sonYearsOld*2 - dadYearsOld
            } else dadYearsOld-sonYearsOld*2
        } catch (e: ArithmeticException) {
            dadYearsOld
        }
    }

}