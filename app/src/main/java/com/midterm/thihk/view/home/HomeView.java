package com.midterm.thihk.view.home;


import com.midterm.thihk.model.Categories;
import com.midterm.thihk.model.Plants;

import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void setPlant(List<Plants.Plant> plant);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
