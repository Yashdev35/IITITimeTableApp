package com.example.inductionprojectiititimetableapp.Screens

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object LectureScheduleScreen : Screen("lecture_screen")
}