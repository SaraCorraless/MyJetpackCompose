package com.cys.myjetpackcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.cys.myjetpackcompose.navigation.AppNavigation
import com.cys.myjetpackcompose.navigation.AppScreens

@Composable
fun SkillsScreem(navController: NavController){
    Scaffold {
        TopAppBar {

            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow back",
            modifier = Modifier.clickable {
                navController.popBackStack()
            })
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "Skills")
        }
        BodyContentSkills(navController)
    }
}

@Composable
fun BodyContentSkills(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Skills de Sara")
        Button(onClick = {
            navController.navigate(route = AppScreens.ProfileScreen.route)
        }) {
            Text(text = "Skills")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewSkills(){
    AppNavigation()
}
