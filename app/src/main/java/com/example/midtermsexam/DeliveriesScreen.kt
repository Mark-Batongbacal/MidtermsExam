package com.example.midtermsexam

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DeliveriesScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF1a1a19),
                    titleContentColor = Color.White,
                ),
                title = {

                    Row(horizontalArrangement = Arrangement.spacedBy(190.dp), modifier = Modifier.padding(15.dp)) {
                        Text("Deliveries")


                        Image(
                            painter = painterResource(id = R.drawable.bell),
                            contentDescription = "App Logo",
                            modifier = Modifier.size(40.dp)
                        )
                    }
                },
                modifier = Modifier.shadow(elevation = 50.dp)
            )
        },
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xff1a1a19))
                .padding(innerPadding)
        ){
            Column(
                modifier = Modifier.fillMaxWidth().padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ){
                Card(modifier = Modifier.fillMaxWidth().background(Color(0xff151515))) {
                    Row(horizontalArrangement = Arrangement.spacedBy(20.dp,alignment = Alignment.CenterHorizontally),verticalAlignment = Alignment.CenterVertically , modifier = Modifier.padding(15.dp)){
                        Image(
                            painter = painterResource(id = R.drawable.logo2),
                            contentDescription = "App Logo",
                            modifier = Modifier.size(40.dp)
                        )

                        Column(){
                            Text(text = "Station 04 - Angeles")
                            Text(text = "1,200L diesel en route")
                        }

                        Image(
                            painter = painterResource(id = R.drawable.ontime),
                            contentDescription = "App Logo",
                            modifier = Modifier.size(40.dp)
                        )

                    }
                }
                Card(modifier = Modifier.fillMaxWidth().background(Color(0xff151515))) {
                    Row(horizontalArrangement = Arrangement.spacedBy(20.dp,alignment = Alignment.CenterHorizontally),verticalAlignment = Alignment.CenterVertically , modifier = Modifier.padding(15.dp)){
                        Image(
                            painter = painterResource(id = R.drawable.logo3),
                            contentDescription = "App Logo",
                            modifier = Modifier.size(40.dp)
                        )

                        Column(){
                            Text(text = "Station 04 - Angeles")
                            Text(text = "1,200L diesel en route")
                        }

                        Image(
                            painter = painterResource(id = R.drawable.ontime),
                            contentDescription = "App Logo",
                            modifier = Modifier.size(40.dp)
                        )

                    }
                }
                Card(modifier = Modifier.fillMaxWidth().background(Color(0xff151515))) {
                    Row(horizontalArrangement = Arrangement.spacedBy(20.dp,alignment = Alignment.CenterHorizontally),verticalAlignment = Alignment.CenterVertically , modifier = Modifier.padding(15.dp)){
                        Image(
                            painter = painterResource(id = R.drawable.logo4),
                            contentDescription = "App Logo",
                            modifier = Modifier.size(40.dp)
                        )

                        Column(){
                            Text(text = "Station 04 - Angeles")
                            Text(text = "1,200L diesel en route")
                        }

                        Image(
                            painter = painterResource(id = R.drawable.ontime),
                            contentDescription = "App Logo",
                            modifier = Modifier.size(40.dp)
                        )

                    }
                }
            }
        }
    }
}


