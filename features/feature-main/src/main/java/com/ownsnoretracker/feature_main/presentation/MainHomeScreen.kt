package com.ownsnoretracker.feature_main.presentation

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ownsnoretracker.ui_components.R
import com.ownsnoretracker.ui_components.values.mainTheme
import kotlinx.coroutines.delay


@Composable
fun MainHomeScreen(
    navHostController: NavHostController,
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(mainTheme)
    ) {
        var triggerAnimation by remember { mutableStateOf(false) }

        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp)
        ) {
            PulsingImage(
                triggerAnimation = triggerAnimation,
                onAnimate = { triggerAnimation = it }
            )
        }

        LaunchedEffect(triggerAnimation) {
            if (triggerAnimation) {
                delay(200)
                triggerAnimation = false
            }
        }
    }
}

@Composable
fun PulsingImage(
    triggerAnimation: Boolean,
    onAnimate: (Boolean) -> Unit
) {
    val imageSize by animateDpAsState(
        targetValue = if (triggerAnimation) 220.dp else 200.dp,
        label = ""
    )

    Image(
        painter = painterResource(id = R.drawable.moon),
        contentDescription = "CheckIcon",
        modifier = Modifier
            .size(imageSize)
            .clip(CircleShape)
            .clickable { onAnimate(true) }
    )
}