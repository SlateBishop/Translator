package ru.gb.makulin.translator.data.datasource

import io.reactivex.rxjava3.core.Observable
import ru.gb.makulin.translator.data.model.DataDTO
import ru.gb.makulin.translator.domain.model.DataModel
import ru.gb.makulin.translator.domain.model.SearchRequestModel
import ru.gb.makulin.translator.domain.repository.Repository
import ru.gb.makulin.translator.utils.mapToModel
import ru.gb.makulin.translator.utils.toDTO

class RepositoryImpl(
    private val dataSource: DataSource<List<DataDTO>>
) : Repository<List<DataModel>> {
    override fun getData(request: SearchRequestModel): Observable<List<DataModel?>> =
        dataSource
            .getData(request.toDTO())
            .map {
                it.mapToModel() //FIXME null-safety
            }
}