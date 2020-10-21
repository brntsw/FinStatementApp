package com.example.finstatementapp.data.mock

import com.example.finstatementapp.domain.BalanceHistory
import com.example.finstatementapp.model.StatementTypeEnum

//This is a temporary class to replace for now Room
class MockBalanceHistory {

    companion object {
        fun getMockedBalanceHistoryList(): List<BalanceHistory> {
            val balanceHistoryList: ArrayList<BalanceHistory> = ArrayList()
            balanceHistoryList.add(getBalanceHistory(1))
            balanceHistoryList.add(getBalanceHistory(2))
            balanceHistoryList.add(getBalanceHistory(3))

            return balanceHistoryList
        }

        private fun getBalanceHistory(num: Int): BalanceHistory{
            return when(num){
                1 -> BalanceHistory(StatementTypeEnum.POSITIVE.type, 251.92, 23252.39)
                2 -> BalanceHistory(StatementTypeEnum.NEGATIVE.type, 131.94, 23120.45)
                3 -> BalanceHistory(StatementTypeEnum.NEGATIVE.type, 119.98, 23000.47)
                else -> BalanceHistory(StatementTypeEnum.POSITIVE.type, 0.0, 23000.47)
            }
        }
    }

}