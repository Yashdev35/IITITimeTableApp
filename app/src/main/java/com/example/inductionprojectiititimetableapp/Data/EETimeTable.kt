package com.example.inductionprojectiititimetableapp.Data

import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.Lecture
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.LectureList
import java.time.LocalDate
import java.time.LocalTime

val EE206M = Lecture(
    "Lecture",
    LocalTime.of(9, 30),
    LocalTime.of(10, 25),
    "Lecture Hall Complex L-11",
    "EE206"
)

val EE202M = Lecture(
    "Lecture",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-11",
    "EE202"
)

val EE208M = Lecture(
    "Lecture",
    LocalTime.of(11, 30),
    LocalTime.of(12, 25),
    "Lecture Hall Complex L-11",
    "EE208"
)

val EE256Me2 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(18, 25),
    "Lecture Hall Complex L-11",
    "EE256(E2)"
)

val EE258Me1 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(17, 25),
    "Lecture Hall Complex L-11",
    "EE258(E1)"
)

val EEMonday = LectureList(
    listOf(EE206M, EE202M, EE208M, EE256Me2, EE258Me1),
    LocalDate.of(2024,1,29).dayOfWeek,
    "Electrical Engineering",
    21
)

// MONDAY of EE

val EE204T = Lecture(
    "Lecture",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-11",
    "EE204"
)

val EE206T = Lecture(
    "Lecture",
    LocalTime.of(11, 30),
    LocalTime.of(12, 25),
    "Lecture Hall Complex L-11",
    "EE206"
)

val EETuesday = LectureList(
    listOf(EE204T, EE206T, MA204),
    LocalDate.of(2024,1,29).dayOfWeek,
    "Electrical Engineering",
    22
)

// TUESDAY of EE

val EE204W = Lecture(
    "Lecture",
    LocalTime.of(9, 30),
    LocalTime.of(10, 25),
    "Lecture Hall Complex L-11",
    "EE204"
)

val EE202W = Lecture(
    "Lecture",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-11",
    "EE202"
)

val EE254We2 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(17, 25),
    "Lecture Hall Complex L-11",
    "EE254(E2)"
)

val EE256We1 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(18, 25),
    "Lecture Hall Complex L-11",
    "EE256(E1)"
)

val EEWednesday = LectureList(
    listOf(EE204W, EE202W, PublicLectureW , EE254We2, EE256We1),
    LocalDate.of(2024,1,29).dayOfWeek,
    "Electrical Engineering",
    23
)

// WEDNESDAY of EE

val EE202Th = Lecture(
    "Lecture",
    LocalTime.of(9, 30),
    LocalTime.of(10, 25),
    "Lecture Hall Complex L-11",
    "EE202"
)

val EE204Th = Lecture(
    "Lecture",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-11",
    "EE204"
)

val EE208Th = Lecture(
    "Lecture",
    LocalTime.of(11, 30),
    LocalTime.of(12, 25),
    "Lecture Hall Complex L-11",
    "EE208"
)

val MA204EETh = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(16, 25),
    "Lecture Hall Complex L-11",
    "MA204EE"
)

val EEThursday = LectureList(
    listOf(EE202Th, EE204Th, EE208Th, MA204EETh, MA204),
    LocalDate.of(2024,1,29).dayOfWeek,
    "Electrical Engineering",
    24
)

// THURSDAY of EE

val EE206F = Lecture(
    "Lecture",
    LocalTime.of(9, 30),
    LocalTime.of(10, 25),
    "Lecture Hall Complex L-11",
    "EE206"
)

val EE208F = Lecture(
    "Lecture",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-11",
    "EE208"
)

val EE202F = Lecture(
    "Lecture",
    LocalTime.of(11, 30),
    LocalTime.of(12, 25),
    "Lecture Hall Complex L-11",
    "EE202"
)

val EEFriday = LectureList(
    listOf(EE206F, EE208F, EE202F),
    LocalDate.of(2024,1,29).dayOfWeek,
    "Electrical Engineering",
    25
)

// FRIDAY of EE

val EESaturday = LectureList(
    listOf(Holiday),
    LocalDate.of(2024,1,29).dayOfWeek,
    "Electrical Engineering",
    26
)

// SATURDAY of EE

val EEWeek = listOf(EEMonday, EETuesday, EEWednesday, EEThursday, EEFriday, EESaturday, Sunday)