package com.ownsnoretracker.feature_setting.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.ownsnoretracker.ui_components.values.mainTheme

@Composable
fun SettingScreen(
    navHostController: NavHostController
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(mainTheme)) {
        Text(text = "setting")
    }
}