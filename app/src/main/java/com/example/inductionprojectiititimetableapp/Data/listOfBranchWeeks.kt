package com.example.inductionprojectiititimetableapp.Data

import android.os.Parcelable
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.LectureList
import kotlinx.parcelize.Parcelize

data class ListOfBranchesWeeks(val lectureList: List<(List<LectureList>)>) {
    suspend fun getLectureList(): List<(List<LectureList>)> {
        return lectureList
    }
}
val branchWeeksData = ListOfBranchesWeeks(listOf(CSEWeek, EEWeek, MEWeek, CEWeek, MEMSWeek))

suspend fun print(){
    println(branchWeeksData.getLectureList())
}