package com.example.inductionprojectiititimetableapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.inductionprojectiititimetableapp.Data.branchWeeksData
import com.example.inductionprojectiititimetableapp.Data.composableBluePrint.LectureList
import kotlinx.coroutines.launch

class AppViewModel : ViewModel(){

    data class BranchWeekListState(
        val loading: Boolean = false,
        val theList: List<(List<LectureList>)> = emptyList(),
        val error: String? = null
    )

    private val _lectureListState = mutableStateOf(BranchWeekListState())

    val lectureListState : State<BranchWeekListState> = _lectureListState

    private fun fetchLectureList(){
        viewModelScope.launch{
            try{
               val response = branchWeeksData.getLectureList()
                _lectureListState.value = _lectureListState.value.copy(
                    loading = false,
                    theList = response,
                    error = null
                )
            }catch (e: Exception){
                _lectureListState.value = _lectureListState.value.copy(
                    loading = false,
                    error = "error occured while fetching the lecture list ${e.localizedMessage}"
                )
            }
        }
    }
}