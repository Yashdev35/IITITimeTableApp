package com.example.inductionprojectiititimetableapp.Data.composableBluePrint

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.DayOfWeek
import java.time.LocalTime

@Parcelize
data class Lecture(
    val lectureType: String,
   val lectureStartTime: LocalTime,
    val lectureEndTime: LocalTime,
   val lectureVenue: String,
   val CourseCode: String,
): Parcelable

@Parcelize
data class LectureList(
    val lectureList: List<Lecture>,
    val day : DayOfWeek,
    val branchName : String,
    val id : Int
): Parcelable
