package ru.gb.makulin.translator.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchRequestDTO(
    val word: String
) : Parcelable
