package com.example.andy.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.andy.colormyview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 初始化 Event
        initEvent()
    }

    /** 初始化 Event */
    private fun initEvent() {
        binding.rootConstraint.setOnClickListener{ boxEvent(it) }
        binding.boxOneText.setOnClickListener{ boxEvent(it) }
        binding.boxTwoText.setOnClickListener{ boxEvent(it) }
        binding.boxThreeText.setOnClickListener{ boxEvent(it) }
        binding.boxFourText.setOnClickListener{ boxEvent(it) }
        binding.boxFiveText.setOnClickListener{ boxEvent(it) }
    }

    /** Box Event */
    private fun boxEvent(view: View) {
        when(view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}