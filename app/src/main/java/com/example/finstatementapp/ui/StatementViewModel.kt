package com.example.finstatementapp.ui

import androidx.lifecycle.ViewModel
import com.example.finstatementapp.model.StatementTypeEnum

//TODO - Add a Use case in the constructor called StatementUseCase (it would be inside a class called Usecases.kt)
class StatementViewModel : ViewModel() {

    fun calculateBalance(type: String, userTyped: Double): Double {
        //This would be caught from the Room database
        val amount = 23000.47

        return when(type){
            StatementTypeEnum.POSITIVE.type -> amount + userTyped
            StatementTypeEnum.NEGATIVE.type -> amount - userTyped
            else -> 23000.47
        }
    }

}