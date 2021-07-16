package com.devapp20201.room4app

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var clazz: Class<*>? = null
        clazz = Class.forName("android.os.SystemProperties")
        val method = clazz.getDeclaredMethod("get", String::class.java)
        val prop = method.invoke(null, "APBackgroundColor") as String
        Log.e("so_test", "my prop is: <$prop>")

        changeBackground(prop)

    }
    private fun changeBackground(prop: String){
        val newView = findViewById<View>(R.id.clBg)
        if (prop.equals("dark")){
            newView.setBackgroundColor(Color.BLUE)
        }else{
            newView.setBackgroundColor(Color.LTGRAY)
        }
    }
}