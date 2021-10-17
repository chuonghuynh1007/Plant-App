package com.midterm.thihk.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Plants {
    @SerializedName("meals")
    @Expose
    private List<Plant> plants = null;
    public List<Plant> getPlants() {
        return plants;
    }
    public void setMeals(List<Plant> plants) {
        this.plants=plants;
    }

    public class Plant {
        @SerializedName("idPlant")
        @Expose
        private String idPlant;
        @SerializedName("strPlant")
        @Expose
        private String strPlant;
        @SerializedName("strCategory")
        @Expose
        private String strCategory;
        @SerializedName("strArea")
        @Expose
        private String strArea;
        @SerializedName("strInstructions")
        @Expose
        private String strInstructions;
        @SerializedName("strPlantThumb")
        @Expose
        private String strPlantThumb;
        @SerializedName("strTags")
        @Expose
        private String strTags;
        @SerializedName("strStepCare1")
        @Expose
        private String strStepCare1;
        @SerializedName("strStepCare2")
        @Expose
        private String strStepCare2;
        @SerializedName("strStepCare3")
        @Expose
        private String strStepCare3;
        @SerializedName("strStepCare4")
        @Expose
        private String strStepCare4;
        @SerializedName("strStepCare5")
        @Expose
        private String strStepCare5;
        @SerializedName("strStepCare6")
        @Expose
        private String strStepCare6;
        @SerializedName("strStepCare7")
        @Expose
        private String strStepCare7;
        @SerializedName("strStepCare8")
        @Expose
        private String strStepCare8;
        @SerializedName("strStepCare9")
        @Expose
        private String strStepCare9;
        @SerializedName("strStepCare10")
        @Expose
        private String strStepCare10;

        public String getIdPlant() {
            return idPlant;
        }

        public void setIdPlant(String idPlant) {
            this.idPlant = idPlant;
        }

        public String getStrPlant() {
            return strPlant;
        }

        public void setStrPlant(String strPlant) {
            this.strPlant = strPlant;
        }

        public String getStrCategory() {
            return strCategory;
        }

        public void setStrCategory(String strCategory) {
            this.strCategory = strCategory;
        }

        public String getStrArea() {
            return strArea;
        }

        public void setStrArea(String strArea) {
            this.strArea = strArea;
        }

        public String getStrInstructions() {
            return strInstructions;
        }

        public void setStrInstructions(String strInstructions) {
            this.strInstructions = strInstructions;
        }

        public String getStrPlantThumb() {
            return strPlantThumb;
        }

        public void setStrPlantThumb(String strPlantThumb) {
            this.strPlantThumb = strPlantThumb;
        }

        public String getStrTags() {
            return strTags;
        }

        public void setStrTags(String strTags) {
            this.strTags = strTags;
        }

        public String getStrStepCare1() {
            return strStepCare1;
        }

        public void setStrStepCare1(String strStepCare1) {
            this.strStepCare1 = strStepCare1;
        }

        public String getStrStepCare2() {
            return strStepCare2;
        }

        public void setStrStepCare2(String strStepCare2) {
            this.strStepCare2 = strStepCare2;
        }

        public String getStrStepCare3() {
            return strStepCare3;
        }

        public void setStrStepCare3(String strStepCare3) {
            this.strStepCare3 = strStepCare3;
        }

        public String getStrStepCare4() {
            return strStepCare4;
        }

        public void setStrStepCare4(String strStepCare4) {
            this.strStepCare4 = strStepCare4;
        }

        public String getStrStepCare5() {
            return strStepCare5;
        }

        public void setStrStepCare5(String strStepCare5) {
            this.strStepCare5 = strStepCare5;
        }

        public String getStrStepCare6() {
            return strStepCare6;
        }

        public void setStrStepCare6(String strStepCare6) {
            this.strStepCare6 = strStepCare6;
        }

        public String getStrStepCare7() {
            return strStepCare7;
        }

        public void setStrStepCare7(String strStepCare7) {
            this.strStepCare7 = strStepCare7;
        }

        public String getStrStepCare8() {
            return strStepCare8;
        }

        public void setStrStepCare8(String strStepCare8) {
            this.strStepCare8 = strStepCare8;
        }

        public String getStrStepCare9() {
            return strStepCare9;
        }

        public void setStrStepCare9(String strStepCare9) {
            this.strStepCare9 = strStepCare9;
        }

        public String getStrStepCare10() {
            return strStepCare10;
        }

        public void setStrStepCare10(String strStepCare10) {
            this.strStepCare10 = strStepCare10;
        }
    }
}
