package ru.gb.makulin.translator.data.datasource

import io.reactivex.rxjava3.core.Observable
import ru.gb.makulin.translator.data.model.DataDTO
import ru.gb.makulin.translator.data.model.SearchRequestDTO
import ru.gb.makulin.translator.data.retrofit.ApiHolder

class DataSourceRemote() : DataSource<List<DataDTO>> {

    override fun getData(request: SearchRequestDTO): Observable<List<DataDTO?>> =
        ApiHolder
            .skyengApi
            .search(request.word)
}