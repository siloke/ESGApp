package com.fiap.esgapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fiap.esgapp.R
import com.fiap.esgapp.ui.theme.ESGAppTheme

@Composable
fun HomeScreen(navController: NavController? = null) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xFFF7F7F7)),
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            //Main section
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(color = Color.Transparent),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Row {
                    Box(contentAlignment = Alignment.Center) {
                        Image(
                            painterResource(id = R.drawable.avatar),
                            contentDescription = "Avatar",
                            modifier = Modifier
                                .size(50.dp)
                                .clip(CircleShape)
                        )
                        Box(modifier = Modifier
                            .size(15.dp)
                            .background(
                                color = Color(0xFF12B76A),
                                shape = CircleShape
                            )
                            .border(
                                width = 1.5.dp,
                                color = Color.White,
                                shape = CircleShape
                            )
                            .align(Alignment.BottomEnd)
                        )
                    }
                    Column(modifier = Modifier
                        .fillMaxHeight()
                        .padding(start = 10.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Olivia",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        )
                        Text(
                            text = "olivia@gmail.com",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(0xFF6A6A6A)
                        )
                    }
                }
                IconButton(onClick = {
                    if (navController != null) {
                        navController.navigate("login")
                    }
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.exit),
                        contentDescription = "Exit Icon"
                    )
                }
            }

            //Recommendations section
            Spacer(modifier = Modifier.height(10.dp))
            Column(modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Recommendations",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(5.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painterResource(id = R.drawable.avatar2),
                            contentDescription = "Avatar",
                            modifier = Modifier
                                .size(45.dp)
                                .clip(RoundedCornerShape(5.dp))
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Lucas",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(0xFF989898)
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painterResource(id = R.drawable.avatar3),
                            contentDescription = "Avatar",
                            modifier = Modifier
                                .size(45.dp)
                                .clip(RoundedCornerShape(5.dp))
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Pedro",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(0xFF989898)
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painterResource(id = R.drawable.avatar4),
                            contentDescription = "Avatar",
                            modifier = Modifier
                                .size(45.dp)
                                .clip(RoundedCornerShape(5.dp))
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Ana",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(0xFF989898)
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painterResource(id = R.drawable.avatar5),
                            contentDescription = "Avatar",
                            modifier = Modifier
                                .size(45.dp)
                                .clip(RoundedCornerShape(5.dp))
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Maria",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(0xFF989898)
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painterResource(id = R.drawable.avatar6),
                            contentDescription = "Avatar",
                            modifier = Modifier
                                .size(45.dp)
                                .clip(RoundedCornerShape(5.dp))
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Thiago",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(0xFF989898)
                        )
                    }

                }
            }

            //Progress section
            Column(modifier = Modifier.fillMaxWidth()
            ){
                Text(
                    text = "Progress",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(5.dp))
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(
                            start = 0.dp,
                            top = 20.dp,
                            end = 0.dp,
                            bottom = 20.dp
                        )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.progress_circle),
                        contentDescription = "Progress circle image",
                    )
                }
            }

            //Buttons section
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFEE4A56),
                        contentColor = Color.White
                    ),
                    modifier = Modifier.weight(0.5f)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.plus_circle),
                        contentDescription = "Plus sign icon"
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = "New activity",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    ),
                    modifier = Modifier.weight(0.5f)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.settings),
                        contentDescription = "Plus sign icon"
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = "Settings",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            //Browse section
            Column {
                Text(
                    text = "Browse",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(5.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .weight(0.5f)
                        .padding(15.dp)
                    ){
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                            Box(modifier = Modifier
                                .background(
                                    color = Color(0xFFE9F8F0),
                                    shape = RoundedCornerShape(5.dp),
                                )
                                .padding(10.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.gift),
                                    contentDescription = "Gift icon",
                                )
                            }
                            Icon(
                                painter = painterResource(id = R.drawable.arrow_left),
                                contentDescription = "Arrow icon",
                            )
                        }
                        Spacer(modifier = Modifier.height(25.dp))
                        Column{
                            Text(
                                text = "Points",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFF989898)
                            )
                            Text(
                                text = "2.340",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .weight(0.5f)
                        .padding(15.dp)
                    ){
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                            Box(modifier = Modifier
                                .background(
                                    color = Color(0xFFE3EBFE),
                                    shape = RoundedCornerShape(5.dp),
                                )
                                .padding(10.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.users),
                                    contentDescription = "Users icon",
                                )
                            }
                            Icon(
                                painter = painterResource(id = R.drawable.arrow_left),
                                contentDescription = "Arrow icon",
                            )
                        }
                        Spacer(modifier = Modifier.height(25.dp))
                        Column{
                            Text(
                                text = "Recommendations",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFF989898)
                            )
                            Text(
                                text = "6",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .weight(0.5f)
                        .padding(15.dp)
                    ){
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                            Box(modifier = Modifier
                                .background(
                                    color = Color(0xFFFDE0DC),
                                    shape = RoundedCornerShape(5.dp),
                                )
                                .padding(10.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.cart),
                                    contentDescription = "Cart icon",
                                )
                            }
                            Icon(
                                painter = painterResource(id = R.drawable.arrow_left),
                                contentDescription = "Arrow icon",
                            )
                        }
                        Spacer(modifier = Modifier.height(25.dp))
                        Column{
                            Text(
                                text = "Vouchers",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFF989898)
                            )
                            Text(
                                text = "2",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(modifier = Modifier
                        .background(
                            color = Color.Transparent,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .weight(0.5f)
                        .padding(15.dp)
                    ){

                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() {
    ESGAppTheme {
        HomeScreen()
    }
}