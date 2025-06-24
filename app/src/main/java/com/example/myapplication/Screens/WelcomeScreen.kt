package com.example.myapplication.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            //.background(color = Color.White)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFFF8C42), Color(0xFFFF7A2B))
                )
            )
    )
    //column styling ends here
    {
        Column(
            modifier = Modifier
                .weight(0.65f)
                .fillMaxWidth(),verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        )
        {
            Box(
                modifier = Modifier
                    .size(300.dp)
                    .align(Alignment.CenterHorizontally)
                    .background(
                        color = Color.White.copy(alpha = 0.15f),
                        shape = CircleShape
                    ),
                //Alignment.BottomCenter

                contentAlignment = Alignment.Center
               // verticalArrangement=

            ) {
                Image(
                    modifier = Modifier
                        .fillMaxSize(0.8f)
                        .aspectRatio(1f),
                    painter = painterResource(R.drawable.food_4),
                    contentDescription = null
                )

            }
        }
        Column (
            modifier=Modifier.
                background(color = Color.White)
            .weight(0.35f).fillMaxWidth()

        ){

        }


        //till here the maiin column is
    }
}


@Preview
@Composable
fun prevWelcome() {
    WelcomeScreen()
}