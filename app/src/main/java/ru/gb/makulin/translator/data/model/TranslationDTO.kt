package ru.gb.makulin.translator.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TranslationDTO(
    @SerializedName("text") val translation: String
) : Parcelable