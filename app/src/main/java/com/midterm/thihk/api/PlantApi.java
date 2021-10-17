package com.midterm.thihk.api;

import com.midterm.thihk.model.Categories;
import com.midterm.thihk.model.Plants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PlantApi {

    @GET("latest.php")
    Call<Plants> getPlants();

    @GET("categories.php")
    Call<Categories> getCategories();

    @GET("filter.php")
    Call<Plants> getPlantByCategory(@Query("c") String category);

    //TODO #3 Call the search.php with query string the meal name @GET("search.php)
}