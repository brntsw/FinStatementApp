package com.example.finstatementapp.domain

import com.example.finstatementapp.domain.exceptions.Failure
import com.example.finstatementapp.domain.repository.BalanceHistoryRepository
import java.lang.Exception

class GetBalanceHistoryUseCase(private val balanceHistoryRepository: BalanceHistoryRepository)
    : BaseUseCase<List<BalanceHistory>, GetBalanceHistoryUseCase.Params>() {

    override suspend fun run(params: Params) : Either<Failure, List<BalanceHistory>> {
        return try {
            val balanceHistoryList = balanceHistoryRepository.getBalanceHistory()
            Either.Right(balanceHistoryList)
        }
        catch(e: Exception) {
            Either.Left(GetBalanceHistoryFailure(e))
        }
    }

    data class Params(val value: Double)

    data class GetBalanceHistoryFailure(val error: Exception) : Failure.FeatureFailure(error)

}