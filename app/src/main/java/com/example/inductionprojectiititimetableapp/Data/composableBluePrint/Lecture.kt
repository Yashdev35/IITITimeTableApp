package com.example.inductionprojectiititimetableapp.Data.composableBluePrint

import java.time.DayOfWeek
import java.time.LocalTime

data class Lecture(
    val lectureType: String,
   val lectureStartTime: LocalTime,
    val lectureEndTime: LocalTime,
   val lectureVenue: String,
   val CourseCode: String,
)

data class LectureList(
    val lectureList: List<Lecture>,
    val day : DayOfWeek,
    val branchName : String,
    val id : Int
)
