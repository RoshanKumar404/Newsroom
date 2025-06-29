package com.example.akhbar.Src.PresentationScreen.Onboarding.Components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.akhbar.R
import com.example.akhbar.Src.PresentationScreen.Onboarding.Dimensions.Mediumpadding1
import com.example.akhbar.Src.PresentationScreen.Onboarding.Dimensions.Mediumpadding2
import com.example.akhbar.Src.PresentationScreen.Onboarding.Page
import com.example.akhbar.Src.PresentationScreen.Onboarding.pages

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page
) {

    Column(modifier = Modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.63f),
            painter = painterResource(id = page.Image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(Mediumpadding1))
        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal = Mediumpadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = Color.Cyan
        )
        Text(
            text = page.description,
            modifier = Modifier.padding(horizontal = Mediumpadding2),
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Magenta
        )


    }

}

@Preview(showBackground = true, )
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES,) //showSystemUi = true)
@Composable
fun OnBoardingprev() {
    OnBoardingPage(
        page = Page(
            title = "jai ho",
            description = "its the firest page",
            Image = R.drawable.onboard1
        )
    )
}