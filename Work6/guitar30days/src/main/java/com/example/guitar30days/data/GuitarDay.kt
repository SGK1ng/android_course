package com.example.guitar30days.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Номер дня и ресурсы для карточки урока.
data class GuitarDay(
    val day: Int,
    @param:StringRes val titleRes: Int,
    @param:StringRes val descriptionRes: Int,
    @param:DrawableRes val imageRes: Int
)
