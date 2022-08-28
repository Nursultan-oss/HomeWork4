package com.example.homework4.injector

import android.graphics.Color
import com.example.homework4.Presenter.Presenter
import com.example.homework4.model.CounterModel

class Injector {
    companion object{
        fun getPresenter(): Presenter{
            return Presenter()
        }
        fun getModel(): CounterModel{
            return CounterModel()
        }

    }
}