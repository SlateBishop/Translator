package ru.gb.makulin.translator.domain.repository

import io.reactivex.rxjava3.core.Observable
import ru.gb.makulin.translator.domain.model.DataModel
import ru.gb.makulin.translator.domain.model.SearchRequestModel


interface Repository<T> {

    fun getData(request: SearchRequestModel): Observable<List<DataModel?>>
}