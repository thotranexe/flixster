package com.codepath.flixster

import org.json.JSONArray


data class Movie (
    private val posterPath: String,
    val title: String,
    val overview: String,
)
{

    val posterImageURL = "https://image.tmdb.org/t/p/w500/$posterPath"
    companion object {
        fun fromJsonArray(movieJsonArray: JSONArray): List<Movie> {
            val movies = mutableListOf<Movie>()
            for(i in 0 until movieJsonArray.length()){
                val movieJson = movieJsonArray.getJSONObject(i)
                movies.add(
                    Movie(
                        movieJson.getString("poster_path"),
                        movieJson.getString("title"),
                        movieJson.getString("overview")
                    )
                )
            }
            return movies
        }
    }
}