// Общие плагины объявлены здесь, а подключаются в модулях.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
}