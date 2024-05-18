package com.example.movieui.module.splash.presentation

import android.window.SplashScreen
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ScaleFactor
import androidx.compose.ui.layout.lerp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.movieui.R
import com.example.movieui.core.route.AppRouteName
import com.example.movieui.core.theme.BlueVariant
import com.example.movieui.core.theme.Gray
import com.example.movieui.core.theme.Yellow
import com.example.movieui.module.home.model.MovieModel
import com.example.movieui.module.home.model.upcomingMovie
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.delay
import kotlin.math.absoluteValue

@Composable
fun SplashScreen(
    navController: NavHostController,
) {
    // Navigate to the login screen after a delay
    LaunchedEffect(Unit) {
        delay(SPLASH_SCREEN_DURATION)
        navController.navigate(AppRouteName.Login)
    }

    val brush = Brush.horizontalGradient(listOf(Color(0xFF001544), Color(0xFF001544)))

    // You can include any UI elements you want in your splash screen
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = brush),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.tixid),
            contentDescription = "Logo",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Welcome to",
            color = Color.White,
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "TIX ID",
            color = Color.White,
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

private const val SPLASH_SCREEN_DURATION = 2000L