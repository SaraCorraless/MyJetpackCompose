package com.cys.myjetpackcompose.navigation

sealed class AppScreens(val route:String){

    object ProfileScreen: AppScreens("profile_screen")
    object SkillsScreen: AppScreens("skills_screen")
}