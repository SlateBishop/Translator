package ru.gb.makulin.translator.data.datasource

import io.reactivex.rxjava3.core.Observable
import ru.gb.makulin.translator.data.model.DataDTO
import ru.gb.makulin.translator.data.model.SearchRequestDTO

interface DataSource<T> {

    fun getData(request: SearchRequestDTO): Observable<List<DataDTO?>>
}