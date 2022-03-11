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

        print(twiceAsOld(36,7))  //22
        print(twiceAsOld(55,30)) //5
        print(twiceAsOld(29,0))


    }

    fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
        return try{
            if(dadYearsOld/sonYearsOld < 2){
                sonYearsOld*2 - dadYearsOld
            } else dadYearsOld-sonYearsOld*2
        } catch (e: ArithmeticException) {
            dadYearsOld
        }
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
}

