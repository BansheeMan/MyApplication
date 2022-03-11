package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        print(countPositivesSumNegatives(arrayOf()))

    }

    fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
        if(input == null || input.size == 0) return emptyArray()
        val (positive, negative) = input.partition { it>0 }
        return arrayOf(positive.count(), negative.sum())
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

