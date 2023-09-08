package com.example.mvvmsample.View.homeScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mvvmsample.View.homeScreen.MovieImage
import com.example.mvvmsample.model.Movie

@Composable//to make clickable here we give the Type Movie
fun MovieListItem(movie: Movie,navController: NavController){
    Card(
        modifier= Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .clickable{navController.navigate("Details/${movie.id}")},
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        shape= RoundedCornerShape(corner= CornerSize(10.dp))
    ) {
        Row(
            modifier= Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            //.clickable { selectedItem(movie) },//to make clickable here we give variable
            verticalAlignment = Alignment.CenterVertically
        ){
            MovieImage(movie)
            Column {
                Text(text = movie.name, style= MaterialTheme.typography.headlineSmall,)
                Spacer(modifier= Modifier.height(4.dp))
                Text(
                    text =movie.overview,
                    style= MaterialTheme.typography.bodyLarge,
                    maxLines=3,
                    overflow= TextOverflow.Ellipsis,
                )
                Spacer(modifier= Modifier.height(8.dp))
                Row(horizontalArrangement = Arrangement.SpaceBetween,
                    modifier= Modifier.fillMaxWidth()
                ){
                    Text(text = movie.year.toString(),style= MaterialTheme.typography.headlineSmall)
                    Text(text = movie.rating.toString(),style= MaterialTheme.typography.headlineSmall)

                }
            }
        }

    }

}