package com.example.lab4_kot104

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab4_kot104.ui.theme.Lab4_KOT104Theme
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            loginScreen()
        }
    }
}


@Composable
fun loginScreen(){
    val context= LocalContext.current
    var userName by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column {
        Image(painter= painterResource(id = R.drawable.ic_launcher_background) , contentDescription ="logo" )
        TextField(value = userName, onValueChange = {
            userName = it }, label = { Text(text = "UserName") })
        TextField(value = password, onValueChange = {
            password = it }, label = { Text(text = "Password") })
        Button(onClick = {
            Toast.makeText(context, "Enter userName $userName passwword $password", Toast.LENGTH_LONG).show()
        }) {
            Text(text = "Login")
        }
    }
}