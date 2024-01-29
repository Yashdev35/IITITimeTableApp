package com.example.inductionprojectiititimetableapp

import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.LectureList
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.example.inductionprojectiititimetableapp.Data.CEWeek
import com.example.inductionprojectiititimetableapp.Data.CSEWeek
import com.example.inductionprojectiititimetableapp.Screens.LectureSchedule
import java.time.LocalDate
import java.time.LocalTime


fun LectureListAssigner(lecturesOfDay: List<LectureList>): LectureList{
    val currentDay = LocalDate.now().dayOfWeek
    val currentTime = LocalTime.now()
    var correctLectureList : LectureList = lecturesOfDay[0]


    if (currentTime<LocalTime.of(18,0)){
        for (lectureList in lecturesOfDay){
            if (lectureList.day == currentDay){
                correctLectureList = lectureList
                break
            }
        }
    }else {
        for (lectureList in lecturesOfDay){
            if (lectureList.day == (currentDay+1)){
                correctLectureList = lectureList
                break
            }
        }
    }
    return correctLectureList
}

@Preview
@Composable
fun PreviewLectureListAssigner(){

}

