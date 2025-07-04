package com.example.akhbar.Src.PresentationScreen.Onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.akhbar.Src.PresentationScreen.Common.NewsButton
import com.example.akhbar.Src.PresentationScreen.Common.newstext
import com.example.akhbar.Src.PresentationScreen.Onboarding.Components.Indicator
import com.example.akhbar.Src.PresentationScreen.Onboarding.Components.OnBoardingPage
import com.example.akhbar.Src.PresentationScreen.Onboarding.Dimensions.Mediumpadding2
import com.example.akhbar.Src.PresentationScreen.Onboarding.Dimensions.pageIndicatorwidth
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        val pagerState = rememberPagerState(initialPage = 0) {
            pages.size
        }
        val buttonstate = remember {
            derivedStateOf {
                when (pagerState.currentPage) {
                    0 -> listOf("", "Next")
                    1 -> listOf("Back", "Next")
                    2 -> listOf("Back", "Get Started")
                    else -> listOf("", "")
                }
            }
        }
        HorizontalPager(state = pagerState) { index ->
            OnBoardingPage(page = pages[index])
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = Mediumpadding2)
                .navigationBarsPadding(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Indicator(
                modifier = Modifier.width(pageIndicatorwidth),
                Pagesize = pages.size,
                selectedPage = pagerState.currentPage
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                val scope= rememberCoroutineScope()
                if(buttonstate.value[0].isNotEmpty()){
                    newstext(text=buttonstate.value[0],
                        onClick = {
                            scope.launch {
                                pagerState.animateScrollToPage(page = pagerState.currentPage-1)
                            }
                        })

                }
                NewsButton(
                    text = buttonstate.value[1],
                    onClick = {
                        scope.launch {
                            if(pagerState.currentPage==3){
                                // TODO: navigate to homeScreen
                            }else{
                                pagerState.animateScrollToPage(
                                    page = pagerState.currentPage+1
                                )
                            }
                        }
                    }
                )
            }

        }


    }

}
//@Preview(showBackground = true)
//@Preview(showSystemUi = true)
//@Composable
//private fun justprev() {
//    OnBoardingScreen()
//}