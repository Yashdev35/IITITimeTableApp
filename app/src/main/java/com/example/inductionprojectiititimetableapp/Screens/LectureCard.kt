package com.example.inductionprojectiititimetableapp.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.LocalTime

@Composable
fun LectureCard(
    lectureType: String,
    lectureStartTime: LocalTime,
    lectureEndTime: LocalTime,
    lectureVenue: String,
    CourseCode: String,
    ) {
 Card(
     modifier = Modifier
         .fillMaxSize()
         .padding(top = 8.dp, start = 8.dp, end = 8.dp),
     elevation = 10.dp,
     backgroundColor = Color.White
 ) {
     Column(modifier = Modifier.padding(16.dp)) {
        Row {
            Text(text = CourseCode, fontWeight = FontWeight.ExtraBold)
            Spacer(modifier = Modifier.padding(8.dp))
            Text(text = lectureType, fontWeight = FontWeight.ExtraBold)
        }
         Spacer(modifier = Modifier.padding(4.dp))
        Row {
            Text(text = "Venue :- $lectureVenue", fontWeight = FontWeight.Normal)
        }
            Spacer(modifier = Modifier.padding(4.dp))
         Text(text = "Time :- $lectureStartTime - $lectureEndTime", fontWeight = FontWeight.Normal)
     }
 }
}

@Composable
fun LunchBreakCard(
    startTime: String,
    endTime: String,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 4.dp),
    ){
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 8.dp, start = 8.dp, end = 8.dp),
            elevation = 10.dp,
            backgroundColor = Color.White
        ) {
            Box (
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Text(text = "Lunch Break! $startTime - $endTime", fontWeight = FontWeight.ExtraBold,fontSize = 15.sp)
            }
        }
    }
}

@Composable
fun endGreetingCard() {
   Column(
       modifier = Modifier
           .fillMaxSize()
           .padding(top = 4.dp),
   ) {
       Card(
           modifier = Modifier
               .fillMaxSize()
               .padding(top = 8.dp, start = 8.dp, end = 8.dp),
           elevation = 10.dp,
           backgroundColor = Color.White
       ) {
           Box (
               modifier = Modifier
                   .fillMaxSize(),
               contentAlignment = Alignment.Center
           ){
               Text(text = "Thats it for the day!", fontWeight = FontWeight.ExtraBold,fontSize = 15.sp)
           }

       }
   }
}


@Preview
@Composable
fun LectureCardPreview() {
    LunchBreakCard("12:30", "13:30")
}