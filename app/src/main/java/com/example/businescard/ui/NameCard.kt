package com.example.businescard.ui

import ads_mobile_sdk.h6
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp


@Composable
fun NameCard(name: String, job: String, image: Painter) {
    Card(Modifier.padding(16.dp)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = image, contentDescription = null, Modifier.size(64.dp))
            Text(name, style = MaterialTheme.typography.headlineLarge)
            Text(job, style = MaterialTheme.typography.bodyLarge)

        }
    }
}