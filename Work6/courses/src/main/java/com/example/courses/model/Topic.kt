package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Название и картинка приходят из ресурсов; число курсов хранится напрямую.
data class Topic(
    @param:StringRes val name: Int,
    val availableCourses: Int,
    @param:DrawableRes val imageRes: Int
)
