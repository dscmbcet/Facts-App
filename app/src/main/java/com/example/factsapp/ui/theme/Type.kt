package com.example.factsapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.factsapp.R

//// Set of Material typography styles to start with
//val Typography = Typography(
//        body1 = TextStyle(
//                fontFamily = FontFamily.Default,
//                fontWeight = FontWeight.Normal,
//                fontSize = 16.sp
//        )
//        /* Other default text styles to override
//    button = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.W500,
//        fontSize = 14.sp
//    ),
//    caption = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 12.sp
//    )
//    */
//)

val jetBrainsMonoFamily = FontFamily(
        Font(R.font.jet_brains_mono_regular),
        Font(R.font.jet_brains_mono_bold, FontWeight.Bold),
        Font(R.font.jet_brains_mono_light, FontWeight.Light)
)

val Typography = Typography(
        body1 = TextStyle(
                fontFamily = jetBrainsMonoFamily,
                fontSize = 16.sp,
        ),
        body2 = TextStyle(
                fontFamily = jetBrainsMonoFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
        ),
        subtitle1 = TextStyle(
                fontFamily = jetBrainsMonoFamily,
                fontWeight = FontWeight.Light,
                fontSize = 12.sp,
                color = Color.Gray
        ),
)

