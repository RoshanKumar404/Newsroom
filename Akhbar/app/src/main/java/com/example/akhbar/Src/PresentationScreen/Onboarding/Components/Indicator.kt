package com.example.akhbar.Src.PresentationScreen.Onboarding.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.akhbar.Src.PresentationScreen.Onboarding.Dimensions.IndicatorSize

@Composable
fun Indicator(modifier: Modifier = Modifier,
              Pagesize:Int,
              selectedPage:Int,
              selctedcolor:Color= MaterialTheme.colorScheme.primary,
              unselectedColor:Color= Color.Blue,
               ) {
    Row (modifier=Modifier, horizontalArrangement = Arrangement.SpaceBetween)
    { repeat(Pagesize){page->
        Box(modifier = Modifier
            .size(IndicatorSize)
            .clip(CircleShape)
            //.padding(10.dp)
            .background(color = if (page == selectedPage) selctedcolor else unselectedColor))
    }  }
    
}

//@Preview
//@Composable
//private fun Indicaator() {
//    Indicator(
//        Pagesize=3,
//        selectedPage=10
//    )
//}