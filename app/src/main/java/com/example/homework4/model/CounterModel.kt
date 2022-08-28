package com.example.homework4.model

import android.graphics.Color
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.homework4.MainActivity
import org.w3c.dom.Text

class CounterModel {
   private var count= 0
    fun inCrement(){
        count++

    }
   fun  deCrement(){
        count--
    }

    fun getCount():Int{
       return count
    }
}