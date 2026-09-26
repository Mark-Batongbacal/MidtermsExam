package com.example.midtermsexam

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource

private val textSmall = Color(0xFFb7bdac)



@Composable
fun LoginScreen() {

    var showDialogLogin by remember { mutableStateOf(false) }
    var forgotPassword by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff1a1a19))
    ){

        Column(
            modifier = Modifier.fillMaxSize()
                .padding(top = 50.dp, bottom = 15.dp),
                verticalArrangement = Arrangement.spacedBy(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier.size(75.dp)
            )

            Text(
                text = "Welcome Back",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 1.4.sp)

            Text(
                text = "Sign in to continue",
                color = textSmall,
                fontSize = 12.sp,
                letterSpacing = 1.4.sp)

            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 50.dp, bottom = 15.dp, start = 30.dp, end = 30.dp),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Text(
                    text = "Email",
                    color = textSmall,
                    fontSize = 12.sp,
                    letterSpacing = 1.4.sp
                )

                var email by remember { mutableStateOf("") }

                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Gray,
                        unfocusedBorderColor = Color.Gray
                    ),
                    value = email,
                    onValueChange = { email = it },
                    placeholder = { Text("name@company.com") }

                )

                Text(
                    text = "Password",
                    color = textSmall,
                    fontSize = 12.sp,
                    letterSpacing = 1.4.sp
                )

                var password by remember { mutableStateOf("") }

                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = password,
                    onValueChange = { password = it },
                    placeholder = { Text("name@company.com") },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Gray,
                        unfocusedBorderColor = Color.Gray,
                        focusedTextColor = Color.Gray,
                        unfocusedTextColor = Color.Gray
                    ),
                )
                Column(
                    modifier = Modifier.fillMaxWidth()
                        .padding(top = 50.dp, bottom = 15.dp),
                    verticalArrangement = Arrangement.spacedBy(15.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        modifier = Modifier.fillMaxWidth().padding(bottom = 5.dp)
                            .size(width = 15.dp, height = 50.dp),
                        onClick = { showDialogLogin = true },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF2a78d6),
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(
                            text = "Sign in",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp
                        )
                    }

                    Text(

                        text = "Forgot Password",
                        color = Color(0xFF2a78d6),
                        fontSize = 12.sp,
                        letterSpacing = 1.4.sp,
                        modifier = Modifier.clickable{
                            forgotPassword = true
                        }
                    )

                    if (showDialogLogin) {
                        AlertDialog(
                            onDismissRequest = {
                                // Dismiss the dialog when the user clicks outside or presses back
                                showDialogLogin = false
                            },
                            title = {
                                Text(text = "Notification")
                            },
                            text = {
                                Text(text = "Logging in as $email")
                            },
                            confirmButton = {
                                TextButton(onClick = { showDialogLogin = false }) {
                                    Text("OK")
                                }
                            },
                            dismissButton = {
                                TextButton(onClick = { showDialogLogin = false }) {
                                    Text("Cancel")
                                }
                            }
                        )
                    }

                    if (forgotPassword) {
                        AlertDialog(
                            onDismissRequest = {
                                // Dismiss the dialog when the user clicks outside or presses back
                                forgotPassword = false
                            },
                            title = {
                                Text(text = "Notification")
                            },
                            text = {
                                Text(text = "Work in Progress")
                            },
                            confirmButton = {
                                TextButton(onClick = { forgotPassword = false }) {
                                    Text("OK")
                                }
                            },
                            dismissButton = {
                                TextButton(onClick = { forgotPassword = false }) {
                                    Text("Cancel")
                                }
                            }
                        )
                    }

                }
            }
        }




    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}