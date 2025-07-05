package com.example.akhbar

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import com.example.akhbar.Src.Domain.manager.Usecase.AppEntryuseCases
import com.example.akhbar.Src.PresentationScreen.Onboarding.OnBoardingScreen
import com.example.akhbar.Src.PresentationScreen.Onboarding.OnBoardingViewModal // Assuming this is your ViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject
import androidx.hilt.navigation.compose.hiltViewModel // You need this import!

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var appEntryuseCases: AppEntryuseCases

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

        lifecycleScope.launch {
            appEntryuseCases.readAppEntry().collect {
                Log.d("Text", it.toString())
            }
        }
        setContent {
            Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background))
            // The problem is likely here:
            // val viewModal :OnBoardingViewModal=hiltViewModel() // This line!
            val viewModel: OnBoardingViewModal = hiltViewModel() // Correct way to get Hilt ViewModel in Composable
            OnBoardingScreen(
                event = viewModel::onEvent // Corrected parameter name if it was a typo
            )
        }
    }
}