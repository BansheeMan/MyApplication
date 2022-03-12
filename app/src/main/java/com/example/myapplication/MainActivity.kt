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

        print(replace("Hiiiiia"))          //61000
        print(replace("Wowowowa"))            //3601000
        print(replace("alabAAAama"))            //3661000


    }

    fun replace(s: String): String = s.replace(Regex("[aeiouAEIOU]"),"!")

    fun replace1(s: String): String = s.lowercase().replace(Regex("[aeiou]")) {
        when (it.value) {
            "a" -> "!"
            "e" -> "!"
            "i" -> "!"
            "o" -> "!"
            "u" -> "!"
            else -> it.value
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

    fun print(item: Boolean){
        Log.d("MyLog", item.toString())
    }
}

