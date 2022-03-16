package com.example.myapplication

import android.util.Log

class Kata9_map_mutableMap {

    private fun myLanguages(s: Map<String, Int>): Map<String, Int> {
        val newMap = mutableMapOf<String, Int>()
        for((key,  value) in s){
            if (value >= 60){
                newMap += key to value
            }
        }
        return s
    }

    private fun myLanguages1(s: Map<String, Int>): Map<String, Int> {
        val newMap = mutableMapOf<String, Int>()
        s.forEach { (key,  value) ->
            if (value >= 60){ newMap += key to value }
        }
        return s
    }


    private fun print(myMap: Map<String, Int>){
        var str = "MAP: "
        for((key,  value) in myMap){
            str += "$key => $value | "

        }
        Log.d("MyLog", str)
    }
}