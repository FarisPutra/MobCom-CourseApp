package com.example.courseapp.model

import com.example.courseapp.R

object CourseRepository {
    val courses = listOf<Course>(
        Course(
            nameRes = R.string.course_1_name,
            creditsRes = R.string.course_1_credits,
            imageRes = R.drawable.literature_1
        ),
        Course(
            nameRes = R.string.course_2_name,
            creditsRes = R.string.course_2_credits,
            imageRes = R.drawable.literature_1
        ),
        Course(
            nameRes = R.string.course_3_name,
            creditsRes = R.string.course_3_credits,
            imageRes = R.drawable.certificate_1
        ),
        Course(
            nameRes = R.string.course_4_name,
            creditsRes = R.string.course_4_credits,
            imageRes = R.drawable.bus_1
        ),
        Course(
            nameRes = R.string.course_5_name,
            creditsRes = R.string.course_5_credits,
            imageRes = R.drawable.analytics_1
        ),
        Course(
            nameRes = R.string.course_6_name,
            creditsRes = R.string.course_6_credits,
            imageRes = R.drawable.math_1
        ),
        Course(
            nameRes = R.string.course_7_name,
            creditsRes = R.string.course_7_credits,
            imageRes = R.drawable.calculation_1
        ),
        Course(
            nameRes = R.string.course_8_name,
            creditsRes = R.string.course_8_credits,
            imageRes = R.drawable.laptop_1
        ),
        Course(
            nameRes = R.string.course_9_name,
            creditsRes = R.string.course_9_credits,
            imageRes = R.drawable.laptop_1
        ),
        Course(
            nameRes = R.string.course_10_name,
            creditsRes = R.string.course_10_credits,
            imageRes = R.drawable.globe_1
        )
    )
}