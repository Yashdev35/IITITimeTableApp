package com.example.inductionprojectiititimetableapp.Data.composableBluePrint

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import java.time.LocalDate
import java.time.LocalTime

@Composable
fun Main(){
    var i = remember {
        LocalTime.now()
    }
    var z = remember {
        LocalTime.of(12,30)
    }
    var Day = remember {
        LocalDate.of(2024,1,1).dayOfWeek
    }
    var a = i < z
    Text(text = (Day).toString())
}
@Preview(showBackground = true)
@Composable
fun PreviewMain(){
    Main()
}