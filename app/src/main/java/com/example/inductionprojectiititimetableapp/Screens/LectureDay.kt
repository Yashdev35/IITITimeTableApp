package com.example.inductionprojectiititimetableapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.inductionprojectiititimetableapp.Data.CSEFriday
import com.example.inductionprojectiititimetableapp.Data.CSEMonday
import com.example.inductionprojectiititimetableapp.Data.CSESaturday
import com.example.inductionprojectiititimetableapp.Data.CSEThursday
import com.example.inductionprojectiititimetableapp.Data.CSETuesday
import com.example.inductionprojectiititimetableapp.Data.CSEWednesday
import com.example.inductionprojectiititimetableapp.Data.EEFriday
import com.example.inductionprojectiititimetableapp.Data.EEThursday
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.Lecture
import com.example.inductionprojectiititimetableapp.R
import java.time.LocalTime

@Composable
fun LectureSchedule(
    branchName: String,
    listOfLecturesOfDay: List<Lecture>
){
    var ScheduleBeforeBreak by remember { mutableStateOf(listOf<Lecture>()) }
    var ScheduleAfterBreak by remember { mutableStateOf(listOf<Lecture>()) }
   for(lecture in listOfLecturesOfDay){
       if(lecture.lectureStartTime < LocalTime.of(12,30)){
           ScheduleBeforeBreak += lecture
       }
       else{
           ScheduleAfterBreak += lecture
       }

    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE5E5E5)),
        contentAlignment = Alignment.TopStart,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 4.dp, start = 8.dp, end = 4.dp)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(top = 8.dp, start = 8.dp, end = 8.dp),
                elevation = 10.dp,
                backgroundColor = Color.White,
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = branchName,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp
                    )
                }
            }
            Spacer(modifier = Modifier.padding(4.dp))
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(ScheduleBeforeBreak) { lecture ->
                    LectureCard(
                        lectureType = lecture.lectureType,
                        lectureStartTime = lecture.lectureStartTime,
                        lectureVenue = lecture.lectureVenue,
                        CourseCode = lecture.CourseCode,
                        lectureEndTime = lecture.lectureEndTime
                    )
                }
                item { LunchBreakCard("12:30", "13:30") }
                items(ScheduleAfterBreak) { lecture ->
                    LectureCard(
                        lectureType = lecture.lectureType,
                        lectureStartTime = lecture.lectureStartTime,
                        lectureVenue = lecture.lectureVenue,
                        CourseCode = lecture.CourseCode,
                        lectureEndTime = lecture.lectureEndTime
                    )
                }
                item { endGreetingCard() }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLectureSchedule(){

//    LectureSchedule(stringResource(id = R.string.branch_mems), CSEWednesday.lectureList)
}