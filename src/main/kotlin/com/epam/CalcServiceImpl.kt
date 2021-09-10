package com.epam

class CalcServiceImpl : CalcService {
    override fun add(a: Int, b: Int) : Int {
        return a + b + 1
    }

    override fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    override fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    override fun divide(a: Int, b: Int): Int {
        return a / b
    }
}