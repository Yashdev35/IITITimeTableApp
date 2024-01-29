package com.example.inductionprojectiititimetableapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.inductionprojectiititimetableapp.Data.CSEFriday
import com.example.inductionprojectiititimetableapp.Data.Holiday
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.LectureList
import com.example.inductionprojectiititimetableapp.Screens.LectureSchedule
import com.example.inductionprojectiititimetableapp.Screens.MediatorScreen
import com.example.inductionprojectiititimetableapp.Screens.Screen
import java.time.LocalDate

@Composable
fun AppNavigation(
    navController : NavHostController
){
val listViewModel : AppViewModel = viewModel()
val viewState by listViewModel.lectureListState

    NavHost(navController = navController, startDestination = Screen.MediatorBetHomeScreen.route){
        composable(Screen.MediatorBetHomeScreen.route){
            MediatorScreen(navigateToLectureSchedule = {
                  navController.currentBackStackEntry?.savedStateHandle?.set("lectureList",it)
                    navController.navigate(Screen.LectureScheduleScreen.route)
            }, viewState = viewState)
        }
        composable(Screen.LectureScheduleScreen.route){
            val lectureList = navController.previousBackStackEntry?.savedStateHandle?.get<LectureList>("lectureList")?:null
            if (lectureList != null) {
                LectureSchedule(listOfLecturesOfDay = lectureList, navController)
            }
        }
    }
}

@Preview
@Composable
fun PreviewAppNavigation(){
      LectureSchedule(listOfLecturesOfDay = CSEFriday, rememberNavController())
    //this is just a preview of the app navigation
    //jai shree ram, jai shivray , jai shree ram
}
