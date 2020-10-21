package com.example.finstatementapp

import com.example.finstatementapp.model.StatementTypeEnum
import com.example.finstatementapp.ui.StatementViewModel
import com.nhaarman.mockitokotlin2.mock
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class StatementTest {

    var balance: Double = 0.0
    private val statementViewModel: StatementViewModel = mock()

    @Before
    fun before() {
        balance = 23000.47
    }

    @Test
    fun `Test if result is positive`() {
        val statementType = StatementTypeEnum.POSITIVE.type
        val userTyped = 221.0

        assertEquals(230221.47, statementViewModel.calculateBalance(statementType, userTyped), 0.01)
    }

    @Test
    fun `Test if the result reduces the balance`() {
        val statementType = StatementTypeEnum.NEGATIVE.type
        val userTyped = 459.53

        assertEquals(22540.94, statementViewModel.calculateBalance(statementType, userTyped), 0.01)
    }

    @Test
    fun `Check if an incorrect input is handled`() {
        val statementType = StatementTypeEnum.POSITIVE.type
        val userTyped = -112.0

        assertEquals(23000.47, statementViewModel.calculateBalance(statementType, userTyped), 0.01)
    }

}