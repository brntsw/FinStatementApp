package com.example.finstatementapp.domain

import com.example.finstatementapp.model.StatementTypeEnum

data class BalanceHistory(
    val statementType: String,
    val value: Double,
    val amount: Double
) {
    override fun toString(): String {
        val sign =  if(statementType == StatementTypeEnum.POSITIVE.type) "+" else "-"

        return "$sign$value -> Balance: US$ $amount"
    }
}
