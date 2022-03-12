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

    fun twiceAsOld1(dadYearsOld: Int, sonYearsOld: Int) =
        if (dadYearsOld >= 2 * sonYearsOld) dadYearsOld - 2 * sonYearsOld else 2 * sonYearsOld - dadYearsOld


    fun twiceAsOld2(dadYearsOld: Int, sonYearsOld: Int): Int = Math.abs(dadYearsOld - (sonYearsOld * 2))
}