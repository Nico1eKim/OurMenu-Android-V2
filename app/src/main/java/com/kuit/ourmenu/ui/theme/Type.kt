package com.kuit.ourmenu.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.kuit.ourmenu.R

val PretendardBold = FontFamily(Font(R.font.bold))
val PretendardSemiBold = FontFamily(Font(R.font.semibold))
val PretendardRegular = FontFamily(Font(R.font.regular))

data class OurMenuTypography(
    val pretendard_700_48: TextStyle =
        TextStyle(
            fontFamily = PretendardBold,
            fontSize = 48.sp,
        ),
    val pretendard_600_32: TextStyle =
        TextStyle(
            fontFamily = PretendardSemiBold,
            fontSize = 32.sp,
        ),
    val pretendard_500_28: TextStyle =
        TextStyle(
            fontFamily = PretendardRegular,
            fontSize = 28.sp,
        ),
    val pretendard_500_24: TextStyle =
        TextStyle(
            fontFamily = PretendardRegular,
            fontSize = 24.sp,
        ),
    val pretendard_500_20: TextStyle =
        TextStyle(
            fontFamily = PretendardRegular,
            fontSize = 20.sp,
        ),
    val pretendard_500_18: TextStyle =
        TextStyle(
            fontFamily = PretendardRegular,
            fontSize = 18.sp,
        ),
    val pretendard_500_16: TextStyle =
        TextStyle(
            fontFamily = PretendardRegular,
            fontSize = 16.sp,
        ),
    val pretendard_500_14: TextStyle =
        TextStyle(
            fontFamily = PretendardRegular,
            fontSize = 14.sp,
        ),
    val pretendard_500_12: TextStyle =
        TextStyle(
            fontFamily = PretendardRegular,
            fontSize = 12.sp,
        ),
) {
    fun copy(): OurMenuTypography = this

    fun update(other: OurMenuTypography) {}
}

fun ourMenuTypography(): OurMenuTypography = OurMenuTypography()
