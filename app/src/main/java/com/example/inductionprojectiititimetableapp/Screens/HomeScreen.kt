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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
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
import com.example.inductionprojectiititimetableapp.Data.CEWeek
import com.example.inductionprojectiititimetableapp.Data.CSEFriday
import com.example.inductionprojectiititimetableapp.Data.CSEMonday
import com.example.inductionprojectiititimetableapp.Data.CSESaturday
import com.example.inductionprojectiititimetableapp.Data.CSEThursday
import com.example.inductionprojectiititimetableapp.Data.CSETuesday
import com.example.inductionprojectiititimetableapp.Data.CSEWednesday
import com.example.inductionprojectiititimetableapp.Data.CSEWeek
import com.example.inductionprojectiititimetableapp.Data.EEFriday
import com.example.inductionprojectiititimetableapp.Data.EEThursday
import com.example.inductionprojectiititimetableapp.Data.EEWeek
import com.example.inductionprojectiititimetableapp.Data.MEFriday
import com.example.inductionprojectiititimetableapp.Data.MEMSWeek
import com.example.inductionprojectiititimetableapp.Data.MEWeek
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.Lecture
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.LectureList
import com.example.inductionprojectiititimetableapp.LectureListAssigner
import com.example.inductionprojectiititimetableapp.R
import java.time.LocalTime

@Composable
fun HomeScreen(
    navgateToLectureSchedule: (LectureList) -> Unit
){
Scaffold(
    topBar = {
        AppBar(title = "IITI Time Table App",{

        })
    }
) {
    Column(
        modifier = Modifier
            .padding(it)
            .wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Box(
               modifier = Modifier
                   .fillMaxSize()
                   .background(Color.Black),
               contentAlignment = Alignment.Center
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(16.dp), Arrangement.Center, Alignment.CenterHorizontally
            ){
              BranchSelectionButton(branchName = stringResource(id = R.string.branch_cse)){
                  navgateToLectureSchedule(LectureListAssigner(CSEWeek))
              }
              BranchSelectionButton(branchName = stringResource(id = R.string.branch_ee)){
                  navgateToLectureSchedule(LectureListAssigner(EEWeek))
              }
              BranchSelectionButton(branchName = stringResource(id = R.string.branch_me)){
                  navgateToLectureSchedule(LectureListAssigner(MEWeek))
              }
              BranchSelectionButton(branchName = stringResource(id = R.string.branch_ce)){
                  navgateToLectureSchedule(LectureListAssigner(CEWeek))
              }
              BranchSelectionButton(branchName = stringResource(id = R.string.branch_mems)){
                  navgateToLectureSchedule(LectureListAssigner(MEMSWeek))
              }
            }
        }
    }
}
}

@Preview
@Composable
fun PreviewHomeScreen(){
    HomeScreen(navgateToLectureSchedule = {})
}
