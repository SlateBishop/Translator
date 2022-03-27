package ru.gb.makulin.translator.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TranslationModel(
    val translation: String
) : Parcelable