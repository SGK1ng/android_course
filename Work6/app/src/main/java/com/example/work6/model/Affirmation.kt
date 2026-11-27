package com.example.work6.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Карточка хранит идентификаторы ресурсов текста и изображения.
 */
data class Affirmation(
    @param:StringRes val stringResourceId: Int,
    @param:DrawableRes val imageResourceId: Int
)
