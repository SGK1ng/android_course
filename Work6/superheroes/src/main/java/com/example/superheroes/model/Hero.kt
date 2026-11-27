package com.example.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Карточка героя хранит ссылки на локализуемый текст и изображение.
data class Hero(
    @param:StringRes val nameRes: Int,
    @param:StringRes val descriptionRes: Int,
    @param:DrawableRes val imageRes: Int
)
