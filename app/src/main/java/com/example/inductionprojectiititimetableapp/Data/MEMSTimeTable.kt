package com.example.inductionprojectiititimetableapp.Data

import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.Lecture
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.LectureList
import java.time.LocalDate
import java.time.LocalTime

val MM202M = Lecture(
    "Theory",
    LocalTime.of(9, 30),
    LocalTime.of(10, 25),
    "Lecture Hall Complex L-13",
    "MM202"
)

val MM208M = Lecture(
    "Theory",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-13",
    "MM208"
)

val MM204M = Lecture(
    "Theory",
    LocalTime.of(11, 30),
    LocalTime.of(12, 25),
    "Lecture Hall Complex L-13",
    "MM204"
)

val MA204MMM = Lecture(
    "Practical",
    LocalTime.of(16, 30),
    LocalTime.of(18, 25),
    "Lecture Hall Complex L-13",
    "MA204MM"
)

val MEMSMonday = LectureList(
    listOf(MM202M, MM208M, MM204M, MA204MMM),
    LocalDate.of(2024,1,1).dayOfWeek,
    "Metallurgical Engineering and Material Sciences",
    41
)

// MONDAY of MEMS

val MM206T = Lecture(
    "Theory",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-13",
    "MM206"
)

val MM202T = Lecture(
    "Theory",
    LocalTime.of(11, 30),
    LocalTime.of(12, 25),
    "Lecture Hall Complex L-13",
    "MM202"
)

val MM254Tm2 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(17, 25),
    "Lecture Hall Complex L-13",
    "MM254(M2)"
)

val MM258Tm1 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(17, 25),
    "Lecture Hall Complex L-13",
    "MM258(M1)"
)

val MEMSTuesday = LectureList(
    listOf(MM206T, MM202T, MA204,MM254Tm2, MM258Tm1),
    LocalDate.of(2024,1,2).dayOfWeek,
    "Metallurgical Engineering and Material Sciences",
    42
)

// TUESDAY of MEMS

val MM206W = Lecture(
    "Theory",
    LocalTime.of(9, 30),
    LocalTime.of(10, 25),
    "Lecture Hall Complex L-13",
    "MM206"
)

val MM208W = Lecture(
    "Theory",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-13",
    "MM208"
)

val MEMSWednesday = LectureList(
    listOf(MM206W, MM208W, PublicLectureW),
    LocalDate.of(2024,1,3).dayOfWeek,
    "Metallurgical Engineering and Material Sciences",
    43
)

// WEDNESDAY of MEMS

val MM206Th = Lecture(
    "Theory",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-13",
    "MM206"
)

val MM204Th = Lecture(
    "Theory",
    LocalTime.of(11, 30),
    LocalTime.of(12, 25),
    "Lecture Hall Complex L-13",
    "MM204"
)

val MEMSThursday = LectureList(
    listOf(MM206Th, MM204Th, MA204),
    LocalDate.of(2024,1,4).dayOfWeek,
    "Metallurgical Engineering and Material Sciences",
    44
)

// THURSDAY of MEMS

val MM202F = Lecture(
    "Theory",
    LocalTime.of(9, 30),
    LocalTime.of(10, 25),
    "Lecture Hall Complex L-13",
    "MM202"
)

val MM204F = Lecture(
    "Theory",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-13",
    "MM204"
)

val MM208F = Lecture(
    "Theory",
    LocalTime.of(11, 30),
    LocalTime.of(12, 25),
    "Lecture Hall Complex L-13",
    "MM208"
)

val MM254Fm1 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(17, 25),
    "Lecture Hall Complex L-13",
    "MM254(M1)"
)

val MM258Fm2 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(17, 25),
    "Lecture Hall Complex L-13",
    "MM258(M2)"
)

val MEMSFriday = LectureList(
    listOf(MM202F, MM204F, MM208F, MA204, MM254Fm1, MM258Fm2),
    LocalDate.of(2024,1,5).dayOfWeek,
    "Metallurgical Engineering and Material Sciences",
    45
)

// FRIDAY of MEMS

val MEMSSaturday = LectureList(
    listOf(Holiday),
    LocalDate.of(2024,1,6).dayOfWeek,
    "Metallurgical Engineering and Material Sciences",
    46
)

// SATURDAY of MEMS

val MEMSWeek = listOf(MEMSMonday, MEMSTuesday, MEMSWednesday, MEMSThursday, MEMSFriday, MEMSSaturday, Sunday)