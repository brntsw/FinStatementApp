package com.example.finstatementapp.domain.repository

import com.example.finstatementapp.domain.BalanceHistory

interface BalanceHistoryRepository {

    suspend fun getBalanceHistory() : List<BalanceHistory>

}