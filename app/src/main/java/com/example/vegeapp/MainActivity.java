package com.example.vegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;
    ArrayList<String> Name;
    ArrayList<String> Category;
    ArrayList<Integer> Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = new ArrayList<>(Arrays.asList("Carrot", "Cucumber", "Ladyfinger", "Lemon", "Onion", "Potato", "Spinach", "Tomato"));
        Category = new ArrayList<>(Arrays.asList("Vegetables", "Vegetables", "Vegetables", "Vegetables", "Vegetables", "Vegetables", "Vegetables", "Vegetables"));
        Image = new ArrayList<>(Arrays.asList(R.drawable.carrot, R.drawable.cucumber, R.drawable.ladyfinger, R.drawable.lemon, R.drawable.onion, R.drawable.potato, R.drawable.spinach, R.drawable.tomato));


        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);

        mRecyclerView.setLayoutManager(horizontalLayoutManager);

        mAdapter = new ListAdapter(MainActivity.this, Name, Category, Image);
        mRecyclerView.setAdapter(mAdapter);
    }
    //@Override
    //public void onItemClick(View view, int position) {
       // Toast.makeText(this, "You clicked " + mAdapter.getItemCount() + " on item position" + position, Toast.LENGTH_SHORT).show();
    //}
}