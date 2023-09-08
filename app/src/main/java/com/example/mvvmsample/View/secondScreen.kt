package com.example.mvvmsample.View

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvvmsample.ViewModel.MovieListViewModel
import com.example.mvvmsample.model.MovieListData
import com.example.mvvmsample.model.Movie


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun displayDetails() {
    val x = MovieListViewModel()
    ViewInfo(x,3)
}

@Composable
fun ViewInfo(AllMovies:MovieListViewModel,id:Int) {
    val movie=AllMovies.getSingleMovie(id-1)
    Card(
        modifier = Modifier.padding(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        border = BorderStroke(2.dp, Color.Red)
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
                .verticalScroll(rememberScrollState())
        ) {

            Image(
                painter = painterResource(id = movie.imageId),
                contentDescription = "dummy",
                modifier = Modifier.clip(RoundedCornerShape(10.dp)),
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = movie.name,
                style = MaterialTheme.typography.displaySmall
            )
            Text(
                text = "IMDB : ${movie.rating}",
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = movie.overview,
                style = MaterialTheme.typography.headlineSmall
            )

        }
    }

}


//@Composable
//fun ViewInfo(movie: Movie){
//    Card(
//        modifier=Modifier.padding(10.dp),
//        elevation = CardDefaults.cardElevation(
//            defaultElevation = 10.dp
//        ),
//        shape= RoundedCornerShape(corner= CornerSize(10.dp))
//
//    ) {
//        Column(
//            modifier= Modifier
//                .fillMaxWidth()
//                .verticalScroll(rememberScrollState())
//                .padding()
//        ) {
//            Image(painter = painterResource(id = movie.imageId),
//                contentDescription = "dummy",
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .clip(shape = RoundedCornerShape(4.dp)),
//                contentScale = ContentScale.Fit
//            )
//            Spacer(modifier=Modifier.height(16.dp))
//            Text(
//                text =movie.name,
//                style=MaterialTheme.typography.displaySmall
//            )
//            Spacer(modifier=Modifier.height(16.dp))
//            Text(
//                text =movie.overview,
//                style=MaterialTheme.typography.headlineSmall
//            )
//            Spacer(modifier=Modifier.height(16.dp))
//            Text(
//                text ="Original release : ${movie.year}",
//                style=MaterialTheme.typography.displaySmall
//            )
//            Spacer(modifier=Modifier.height(16.dp))
//            Text(
//                text ="IMDB : ${movie.rating},
//                        style=MaterialTheme.typography.headlineSmall
//            )
//
//        }
//
//    }
//
//}







