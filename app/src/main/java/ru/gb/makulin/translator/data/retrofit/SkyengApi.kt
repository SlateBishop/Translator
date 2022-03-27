package ru.gb.makulin.translator.data.retrofit

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import ru.gb.makulin.translator.data.model.DataDTO

const val SKYENG_API_END_POINT_SEARCH = "words/search"
const val SKYENG_API_SEARCH_NAME = "search"

interface SkyengApi {

    @GET(SKYENG_API_END_POINT_SEARCH)
    fun search(@Query(SKYENG_API_SEARCH_NAME) wordToSearch: String): Observable<List<DataDTO?>>

}