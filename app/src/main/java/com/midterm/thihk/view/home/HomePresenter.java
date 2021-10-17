package com.midterm.thihk.view.home;

import androidx.annotation.NonNull;

import com.midterm.thihk.api.PlantClient;
import com.midterm.thihk.model.Categories;
import com.midterm.thihk.model.Plants;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.midterm.thihk.Utils;

class HomePresenter {

    private HomeView view;

    public HomePresenter(HomeView view) {
        this.view = view;
    }

    void getPlants() {

        view.showLoading();

        Call<Plants> plantsCall = Utils.getApi().getPlants();
        plantsCall.enqueue(new Callback<Plants>() {
            @Override
            public void onResponse(@NonNull Call<Plants> call, @NonNull Response<Plants> response) {
                view.hideLoading();

                if (response.isSuccessful() && response.body() != null) {

                    view.setPlant(response.body().getPlants());

                }
                else {
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Plants> call, @NonNull Throwable t) {
                view.hideLoading();
                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }


    void getCategories() {

        view.showLoading();

        Call<Categories> categoriesCall = Utils.getApi().getCategories();
        categoriesCall.enqueue(new Callback<Categories>() {
            @Override
            public void onResponse(@NonNull Call<Categories> call,
                                   @NonNull Response<Categories> response) {

                view.hideLoading();
                if (response.isSuccessful() && response.body() != null) {

                    view.setCategory(response.body().getCategories());

                }
                else {
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Categories> call, @NonNull Throwable t) {
                view.hideLoading();
                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }
}
