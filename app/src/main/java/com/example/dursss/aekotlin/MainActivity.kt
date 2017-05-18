package com.example.dursss.aekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        val tv = findViewById(R.id.sample_text) as TextView
        tv.text = stringFromJNI()
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this applicationc.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }

    fun demo() {
        var a: Int = 1//声明类型是Int并且赋值
        var b = 2//自动判断出类型是Int
        var c: Int //声明类型是Int暂时不赋值
    }
}
