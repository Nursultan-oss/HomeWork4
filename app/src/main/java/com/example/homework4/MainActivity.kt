package com.example.homework4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homework4.View.CounterView

import com.example.homework4.databinding.ActivityMainBinding
import com.example.homework4.injector.Injector

class MainActivity() : AppCompatActivity(), CounterView {
    var count = 0
   private val presenter = Injector.getPresenter()
    lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }


    private fun initClicker() {
        with(binding){
       InCrementBtn.setOnClickListener{
        presenter.inCrement()
       }
           decrementBtn.setOnClickListener{
              presenter.deCrement()
            }
        }

    }

    override fun updateText(count: String) {
        binding.counterTv.text = count
    }

    override fun showToast() {
        Toast.makeText(this, "Позравляем у вас 10",Toast.LENGTH_SHORT).show()
    }

    override fun colorChanche() {
binding.counterTv.setBackgroundColor(Color.GREEN)
    }


}
