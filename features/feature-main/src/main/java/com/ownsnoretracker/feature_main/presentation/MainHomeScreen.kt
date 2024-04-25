package com.ownsnoretracker.feature_main.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun MainHomeScreen(
    navHostController: NavHostController,
) {
    Column {
        Text(text = "main")
    }
}