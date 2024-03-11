package com.fiap.esgapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fiap.esgapp.R
import com.fiap.esgapp.ui.theme.ESGAppTheme

@Composable
fun LoginScreen(navController: NavController? = null) {
    Column(modifier = Modifier
        .fillMaxHeight()
        .padding(20.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logotipo"
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Quantum",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Column {
            Text(
                text = "Welcome Back",
                fontSize = 36.sp
            )
            Text(
                text = "Log in to your account",
                fontSize = 20.sp,
                color = Color(0xFFEA1D2C)
            )
            Spacer(modifier = Modifier.height(30.dp))
            TextField(
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "Email",
                        color = Color(0xFF667085)
                    )
                },
                modifier = Modifier
                    .border(
                        border = BorderStroke(1.dp, Color(0xFFD0D5DD)),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .fillMaxWidth(),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.White,
                    focusedContainerColor = Color.White,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent
                ),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.email),
                        contentDescription = "E-mail Icon",
                        tint = Color.Unspecified
                    )
                }
            )
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "Password",
                        color = Color(0xFF667085)
                    )
                },
                modifier = Modifier
                    .border(
                        border = BorderStroke(1.dp, Color(0xFFD0D5DD)),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .fillMaxWidth(),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.White,
                    focusedContainerColor = Color.White,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent
                ),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.lock),
                        contentDescription = "Lock Icon",
                        tint = Color.Unspecified
                    )
                }
            )
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                onClick = {
                    if (navController != null) {
                        navController.navigate("home")
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEA1D2C)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "Log in")
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row (modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
                Divider(
                    color = Color(0xFFD0D5DD),
                    thickness = 2.dp,
                    modifier = Modifier.weight(0.5f)
                )
                Text (text = "OR",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFD0D5DD),
                    modifier = Modifier.padding(
                        start = 8.dp,
                        top = 0.dp,
                        end = 8.dp,
                        bottom = 0.dp
                    )
                )
                Divider(
                    color = Color(0xFFD0D5DD),
                    thickness = 2.dp,
                    modifier = Modifier.weight(0.5f)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Forgot your password?",
                fontSize = 12.sp,
                color = Color(0xFFEA1D2C),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    ESGAppTheme {
        LoginScreen()
    }
}