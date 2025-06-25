package com.example.myapplication.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun HomeScreen(

) {
    // Spacer(modifier = Modifier.height(10.dp))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(horizontal = 16.dp)

    ) {
        Spacer(modifier = Modifier.height(14.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        )

        {

            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = null,
                modifier = Modifier.size(32.dp)
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.shopping_basket),
                    contentDescription = null,
                    modifier = Modifier.size(23.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text("Basket", fontSize = 12.sp, color = Color.Black)
            }
            //last line of this row
        }
        //greeting text
        Text(
            "Hey , Mr. Roshan  plzz tell us what combination of veggies and fruits are you looking for..",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(bottom = 10.dp)
        )
        //Adding searchbar
        //Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .size(60.dp)
                .padding(end = 16.dp)
                .background(
                    color = Color(0xFFF3F1F1),
                    shape = RoundedCornerShape(16.dp)
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
            // verticalAlignment = Alignment.CenterVertically

        )
        {
            Icon(
                imageVector = Icons.Default.Search, contentDescription = null,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .size(30.dp)
            )
//            Icon(
//                imageVector = Icons.Default.Edit, contentDescription = null,
//                modifier = Modifier
//                    .padding(horizontal = 10.dp)
//                    .size(30.dp)
//            )
            Image(
                painter = painterResource(R.drawable.filter_list), contentDescription = null,
                modifier = Modifier
                    .padding(end = 10.dp)

                    .size(30.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            "Recommondations", fontSize = 26.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 10.dp)
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(17.dp),
            modifier = Modifier.padding(bottom = 15.dp)
        ) {
            items(count = 4) { index ->
                RecomomdationsCard(
                    name = "Rohit's Fav",
                    price = "₹ 54",
                    ImgRes = R.drawable.food_2
                )
            }


        }
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(17.dp),
            modifier = Modifier.padding(bottom = 15.dp)
        ) {
            items(listOf("Hottest", "Popular", "New Combo", "Top")) { category ->
                Text(
                    text = category,
                    color = Color(0xFF272140),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .background(Color(0xFFF3F1F1), shape = RoundedCornerShape(12.dp))
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }

        //Category tab



        //las line of main column
    }
}


@Composable   //
fun RecomomdationsCard(modifier: Modifier = Modifier, name: String, price: String, ImgRes: Int) {
    val screenheight = LocalConfiguration.current.screenHeightDp.dp
    val screenwidth = LocalConfiguration.current.screenWidthDp.dp
    val cardhight = screenheight * 0.29f
    var cardwidth = 0.2f
    Card(
        modifier = Modifier
            .height(cardhight)
            .width(170.dp)
    ) {
        Column(modifier = Modifier.padding(start = 26.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = null,
                    tint = Color(0xFFFF8C42),
                    modifier = Modifier
                        .size(36.dp)

                )

            }
            Image(
                painter = painterResource(id = ImgRes),
                contentDescription = null,
                modifier = Modifier.size(120.dp)
            )
            Spacer(modifier = Modifier.height(9.dp))
            Text(
                text = name,
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(7.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = price,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF8C42)
                )
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .size(24.dp)
                        .background(color = Color(0xFFFF8C42), shape = CircleShape)
                    // .padding(end = 6.dp)
                )

            }
            //Spacer(modifier = Modifier.height(5.dp))
        }
    }
}

@Composable
fun Varieties(modifier: Modifier = Modifier) {
    
}

@Preview
@Composable
fun HomePrev() {
    HomeScreen()
    // RecomomdationsCard()
}