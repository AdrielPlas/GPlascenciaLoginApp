package com.example.loginapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import com.example.loginapp.models.User
import com.example.loginapp.ui.theme.LoginAppTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun LoginScreen(
    navController: NavController,
    innerPadding : PaddingValues
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black) // innerPadding
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center)
            ) {
                AsyncImage(
                    model = "https://s2.coinmarketcap.com/static/img/coins/64x64/1027.png", //No consegui una imagen parecida
                    contentDescription = null,
                    modifier = Modifier
                        .size(125.dp)
                        .clip(RoundedCornerShape(
                            topStart = 16.dp,
                            bottomStart = 16.dp,
                            bottomEnd = 16.dp,
                            topEnd = 0.dp
                        ))
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
                .clip(RoundedCornerShape(topStart = 80.dp))
                .background(Color.LightGray),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login",
                color = Color.Black,
                fontSize = 40.sp,
                modifier = Modifier
                    .padding(top = 60.dp, bottom = 30.dp)
            )
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
                    modifier = Modifier,
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
                        .fillMaxWidth(),
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
                    text = "Login",
                    color = Color.White
                )
            }
            // Texto register
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clickable{
                        navController.navigate(RegisterScreenRoute)
                    },
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(
                    text = "Don't have any account? Sign Up",
                    modifier = Modifier.padding(30.dp)
                )
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun LoginPreview() {
//    LoginScreen()
//}