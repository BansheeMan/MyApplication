package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        val str1 = "Поцелуй Мой Блестящий Зад"
        val num1 = 1298
        val arr1 = intArrayOf(1,2,3,4,5)

        val map1 = mapOf(
            "Java" to 10,
            "Ruby" to 80,
            "Python" to 65)

        val map2 = mapOf(
            "Hindi" to 60,
            "Dutch" to 93,
            "Greek" to 71)

        val map3 = mapOf(
            "C++" to 50,
            "ASM" to 10,
            "Haskell" to 20)

       print(myLanguages(map1))
       print(myLanguages(map2))
       print(myLanguages(map3))

    }

    private fun myLanguages(s: Map<String, Int>): Map<String, Int> {
        val newMap = mutableMapOf<String, Int>()
        for((key,  value) in s){
            if (value >= 60){
                newMap += key to value
            }
        }
    return s
    }




    fun print(item: String){
        Log.d("MyLog", item)
    }

    fun print(item: Int){
        Log.d("MyLog", "$item")
    }

    fun print(arr: IntArray){
        var str = "arr: "
        arr.forEach { a ->
            str = "$str $a"
        }
        Log.d("MyLog", "$str")
    }

    fun print(arr: Array<Int>){
        var str = "arr: "
        arr.forEach { a ->
            str = "$str $a"
        }
        Log.d("MyLog", "$str")
    }

    fun print(item: Boolean){
        Log.d("MyLog", item.toString())
    }

    private fun print(myMap: Map<String, Int>){
        var str = "MAP: "
        for((key,  value) in myMap){
            str += "$key => $value | "

        }
        Log.d("MyLog", str)
    }
}

