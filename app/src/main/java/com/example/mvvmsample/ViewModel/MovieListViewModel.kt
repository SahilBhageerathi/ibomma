package com.example.mvvmsample.ViewModel

import androidx.lifecycle.ViewModel
import com.example.mvvmsample.model.Movie
import com.example.mvvmsample.model.MovieListData

class MovieListViewModel:ViewModel() {
    fun getMovieList():List<Movie>{
        return MovieListData.allMovies
    }

    fun getSingleMovie(id:Int):Movie{
        return MovieListData.allMovies[id]
    }
}