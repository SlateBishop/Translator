package ru.gb.makulin.translator.domain

import ru.gb.makulin.translator.domain.model.DataModel

sealed class AppState {

    data class Success(val data: List<DataModel>?) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()

}
