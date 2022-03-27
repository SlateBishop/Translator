package ru.gb.makulin.translator.data.retrofit

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiHolder {

    const val SKYENG_API_BASE_URL = "https://dictionary.skyeng.ru/api/public/v1/"

    val skyengApi by lazy {
        retrofit.create<SkyengApi>()
    }

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(SKYENG_API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
    }

    private val gson by lazy {
        GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create()
    }
}