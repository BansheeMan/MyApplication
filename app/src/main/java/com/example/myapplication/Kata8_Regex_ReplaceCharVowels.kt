package com.example.myapplication

import java.lang.Math.abs

class Kata8_Regex_ReplaceCharVowels {

    fun replace(s: String): String = s.replace(Regex("[aeiouAEIOU]"),"!")

    fun replace1(s: String): String = s.replace(Regex("a|e|i|o|u", RegexOption.IGNORE_CASE), "!")

    fun replace2(s: String): String = s.lowercase().replace(Regex("[aeiou]")) {
        when (it.value) {
            "a" -> "!"
            "e" -> "!"
            "i" -> "!"
            "o" -> "!"
            "u" -> "!"
            else -> it.value
        }
    }

    fun replace3(s: String) = s.replace(Regex("[aeiouAEIOU]"), "!")

    fun replace4(s: String) = s.map { if (it in "aeiouAEIOU") '!' else it}.joinToString("")


}