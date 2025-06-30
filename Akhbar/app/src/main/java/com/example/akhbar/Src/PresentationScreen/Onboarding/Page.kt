package com.example.akhbar.Src.PresentationScreen.Onboarding

import androidx.annotation.DrawableRes
import com.example.akhbar.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val Image:Int,
)
val pages= listOf(
    Page(
        title = "Page 1",
        description = "Page one description",
        Image = R.drawable.onboard1
    ),  Page(
        title = "Page 2",
        description = "Page one description",
        Image = R.drawable.onboard2
    ),  Page(
        title = "Page 3 ",
        description = "Page one description",
        Image = R.drawable.onboard3
    ),
)

