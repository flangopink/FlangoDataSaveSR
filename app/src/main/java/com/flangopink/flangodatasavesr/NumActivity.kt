package com.flangopink.flangodatasavesr

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class NumActivity : AppCompatActivity() {

    private var counter = 0
    private var prefs:SharedPreferences? = null
    lateinit var tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num)
        tv = findViewById(R.id.textView)
        prefs = getSharedPreferences("prefs", MODE_PRIVATE)
        counter = prefs?.getInt("counter", 0)!!
        tv.text = counter.toString()
    }

    fun clickAdd(view:View){
        counter++
        tv.text = counter.toString()
    }

    fun clickSub(view:View){
        counter--
        tv.text = counter.toString()
    }

    fun clickSave(view:View) {
        saveData(counter)
    }

    private fun saveData(result:Int){
        val editor = prefs?.edit()
        editor?.putInt("counter", result)
        editor?.apply()
    }
}