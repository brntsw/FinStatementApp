package com.example.finstatementapp.domain

interface ICalculus {

    fun calculate(type: String, value: Double, total: Double): Double

}