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

        print(litres(6.7))

    }

    fun litres(time: Double): Int {
        return (time/2).toInt()
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

