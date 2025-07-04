package com.example.akhbar.Src.PresentationScreen.Common

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.akhbar.R

@Composable
fun NewsButton(text:String,onClick:()->Unit) {

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.primary_blue)  // ✅ use Color directly
        ),
        shape = RoundedCornerShape(12.dp)  // ✅ shape goes here
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold)
            //color = Color.White // optional: text color
        )
    }

}

@Composable
fun newstext(modifier: Modifier = Modifier,text: String,onClick: () -> Unit) {
TextButton(onClick=onClick) {
    Text(
        text = text,
        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
        color = Color.White // optional: text color
    )
}

}

//@Preview
//@Composable
//private fun BUttonprev() {
//    NewsButton(text = "Soft Tap ") { }
//}