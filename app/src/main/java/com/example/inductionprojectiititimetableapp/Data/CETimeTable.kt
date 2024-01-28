package com.example.inductionprojectiititimetableapp.Data

import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.Lecture
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.LectureList
import java.time.LocalDate
import java.time.LocalTime

val CE202M = Lecture(
    lectureType = "Lecture",
    lectureStartTime = LocalTime.of(9, 30),
    lectureEndTime = LocalTime.of(10, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE202"
)

val CE206M = Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(10, 30),
    lectureEndTime = LocalTime.of(11, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE206"
)

val AA204M = Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(13, 30),
    lectureEndTime = LocalTime.of(14, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "AA204"
)

val MA204CEM = Lecture(
    lectureType = "Practical",
    lectureStartTime = LocalTime.of(14, 30),
    lectureEndTime = LocalTime.of(16, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "MA204CE"
)

val CEMonday = LectureList(
    listOf(CE202M, CE206M, AA204M, MA204CEM),
    LocalDate.of(2024,1,1).dayOfWeek,
    "Civil Engineering",
    31
)

// MONDAY of CE

val CE208T = Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(9, 30),
    lectureEndTime = LocalTime.of(10, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE208"
)

val CE204T = Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(10, 30),
    lectureEndTime = LocalTime.of(11, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE204"
)

val CE202T = Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(11, 30),
    lectureEndTime = LocalTime.of(12, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE202"
)

val CE254Tce1 = Lecture(
    lectureType = "Practical",
    lectureStartTime = LocalTime.of(14, 30),
    lectureEndTime = LocalTime.of(16, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE254(CE1)"
)

val CE256Tce2 = Lecture(
    lectureType = "Practical",
    lectureStartTime = LocalTime.of(14, 30),
    lectureEndTime = LocalTime.of(17, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE256(CE2)"
)

val CETuesday = LectureList(
    listOf(CE208T, CE204T, CE202T, MA204 ,CE254Tce1, CE256Tce2),
    LocalDate.of(2024,1,2).dayOfWeek,
    "Civil Engineering",
    32
)

// TUESDAY of CE

val CE204W = Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(9, 30),
    lectureEndTime = LocalTime.of(10, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE204"
)

val CE206W = Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(10, 30),
    lectureEndTime = LocalTime.of(11, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE206"
)

val AA204W = Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(13, 30),
    lectureEndTime = LocalTime.of(14, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "AA204"
)

val CE254Wce2 = Lecture(
    lectureType = "Practical",
    lectureStartTime = LocalTime.of(14, 30),
    lectureEndTime = LocalTime.of(16, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE254(CE2)"
)

val CE256Wce1 = Lecture(
    lectureType = "Practical",
    lectureStartTime = LocalTime.of(14, 30),
    lectureEndTime = LocalTime.of(17, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE256(CE1)"
)

val CEWednesday = LectureList(
    listOf(CE204W, CE206W, AA204W, CE254Wce2, CE256Wce1),
    LocalDate.of(2024,1,3).dayOfWeek,
    "Civil Engineering",
    33
)

// WEDNESDAY of CE

val CE204Th = Lecture(
    lectureType = "Tutorial",
    lectureStartTime = LocalTime.of(9, 30),
    lectureEndTime = LocalTime.of(10, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE204"
)

val CE208Th = Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(10, 30),
    lectureEndTime = LocalTime.of(11, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE208"
)

val CETThursday = LectureList(
    listOf(CE204Th, CE208Th, MA204),
    LocalDate.of(2024,1,4).dayOfWeek,
    "Civil Engineering",
    34
)

// THURSDAY of CE

val CE202F = Lecture(
    lectureType = "Tutorial",
    lectureStartTime = LocalTime.of(9, 30),
    lectureEndTime = LocalTime.of(10, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE202"
)

val CE208F = Lecture(
    lectureType = "Tutorial",
    lectureStartTime = LocalTime.of(10, 30),
    lectureEndTime = LocalTime.of(11, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE208"
)

val CE206F = Lecture(
    lectureType = "Tutorial",
    lectureStartTime = LocalTime.of(11, 30),
    lectureEndTime = LocalTime.of(12, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "CE206"
)

val AA204F = Lecture(
    lectureType = "Tutorial",
    lectureStartTime = LocalTime.of(13, 30),
    lectureEndTime = LocalTime.of(14, 25),
    lectureVenue = "Lecture Hall Complex L-23",
    CourseCode = "AA204"
)

val CEFriday = LectureList(
    listOf(CE202F, CE208F, CE206F, AA204F),
    LocalDate.of(2024,1,5).dayOfWeek,
    "Civil Engineering",
    35
)

// FRIDAY of CE

val CESaturday = LectureList(
    listOf(Holiday),
    LocalDate.of(2024,1,6).dayOfWeek,
    "Civil Engineering",
    36
)

// SATURDAY of CE

val Sunday = LectureList(
    listOf(Holiday),
    LocalDate.of(2024,1,7).dayOfWeek,
    "For every one unless you have an extra class on Sunday",
    37
)

// SUNDAY of EVERYONE

val CEWeek = listOf(CEMonday, CETuesday, CEWednesday, CETThursday, CEFriday, CESaturday, Sunday)