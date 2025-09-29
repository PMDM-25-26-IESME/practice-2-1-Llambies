package com.example.businescard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.businescard.ui.BusinessCard
import com.example.businescard.ui.theme.BusinesCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCard(
                name = "Adrian Maldonado Llambies",
                job = "Waiter",
                phone = "+34 111 222 333",
                socialMedia = "@owoma",
                email = "adrmallla@alu.edu.gva.es",
                image = painterResource(id = R.drawable.ic_launcher_foreground)
            )
        }
    }
}


