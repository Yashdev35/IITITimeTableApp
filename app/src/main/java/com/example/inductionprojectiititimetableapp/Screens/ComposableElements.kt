package com.example.inductionprojectiititimetableapp.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.inductionprojectiititimetableapp.R
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

@Composable
fun EndGreetingCard() {

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

@Composable
fun AppBar(
    title: String,
    onBackNavClicked: () -> Unit = {}
) {
    val navigationIcon : (@Composable () -> Unit)? =
        if(!title.contains("IITI Time Table App")) {
            {
                IconButton(onClick = {
                    onBackNavClicked()
                }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back button on top bar",
                        tint = Color.Black
                    )
                }
            }
        }else{
            null
        }
    TopAppBar(
        title = {
            Text(
                text = title,
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 18.sp,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .padding(start = 4.dp)
                    .heightIn(max = 24.dp))
        },
        elevation = 3.dp,
        backgroundColor = Color.White,
        navigationIcon = navigationIcon
    )
}

@Composable
fun BranchSelectionButton(
    branchName: String,
    onClick: () -> Unit = {}
){
    Column {
        Spacer(modifier = Modifier.padding(4.dp))
        Button(
            onClick = { onClick() },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White,
                contentColor = Color.Black
            ),
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Text(text = branchName,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 15.sp,
                fontFamily = FontFamily.Monospace
            )
        }
        Spacer(modifier = Modifier.padding(4.dp))
    }
}

@Preview
@Composable
fun LectureCardPreview() {
   LunchBreakCard("12:00","13:00")
}