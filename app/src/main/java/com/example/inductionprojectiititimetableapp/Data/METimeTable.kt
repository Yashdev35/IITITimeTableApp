package com.example.inductionprojectiititimetableapp.Data

import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.Lecture
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.LectureList
import java.time.LocalDate
import java.time.LocalTime

val ME208M = Lecture(
    "Theory",
    LocalTime.of(9, 30),
    LocalTime.of(10, 25),
    "Lecture Hall Complex L-03",
    "ME208"
)

val ME206M = Lecture(
    "Theory",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-03",
    "ME206"
)

val ME202M = Lecture(
    "Theory",
    LocalTime.of(11, 30),
    LocalTime.of(12, 25),
    "Lecture Hall Complex L-03",
    "ME202"
)

val HS213M = Lecture(
    "Theory",
    LocalTime.of(13, 30),
    LocalTime.of(14, 25),
    "Lecture Hall Complex L-03",
    "HS213"
)

val ME254Mm2 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(17, 25),
    "Lecture Hall Complex L-03",
    "ME254(M2)"
)

val ME258Mm1 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(17, 25),
    "Lecture Hall Complex L-03",
    "ME258(M1)"
)

val MEMonday = LectureList(
    listOf(ME208M, ME206M, ME202M, HS213M, ME254Mm2, ME258Mm1),
    LocalDate.of(2024,1,1).dayOfWeek,
    "Mechanical Engineering",
    11
)

//Monday of ME

val ME202T = Lecture(
    "Theory",
    LocalTime.of(9, 30),
    LocalTime.of(10, 25),
    "Lecture Hall Complex L-03",
    "ME202"
)

val ME204T = Lecture(
    "Theory",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-03",
    "ME204"
)

val ME208T = Lecture(
    "Theory",
    LocalTime.of(11, 30),
    LocalTime.of(12, 25),
    "Lecture Hall Complex L-03",
    "ME208"
)

val ME258Tm3 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(17, 25),
    "Lecture Hall Complex L-03",
    "ME258(M3)"
)

val METuesday = LectureList(
    listOf(ME202T, ME204T, ME208T, MA204 ,ME258Tm3),
    LocalDate.of(2024,1,2).dayOfWeek,
    "Mechanical Engineering",
    12
)

//Tuesday of ME

val ME204W = Lecture(
    "Theory",
    LocalTime.of(9, 30),
    LocalTime.of(10, 25),
    "Lecture Hall Complex L-03",
    "ME204"
)

val ME206W = Lecture(
    "Theory",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-03",
    "ME206"
)

val HS213W = Lecture(
    "Theory",
    LocalTime.of(13, 30),
    LocalTime.of(14, 25),
    "Lecture Hall Complex L-03",
    "HS213"
)

val ME254Wm1 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(17, 25),
    "Lecture Hall Complex L-03",
    "ME254(M1)"
)

val MEWednesday = LectureList(
    listOf(ME204W, ME206W, PublicLectureW, HS213W, ME254Wm1),
    LocalDate.of(2024,1,3).dayOfWeek,
    "Mechanical Engineering",
    13
)

//Wednesday of ME

val ME206Th = Lecture(
    "Theory",
    LocalTime.of(9, 30),
    LocalTime.of(10, 25),
    "Lecture Hall Complex L-03",
    "ME206"
)

val ME204Th = Lecture(
    "Theory",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-03",
    "ME204"
)

val ME202Th = Lecture(
    "Theory",
    LocalTime.of(11, 30),
    LocalTime.of(12, 25),
    "Lecture Hall Complex L-03",
    "ME202"
)

val MA204ME = Lecture(
    "Practical",
    LocalTime.of(16, 30),
    LocalTime.of(18, 25),
    "Lecture Hall Complex L-03",
    "MA204ME"
)

val METThursday = LectureList(
    listOf(ME206Th, ME204Th, ME202Th, MA204, MA204ME),
    LocalDate.of(2024,1,4).dayOfWeek,
    "Mechanical Engineering",
    14
)

//Thursday of ME

val ME208F = Lecture(
    "Theory",
    LocalTime.of(9, 30),
    LocalTime.of(10, 25),
    "Lecture Hall Complex L-03",
    "ME208"
)

val ME202F = Lecture(
    "Theory",
    LocalTime.of(10, 30),
    LocalTime.of(11, 25),
    "Lecture Hall Complex L-03",
    "ME202"
)

val ME206F = Lecture(
    "Theory",
    LocalTime.of(11, 30),
    LocalTime.of(12, 25),
    "Lecture Hall Complex L-03",
    "ME206"
)

val HS213F = Lecture(
    "Theory",
    LocalTime.of(13, 30),
    LocalTime.of(14, 25),
    "Lecture Hall Complex L-03",
    "HS213"
)

val ME258Fm2 = Lecture(
    "Practical",
    LocalTime.of(14, 30),
    LocalTime.of(17, 25),
    "Lecture Hall Complex L-03",
    "ME258(M2)"
)

val MEFriday = LectureList(
    listOf(ME208F, ME202F, ME206F, HS213F, ME258Fm2),
    LocalDate.of(2024,1,5).dayOfWeek,
    "Mechanical Engineering",
    15
)

//Friday of ME

val MESaturday = LectureList(
    listOf(Holiday),
    LocalDate.of(2024,1,6).dayOfWeek,
    "Mechanical Engineering",
    16
)

//Saturday of ME

val MEWeek = listOf(MEMonday, METuesday, MEWednesday, METThursday, MEFriday, MESaturday, Sunday)