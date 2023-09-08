package com.example.mvvmsample.View.homeScreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mvvmsample.ViewModel.MovieListViewModel
import com.example.mvvmsample.model.Movie
import com.example.mvvmsample.model.MovieListData

@Composable
fun DisplayMovieList(AllMovieList:MovieListViewModel,navController: NavController){
    val allMovieList= AllMovieList.getMovieList()//remember{ MovieListData.allMovies }
    LazyColumn(
        contentPadding = PaddingValues(horizontal=16.dp,vertical=8.dp)
    ){
        items(allMovieList.size){index->
            MovieListItem(allMovieList[index], navController)
        }
    }
}