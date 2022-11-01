package com.cys.myjetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cys.myjetpackcompose.screens.ProfileScreem
import com.cys.myjetpackcompose.screens.SkillsScreem

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.ProfileScreen.route){
        composable(route = AppScreens.ProfileScreen.route){
            ProfileScreem(navController)
        }
        composable(route = AppScreens.SkillsScreen.route){
            SkillsScreem(navController)
        }
    }
}