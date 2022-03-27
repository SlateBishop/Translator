package ru.gb.makulin.translator.utils

import ru.gb.makulin.translator.data.model.DataDTO
import ru.gb.makulin.translator.data.model.MeaningsDTO
import ru.gb.makulin.translator.data.model.SearchRequestDTO
import ru.gb.makulin.translator.data.model.TranslationDTO
import ru.gb.makulin.translator.domain.model.DataModel
import ru.gb.makulin.translator.domain.model.MeaningsModel
import ru.gb.makulin.translator.domain.model.SearchRequestModel
import ru.gb.makulin.translator.domain.model.TranslationModel


@JvmName("mapDataModelToDTO")
fun List<DataModel>.mapToDTO(): List<DataDTO> = this.map {
    DataDTO(
        it.inputWord,
        it.meanings.mapToDTO()
    )
}

@JvmName("mapMeaningsModelToDTO")
fun List<MeaningsModel>.mapToDTO(): List<MeaningsDTO> = this.map {
    MeaningsDTO(
        it.translation.mapToDTO(),
        it.transcription
    )
}

@JvmName("mapTranslationModelToDTO")
fun List<TranslationModel>.mapToDTO(): List<TranslationDTO> = this.map {
    TranslationDTO(
        it.translation
    )
}

@JvmName("mapTranslationDTOToModel")
fun List<TranslationDTO>.mapToModel(): List<TranslationModel> = this.map {
    TranslationModel(
        it.translation
    )
}

@JvmName("mapMeaningsDTOToModel")
fun List<MeaningsDTO>.mapToModel(): List<MeaningsModel> = this.map {
    MeaningsModel(
        it.translation.mapToModel(),
        it.transcription
    )
}

@JvmName("mapDataDTOToModel")
fun List<DataDTO?>.mapToModel(): List<DataModel> = this.map {
    DataModel(
        it!!.inputWord, //FIXME null-safety
        it.meanings.mapToModel()
    )

}

fun SearchRequestModel.toDTO() : SearchRequestDTO = SearchRequestDTO(this.word)

