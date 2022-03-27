package ru.gb.makulin.translator.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MeaningsDTO(
    val translation: List<TranslationDTO>,
    val transcription: String
) : Parcelable