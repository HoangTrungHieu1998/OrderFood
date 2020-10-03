package com.example.orderfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcv;
    FoodAdapter mFoodAdapter;
    List<Food> mArrayFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ
        mRcv =  findViewById(R.id.recyclerView);
        mArrayFood = Food.getDataMock();
        mFoodAdapter = new FoodAdapter(mArrayFood);
        mRcv.setAdapter(mFoodAdapter);

    }
}