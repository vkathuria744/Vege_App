package com.example.vegeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    ArrayList<String> Name;
    ArrayList<String> Category;
    ArrayList<Integer> Image;
    Context context;

    public ListAdapter(Context context, ArrayList<String> Name, ArrayList<String> Category, ArrayList<Integer> Image) {
        super();
        this.context = context;
        this.Name = Name;
        this.Category = Category;
        this.Image = Image;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.nametext.setText(Name.get(i));
        viewHolder.categorytext.setText(Category.get(i));
        viewHolder.imgview.setImageResource(Image.get(i));


    }

    @Override
    public int getItemCount() {
        return Name.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgview;
        public TextView nametext;
        public TextView categorytext;


        public ViewHolder(View itemView) {
            super(itemView);
            imgview = (ImageView) itemView.findViewById(R.id.imgview);
            nametext = (TextView) itemView.findViewById(R.id.nametext);
            categorytext = (TextView) itemView.findViewById(R.id.categorytext);

        }


    }





}
