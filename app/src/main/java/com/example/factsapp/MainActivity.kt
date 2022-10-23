package com.example.factsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.factsapp.screens.AppName
import com.example.factsapp.screens.Home
import com.example.factsapp.screens.SplashScreen
import com.example.factsapp.ui.theme.FactsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FactsAppTheme {
                Navigation()
            }
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen") {
        composable("splash_screen") {
            SplashScreen(navController = navController)
        }
        composable("app_name") {
            AppName(navController = navController)
        }
        composable("home") {
            FactsApp()
        }
    }
}

@Composable
fun FactsApp() {
    FactsAppTheme {
        Home()
    }
}