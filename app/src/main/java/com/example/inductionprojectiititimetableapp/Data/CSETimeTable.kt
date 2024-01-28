package com.example.inductionprojectiititimetableapp.Data

import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.Lecture
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.LectureList
import java.time.LocalDate
import java.time.LocalTime

val CS204M= Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(9,30),
    lectureEndTime = LocalTime.of(10,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS204"
)
val CS202M= Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(10,30),
    lectureEndTime = LocalTime.of(11,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS202"
)
val CS208M= Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(11,30),
    lectureEndTime = LocalTime.of(12,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS206"
)
val CS254M= Lecture(
    lectureType = "Practical",
    lectureStartTime = LocalTime.of(14,30),
    lectureEndTime = LocalTime.of(17,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS254"
)

val CSEMonday = LectureList(
    listOf(CS204M, CS202M, CS208M, CS254M),
    LocalDate.of(2024, 1, 29).dayOfWeek,
    "Computer Science and Engineering",
    1
)
// MONDAY of CSE
val CS206T= Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(10,30),
    lectureEndTime = LocalTime.of(11,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS206"
)

val CS204T= Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(11,30),
    lectureEndTime = LocalTime.of(12,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS204"
)

val MA204= Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(13,30),
    lectureEndTime = LocalTime.of(14,25),
    lectureVenue = "Gargi Seminar Hall",
    CourseCode = "MA204"
)

val MA204CST= Lecture(
    lectureType = "Practical",
    lectureStartTime = LocalTime.of(14,30),
    lectureEndTime = LocalTime.of(16,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "MA204CS"
)

val CSETuesday = LectureList(
    listOf(CS206T, CS204T, MA204, MA204CST),
    LocalDate.of(2024, 1, 29).dayOfWeek,
    "Computer Science and Engineering",
    2
)
// TUESDAY of CSE

val CS206W= Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(9,30),
    lectureEndTime = LocalTime.of(10,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS206"
)

val CS202W= Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(10,30),
    lectureEndTime = LocalTime.of(11,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS202"
)

val PublicLectureW= Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(11,30),
    lectureEndTime = LocalTime.of(12,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "Public Lecture"
)

val CS256W= Lecture(
    lectureType = "Practical",
    lectureStartTime = LocalTime.of(14,30),
    lectureEndTime = LocalTime.of(17,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS256"
)

val CSEWednesday = LectureList(
    listOf(CS206W, CS202W, PublicLectureW, CS256W),
    LocalDate.of(2024, 1, 29).dayOfWeek,
    "Computer Science and Engineering",
    3
)
// WEDNESDAY of CSE


val CS206TH= Lecture(
    lectureType = "Tutorial",
    lectureStartTime = LocalTime.of(10,30),
    lectureEndTime = LocalTime.of(11,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS206"
)

val CS208TH= Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(11,30),
    lectureEndTime = LocalTime.of(12,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS208"
)

val CSEThursday = LectureList(
    listOf(CS206TH, CS208TH, MA204),
    LocalDate.of(2024, 1, 29).dayOfWeek,
    "Computer Science and Engineering",
    4
)


// THURSDAY of CSE


val CS204F= Lecture(
    lectureType = "Tutorial",
    lectureStartTime = LocalTime.of(9,30),
    lectureEndTime = LocalTime.of(10,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS204"
)

val CS208F= Lecture(
    lectureType = "Tutorial",
    lectureStartTime = LocalTime.of(10,30),
    lectureEndTime = LocalTime.of(11,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS208"
)

val CS202F= Lecture(
    lectureType = "Tutorial",
    lectureStartTime = LocalTime.of(11,30),
    lectureEndTime = LocalTime.of(12,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS202"
)

val CS258F= Lecture(
    lectureType = "Practical",
    lectureStartTime = LocalTime.of(14,30),
    lectureEndTime = LocalTime.of(17,25),
    lectureVenue = "Lecture Hall Complex L-21",
    CourseCode = "CS258"
)

val CSEFriday = LectureList(
    listOf(CS204F, CS208F, CS202F, CS258F),
    LocalDate.of(2024, 1, 29).dayOfWeek,
    "Computer Science and Engineering",
    5
)


// FRIDAY of CSE



val Holiday= Lecture(
    lectureType = "Theory",
    lectureStartTime = LocalTime.of(0,0),
    lectureEndTime = LocalTime.of(23,59),
    lectureVenue = "Where every you want",
    CourseCode = "Holiday "
)

val CSESaturday = LectureList(
    listOf(Holiday),
    LocalDate.of(2024, 1, 29).dayOfWeek,
    "Computer Science and Engineering",
    6
)
// SATURDAY of Every Branch

val CSEWeek = listOf(CSEMonday, CSETuesday, CSEWednesday, CSEThursday, CSEFriday, CSESaturday, Sunday)