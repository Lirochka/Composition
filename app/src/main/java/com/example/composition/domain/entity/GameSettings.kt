package com.example.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameSettings(
    val maxSumValue: Int, //максимальное значение суммы
    val minCountOfRightAnswers: Int,//мин. значение правильных ответов для победы
    val minPercentOfRightAnswers: Int,//мин. значение правильных ответов в % для победы
    val gameTimeInSecond: Int //время игры
): Parcelable
