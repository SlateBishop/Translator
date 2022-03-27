package ru.gb.makulin.translator.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataDTO(
    @SerializedName("text") val inputWord: String,
    val meanings: List<MeaningsDTO>
) : Parcelable
