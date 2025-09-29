package com.example.businescard.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Job

@Composable
fun BusinessCard(
    name: String,
    job: String,
    phone: String,
    socialMedia: String,
    email: String,
    image: Painter
) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(Modifier.weight(1f))
            NameCard(name, job, image)
            Spacer(Modifier.weight(1f))
            ContactCard(phone, email, socialMedia)
        }
    }
}