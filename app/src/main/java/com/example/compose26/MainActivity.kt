package com.example.compose26

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose26.ui.theme.Compose26Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose26Theme {
                // A surface container using the 'background' color from the theme
                Surface(

                ) {
                    ProductCard(prize = "6", saladName = "Iceberg salad with cucumbers, tomatoes and onions",
                        weight = "180 gr", addSalad = "Add")
                }
            }
        }
    }
}

@Composable
fun ProductCard(prize:String, saladName:String, weight: String, addSalad:String) {
    Card(modifier = Modifier
        .width(180.dp)
        .height(245.dp)
        .padding(5.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)) {

        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {


            Image(painter = painterResource(id = R.drawable.salat3), contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(120.dp))


        Row(modifier = Modifier.fillMaxWidth()) {
            Image(painterResource(id = R.drawable.dollar_symbol), null, Modifier
                    .size(21.dp)
                    .padding(start = 5.dp))

            Text(text = prize, color = Color.Green,
            modifier = Modifier)}

        Row(modifier = Modifier.fillMaxWidth()) {
                Text (text = saladName, fontSize = 12.sp, lineHeight = 14.sp ,modifier = Modifier.padding(start = 5.dp))
        }

            Row(modifier = Modifier.fillMaxWidth()) {
                Text (text = weight, fontSize = 10.sp, color = Color.Gray, modifier = Modifier.padding(start = 5.dp))
            }


            Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                modifier = Modifier
                    .width(160.dp)
                    .padding(bottom = 3.dp)) {

                Text(text = addSalad, color = Color.Black, fontSize = 12.sp)
            }
        }}}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose26Theme {
        ProductCard(prize = "6", saladName = "Iceberg salad with cucumbers, tomatoes and onions", weight = "180 gr", addSalad = "Add")
    }
}