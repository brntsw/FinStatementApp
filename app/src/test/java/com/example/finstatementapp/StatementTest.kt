package com.example.finstatementapp

import com.example.finstatementapp.di.BalanceFactory
import com.example.finstatementapp.domain.ICalculus
import com.example.finstatementapp.model.StatementTypeEnum
import com.example.finstatementapp.ui.StatementViewModel
import com.nhaarman.mockitokotlin2.mock
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class StatementTest {

    var balance: Double = 0.0
    private val balanceCalculus: ICalculus = BalanceFactory.getBalanceCalculus()

    @Before
    fun before() {
        balance = 23000.47
    }

    @Test
    fun `Test if result is positive`() {
        val statementType = StatementTypeEnum.POSITIVE.type
        val userTyped = 221.0

        assertEquals(23221.47, balanceCalculus.calculate(statementType, userTyped, 23000.47), 0.01)
    }

    @Test
    fun `Test if the result reduces the balance`() {
        val statementType = StatementTypeEnum.NEGATIVE.type
        val userTyped = 459.53

        assertEquals(22540.94, balanceCalculus.calculate(statementType, userTyped, 23000.47), 0.01)
    }

    @Test
    fun `Check if a negative input is handled`() {
        var statementType = StatementTypeEnum.POSITIVE.type
        val userTyped = -112.0

        assertEquals(23112.47, balanceCalculus.calculate(statementType, userTyped, 23000.47), 0.01)

        statementType = StatementTypeEnum.NEGATIVE.type

        assertEquals(22888.47, balanceCalculus.calculate(statementType, userTyped, 23000.47), 0.01)
    }

}