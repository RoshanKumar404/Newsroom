package com.example.myapplication.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            //.background(color = Color.White)
            .background(
                //shape = RoundedCornerShape(topEnd = 24.dp),
               // color = Color.White,
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFFF8C42), Color(0xFFFF7A2B)),
                ),

            )
    )
    //column styling ends here
    {
        Column(
            modifier = Modifier
                .weight(0.65f)
                .fillMaxWidth(),
//                .background(shape = RoundedCornerShape(30.dp),
//                    color = Color.White),
            verticalArrangement = Arrangement.Center,
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
        Column(
            modifier = Modifier
                .background(color = Color.White,
                    shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
                )
                .weight(0.35f)
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    "Enjoy your fresh Salad",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFF272140),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    "Your Salad will be delivered in 10 min after the order placed",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF272140),
                    textAlign = TextAlign.Center,

                    )
                Spacer(modifier = Modifier.height(25.dp))

                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8C42))
                ) {
                    Text(
                        "Tap me with love!!", fontSize = 30.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }

        }


        //till here the maiin column is
    }
}


//@Preview
//@Composable
//fun prevWelcome() {
//    WelcomeScreen()
//}