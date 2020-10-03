package com.example.orderfood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{

    List<Food> mArrayFood;

    public FoodAdapter(List<Food> mArrayFood) {
        this.mArrayFood = mArrayFood;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_food, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Food food = mArrayFood.get(position);
        holder.imgFood.setImageResource(food.getImage());
        holder.tvDetail.setText(food.getName());
        holder.tvDiscount.setText(food.getDiscount());
    }

    @Override
    public int getItemCount() {
        return mArrayFood == null ? 0 : mArrayFood.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgFood;
        TextView tvDetail,tvDiscount;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.food);
            tvDetail = itemView.findViewById(R.id.name);
            tvDiscount = itemView.findViewById(R.id.discount);

        }
    }
}
