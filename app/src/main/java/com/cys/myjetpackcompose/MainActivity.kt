package com.cys.myjetpackcompose

import android.content.Context
import android.os.Bundle
import android.security.identity.PersonalizationData
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cys.myjetpackcompose.ui.theme.MyJetpackComposeTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ProfileData(nombre = "Sara")
        }

    }


    @Composable
    private fun ProfileData(nombre:String){
        MaterialTheme() {
            
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(painter = painterResource(id = R.drawable.fotoperfilgit1),
                    contentDescription = "foto",

                    Modifier

                        .border(
                            border = BorderStroke(3.dp, Color.Black),
                            shape = RoundedCornerShape(50)
                        )
                        .clip(RoundedCornerShape(size = 200.dp))

                )
                MaterialTheme{
                    Text(text = "Sara Corrales Santos",
                    style = MaterialTheme.typography.h4)
                }
                Button(onClick = { num++
                    Toast.makeText(baseContext, num, Toast.LENGTH_LONG).show()}) {
                    Text(text = "Like")
                }


            }
        }


    }

    @Preview
    @Composable
    fun PreviewPersonalData(){
        ProfileData(nombre = "Sara")
    }


    fun sumar():Int{
        num++
        Toast.makeText(baseContext, num, Toast.LENGTH_LONG).show()
        return num
    }
}

