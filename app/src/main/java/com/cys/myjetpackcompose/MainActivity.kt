package com.cys.myjetpackcompose

import android.os.Bundle
import android.security.identity.PersonalizationData
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cys.myjetpackcompose.ui.theme.MyJetpackComposeTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            PersonalData(nombre = "Sara")
        }

    }


    @Composable
    private fun PersonalData(nombre:String){
        MaterialTheme() {
            Column(
                modifier = Modifier.background(color = Color.Red),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.edad), contentDescription = "Edad", modifier = Modifier.height(100.dp), Alignment.Center)
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Mi nombre es $nombre")
                Text(text = "Mi primer jetpack compose", style = MaterialTheme.typography.h6)
                Text(text = "Mi nombre es $nombre")
            }
        }


    }

    @Preview
    @Composable
    fun PreviewPersonalData(){
        PersonalData(nombre = "Sara")
    }
}

