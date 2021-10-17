package com.midterm.thihk.view.category;

import com.midterm.thihk.model.Plants;

import java.util.List;

public interface CategoryView {
    void showLoading();
    void hideLoading();
    void setMeals(List<Plants.Plant> plants);
    void onErrorLoading(String message);
}
