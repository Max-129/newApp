package com.example.newapp

import android.graphics.Color

interface CounterView {
    fun showNewCount(count: Int)
    fun showToast(message: String)
    fun showColor(color: Int)
}