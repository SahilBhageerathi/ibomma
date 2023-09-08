package com.example.mvvmsample.model

import java.io.Serializable

data class Movie (
    val id: Int,
    val name: String,
    val year: Int,
    val rating : Double,
    val imageId : Int,
    val overview : String
) : Serializable