package com.example.finstatementapp.data

import com.example.finstatementapp.data.mock.MockBalanceHistory
import com.example.finstatementapp.domain.BalanceHistory
import com.example.finstatementapp.domain.repository.BalanceHistoryRepository

class BalanceHistoryImpl : BalanceHistoryRepository {
    override suspend fun getBalanceHistory(): List<BalanceHistory> {
        //TODO It should be implemented using Room
        //This is just to get some mock data for now

        return MockBalanceHistory.getMockedBalanceHistoryList()
    }
}