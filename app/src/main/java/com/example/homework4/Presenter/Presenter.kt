package com.example.homework4.Presenter

import com.example.homework4.View.CounterView
import com.example.homework4.injector.Injector

class Presenter {
  private  val model= Injector.getModel()
    lateinit var view: CounterView
    fun inCrement(){
        model.inCrement()
        view.updateText(model.getCount().toString())
        if (model.getCount() ==10){
            view.showToast()
        }
        if (model.getCount() ==15){
            view.colorChanche()
        }
    }
    fun deCrement(){
        model.deCrement()
        view.updateText(model.getCount().toString())
    }
    fun attachView(view: CounterView){
        this.view = view
    }
}