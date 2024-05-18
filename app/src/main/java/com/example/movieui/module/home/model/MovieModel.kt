package com.example.movieui.module.home.model

import com.example.movieui.R

data class MovieModel(
    val id:String,
    val title: String,
    val assetImage: Int,
    val type: String,
    val duration: String,
    val rating: String,
    val synopsis: String,
    val isPlaying: Boolean
)


val upcomingMovie = listOf(
    MovieModel(
        id= "1",
        title = "Avengers: Endgame",
        assetImage = R.drawable.avenger,
        type = "Action",
        duration = "3h 1m",
        rating = "8.4/10",
        synopsis = "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
        isPlaying = true
    ),
    MovieModel(
        id= "2",
        title = "Parasite",
        assetImage = R.drawable.parasite,
        type = "Thriller",
        duration = "2h 12m",
        rating = "8.5/10",
        synopsis = "Greed and class discrimination threaten the newly-formed symbiotic relationship between the wealthy Park family and the destitute Kim clan.",
        isPlaying = true
    ),
    MovieModel(
        id= "3",
        title = "John Wick: Chapter 3 - Parabellum",
        assetImage = R.drawable.johnwick,
        type = "Action",
        duration = "2h 10m",
        rating = "7.4/10",
        synopsis = "John Wick is on the run after killing a member of the international assassins' guild, and with a $14 million price tag on his head, he is the target of hit men and women everywhere.",
        isPlaying = true
    )
)

