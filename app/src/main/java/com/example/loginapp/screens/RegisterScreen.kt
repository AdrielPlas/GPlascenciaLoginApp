package com.example.loginapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil3.size.Size

@Composable
fun RegisterScreen(
        navController: NavController,
        innerPadding : PaddingValues
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Black),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(15.dp)
                        .clickable{
                            navController.navigate(LoginScreenRoute)
                        },
                )
                Text(
                    text = "Sign Up",
                    color = Color.White,
                    fontSize = 40.sp,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }

        }
        // Siguiente Cuestionario
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(7f)
                .clip(RoundedCornerShape(topStart = 80.dp))
                .background(Color.LightGray),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp, vertical = 20.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
            ) {
                Text(
                    text = "First name",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 15.dp, top = 12.dp)
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .height(55.dp),
                    placeholder = {
                        Text("Vijay")
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent
                    )
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp, vertical = 20.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
            ) {
                Text(
                    text = "Last name",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 15.dp, top = 12.dp)
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .height(55.dp),
                    placeholder = {
                        Text("Bhuva")
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent
                    )
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp, vertical = 20.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
            ) {
                Text(
                    text = "Email",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 15.dp, top = 12.dp)
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .height(55.dp),
                    placeholder = {
                        Text("Correo@email.com")
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent
                    )
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp, vertical = 20.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
            ) {
                Text(
                    text = "Password",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 15.dp, top = 12.dp)
                )
                TextField(
                    value = "",
                    onValueChange = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp),
                    visualTransformation = PasswordVisualTransformation(),
                    singleLine = true,
                    placeholder = {
                        Text(text = "*******")
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent
                    )
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp, vertical = 20.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
            ) {
                Text(
                    text = "Confirm password",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 15.dp, top = 12.dp)
                )
                TextField(
                    value = "",
                    onValueChange = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp),
                    visualTransformation = PasswordVisualTransformation(),
                    singleLine = true,
                    placeholder = {
                        Text(text = "*******", modifier = Modifier.fillMaxHeight())
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent
                    )
                )
            }

            // Boton Login
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp, bottomEnd = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black
                ),
            ) {
                Text(
                    text = "Sign Up",
                    color = Color.White
                )
            }
            // Texto register
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clickable{
                        navController.navigate(LoginScreenRoute)
                    },
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(
                    text = "Already have any account? Sign In",
                    modifier = Modifier.padding(30.dp)
                )
            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun RegisterPreview() {
//    RegisterScreen()
//}