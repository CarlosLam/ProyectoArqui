package com.example.proyectoa;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DrinkHandler {

    @SerializedName("results")
    @Expose
    private ArrayList<Drink> drinksArray;

    public ArrayList<Drink> getDrinksArray() {
        return drinksArray;
    }

}
