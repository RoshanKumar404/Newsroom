package com.example.akhbar.Src

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.akhbar.Src.Domain.manager.Usecase.AppEntryuseCases
import com.example.akhbar.Src.Navgraph.Route
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import javax.inject.Inject

@HiltViewModel // Don't forget this for Hilt injection!
class MainViewModal @Inject constructor(
    private val appEntryuseCases: AppEntryuseCases
) : ViewModel() {


    var splashCondition by mutableStateOf(true)
        private set

    var startDestination by mutableStateOf(Route.AppStartingNavigation.route)
        private set

    init {

        viewModelScope.launch {

            appEntryuseCases.readAppEntry().onEach { shouldStartfromHomeScreen ->
                if (shouldStartfromHomeScreen) {
                    startDestination = Route.NewsNavigation.route
                } else {
                    startDestination = Route.AppStartingNavigation.route
                }

                delay(100)
                splashCondition = false
            }.launchIn(viewModelScope)
        }
    }
}