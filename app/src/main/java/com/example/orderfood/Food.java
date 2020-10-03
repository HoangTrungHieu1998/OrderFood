package com.example.orderfood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Food {
    private String name;
    private int image;
    private String discount;

    public Food(String name, int image, String discount) {
        this.name = name;
        this.image = image;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
    public static List<Food> getDataMock(){
        return new ArrayList<>(Arrays.asList(
            new Food("Bake",R.drawable.bake,"20%"),
            new Food("Beer",R.drawable.beer,"20%"),
            new Food("Cake",R.drawable.cake,"30%"),
            new Food("Diet",R.drawable.diet,"20%"),
            new Food("Fast Food",R.drawable.fastfood,"30%"),
            new Food("Harvest",R.drawable.harvest,"40%")
        ));
    }
}
