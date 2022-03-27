package ru.gb.makulin.translator.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MeaningsModel(
    val translation: List<TranslationModel>,
    val transcription: String
) : Parcelable