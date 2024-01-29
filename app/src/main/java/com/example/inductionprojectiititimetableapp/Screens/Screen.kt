package com.example.inductionprojectiititimetableapp.Screens

sealed class Screen(val route: String) {
    object MediatorBetHomeScreen : Screen("mediator_screen")
    object LectureScheduleScreen : Screen("lecture_screen")
}