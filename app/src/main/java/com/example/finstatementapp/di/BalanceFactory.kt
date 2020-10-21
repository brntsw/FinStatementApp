package com.example.finstatementapp.di

import com.example.finstatementapp.domain.BalanceCalculus

//TODO - It needs to be converted to Hilt / Koin or another DI tool
class BalanceFactory {

    companion object {
        fun getBalanceCalculus(): BalanceCalculus {
            return BalanceCalculus()
        }
    }

}