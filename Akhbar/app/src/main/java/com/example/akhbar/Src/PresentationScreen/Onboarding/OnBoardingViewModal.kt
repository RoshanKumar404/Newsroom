package com.example.akhbar.Src.PresentationScreen.Onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.akhbar.Src.Domain.manager.Usecase.AppEntryuseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModal @Inject constructor(
    private val appEntryuseCases: AppEntryuseCases
) :ViewModel(){
    fun onEvent(event: OnBoardingEvent){
        when(event){
            is OnBoardingEvent.SavedAppEntry->{
                saveAppEntry()
            }
        }
    }
    private fun saveAppEntry(){
        viewModelScope.launch {
            appEntryuseCases.saveAppEntry()
        }
    }
}