package com.epam.sup

class CalcSuperServiceImpl : CalcSuperService {
    override fun addSuper(a: Int, b: Int, c: Int): Int {
        return a + b + c + 2
    }

    override fun multiplySuper(a: Int, b: Int, c: Int): Int {
        return a * b * c
    }
}