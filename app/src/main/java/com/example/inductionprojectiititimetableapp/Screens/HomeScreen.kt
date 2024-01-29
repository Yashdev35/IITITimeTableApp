package com.example.inductionprojectiititimetableapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Scaffold
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.inductionprojectiititimetableapp.AppViewModel
import com.example.inductionprojectiititimetableapp.Data.CEWeek
import com.example.inductionprojectiititimetableapp.Data.CSEWeek
import com.example.inductionprojectiititimetableapp.Data.EEWeek
import com.example.inductionprojectiititimetableapp.Data.MEMSWeek
import com.example.inductionprojectiititimetableapp.Data.MEWeek
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.LectureList
import com.example.inductionprojectiititimetableapp.LectureListAssigner
import com.example.inductionprojectiititimetableapp.R

@Composable
fun MediatorScreen(
    navigateToLectureSchedule: (LectureList) -> Unit,
    viewState: AppViewModel.BranchWeekListState
){
    Box (
        modifier = Modifier.fillMaxSize()
    ){
        /*in this when block either we are processing the data or we are displaying the data or we are displaying the error
         and each case will have a different ui*/
        when{
            viewState.loading -> {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
            viewState.error != null -> {
                Text(text = "ERROR")
            }
            else -> {
                //display the list of categories
                HomeScreen(navigateToLectureSchedule,viewState.theList)
            }
        }
    }
}

@Composable
fun HomeScreen(
    navigateToLectureSchedule: (LectureList) -> Unit,
    branchWeeksList: List<(List<LectureList>)>
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
                    navigateToLectureSchedule(LectureListAssigner(branchWeeksList[0]))
                }
                BranchSelectionButton(branchName = stringResource(id = R.string.branch_ee)){
                    navigateToLectureSchedule(LectureListAssigner(branchWeeksList[1]))
                }
                BranchSelectionButton(branchName = stringResource(id = R.string.branch_me)){
                    navigateToLectureSchedule(LectureListAssigner(branchWeeksList[2]))
                }
                BranchSelectionButton(branchName = stringResource(id = R.string.branch_ce)){
                    navigateToLectureSchedule(LectureListAssigner(branchWeeksList[3]))
                }
                BranchSelectionButton(branchName = stringResource(id = R.string.branch_mems)){
                    navigateToLectureSchedule(LectureListAssigner(branchWeeksList[4]))
                }
            }
        }
    }
}
}

@Preview
@Composable
fun PreviewHomeScreen(){
    //HomeScreen(navgateToLectureSchedule = {})
}
