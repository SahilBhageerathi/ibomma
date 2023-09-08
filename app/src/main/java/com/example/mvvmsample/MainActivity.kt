package com.example.mvvmsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmsample.View.homeScreen.DisplayMovieList
import com.example.mvvmsample.ViewModel.MovieListViewModel
import com.example.mvvmsample.ui.theme.MvvmsampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var movieViewModel=ViewModelProvider(this).get(MovieListViewModel :: class.java)
            MvvmsampleTheme {
               Nav()

            }
        }
    }
}













@Composable
fun MovieList() {
    var scrollState= rememberScrollState()
    Column(
        modifier= Modifier.verticalScroll(scrollState)
    ) {
       for (i in 1..100){
        Text(text = "User Name $i",
             modifier = Modifier.padding(5.dp),
                 fontSize=20.sp
            )
            Divider(color = Color.Black, thickness = 5.dp)
       }
    }
}

@Composable
fun MovieList2(selectedItem:(String)->(Unit)){
    LazyColumn{
        items(100){
            Text(text = "User Name $it",
                fontSize=20.sp,
                modifier = Modifier
                    .padding(5.dp)
                    .clickable { selectedItem("$it selectedItem") }

            )
            Divider(color = Color.Black, thickness = 5.dp)

        }
    }
}

