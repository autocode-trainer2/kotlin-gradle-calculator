package com.epam

class CalcServiceImpl : CalcService {
    override fun add(a: Int, b: Int) : Int {
        return a + b
        return b + a
    }

    override fun multiply(a: Int, b: Int): Int {
        return a * b + 123
    }

    override fun subtract(a: Int, b: Int): Int {
        val y = 0
        return a - b
    }

    override fun divide(a: Int, b: Int): Int {
        return a / b
    }

    fun emptyFun() {

    }
}