package com.example.inductionprojectiititimetableapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.inductionprojectiititimetableapp.Data.CSEFriday
import com.example.inductionprojectiititimetableapp.Data.CSETuesday
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.LectureList
import com.example.inductionprojectiititimetableapp.Screens.HomeScreen
import com.example.inductionprojectiititimetableapp.Screens.LectureSchedule
import com.example.inductionprojectiititimetableapp.Screens.Screen
import java.time.LocalDate

@Composable
fun AppNavigation(
    navController : NavHostController
){

    NavHost(navController = navController, startDestination = Screen.HomeScreen.route ){
        composable(Screen.HomeScreen.route){
            HomeScreen(navgateToLectureSchedule = {
                navController.currentBackStackEntry?.savedStateHandle?.set("lecturelist", it)
                navController.navigate(Screen.LectureScheduleScreen.route)
            })
        }
        composable(Screen.LectureScheduleScreen.route){
               val lectureList = navController.previousBackStackEntry?.savedStateHandle?.get<LectureList>("lecturelist")?:LectureList(
                   listOf(),
                 LocalDate.now().dayOfWeek,
                 "Unknown",
                 0
                )
                LectureSchedule(listOfLecturesOfDay = lectureList, navController)
        }
    }
}

@Preview
@Composable
fun PreviewAppNavigation(){
      LectureSchedule(listOfLecturesOfDay = CSEFriday, rememberNavController())
}
