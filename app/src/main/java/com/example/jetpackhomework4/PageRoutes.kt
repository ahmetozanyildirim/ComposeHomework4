package com.example.jetpackhomework4

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun PageRoutes() {
    val navController = rememberNavController()

    NavHost(navController =navController , startDestination = "home" ){
        composable("Home") {
            Home(navController=navController)
        }
        composable("PageA") {
            PageA(navController=navController)
    }
        composable("PageB") {
            PageB(navController=navController)
        }
        composable("PageX") {
            PageX(navController=navController)
        }
        composable("PageY") {
            PageY(navController=navController)
        }

}}