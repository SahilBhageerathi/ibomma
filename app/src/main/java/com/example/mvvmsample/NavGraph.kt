package com.example.mvvmsample

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mvvmsample.View.ViewInfo
import com.example.mvvmsample.View.homeScreen.DisplayMovieList
import com.example.mvvmsample.ViewModel.MovieListViewModel


@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination ="Home") {
       composable("Home"){
           DisplayMovieList(MovieListViewModel(),navController)

       }
        composable(
            "Details/{id}",
            arguments = listOf(
                navArgument("id"){
                    type= NavType.IntType
                }
            )
        ){
                backStackEntry->{}
            val x=backStackEntry.arguments?.getInt("id")
            if(x!=null)
            ViewInfo(MovieListViewModel(),x)
        }
    }
}