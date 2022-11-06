package com.cys.myjetpackcompose.screens

import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.cys.myjetpackcompose.R
import com.cys.myjetpackcompose.navigation.AppNavigation
import com.cys.myjetpackcompose.navigation.AppScreens


@Composable
fun ProfileScreem(navController: NavController){
    Scaffold {
        TopAppBar() {
            Text(text = "Profile")
        }
        BodyContentProfile(navController)
    }
}

@Composable
fun BodyContentProfile(navController: NavController){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 100.dp)
            .width(2000.dp)


    ) {

        Image(painter = painterResource(id = R.drawable.fotoperfilgit1),
            contentDescription = "foto",

            Modifier
                .border(
                    border = BorderStroke(3.dp, Color.Black),
                    shape = RoundedCornerShape(50)
                )
                .clip(RoundedCornerShape(size = 200.dp))
                .size(250.dp)


        )
        MaterialTheme{
            Text(text = "Sara Corrales Santos",
                style = MaterialTheme.typography.h4)
        }
        Button(onClick = {
            navController.navigate(route = AppScreens.SkillsScreen.route)
        },
        Modifier.padding(top = 100.dp)
            ) {
            Text(text = "Skills")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewProfile(){
    AppNavigation()
}
