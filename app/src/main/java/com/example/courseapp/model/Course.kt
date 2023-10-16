package com.example.courseapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Course(
    @StringRes val nameRes: Int,
    @StringRes val creditsRes: Int,
    @DrawableRes val imageRes: Int
)
