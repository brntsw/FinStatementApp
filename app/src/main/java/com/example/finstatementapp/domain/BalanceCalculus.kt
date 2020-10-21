package com.example.finstatementapp.domain

import com.example.finstatementapp.model.StatementTypeEnum
import kotlin.math.abs

class BalanceCalculus : ICalculus {

    override fun calculate(type: String, value: Double, total: Double): Double {
        return when(type) {
            StatementTypeEnum.POSITIVE.type -> calculatePositiveType(value, total)
            StatementTypeEnum.NEGATIVE.type -> calculateNegativeType(value, total)
            else -> total
        }
    }

    private fun calculatePositiveType(value: Double, total: Double): Double {
        return abs(value) + total
    }

    private fun calculateNegativeType(value: Double, total: Double): Double {
        return total - abs(value)
    }

}