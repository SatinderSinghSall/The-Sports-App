// This class 'public class CustomAdapter' is an Adapter class.

package com.example.thesportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// The class 'CustomAdapter' is a bridge between your Data (List<Sport>) and the RecyclerView + CardView.
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportsViewHolder>
{
    private List<Sport> sportList;

    public CustomAdapter(List<Sport> sportList)
    {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_itam_layout, parent, false);

        return new SportsViewHolder(itemView);
    }

    /*
      The method 'onBindViewHolder' called for each item in the list and it
      is responsible for binding the data from the 'Sport' object to the views
      within the 'SportsViewHolder' method.
    */
    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position)
    {
        Sport sport = sportList.get(position);
        holder.textView.setText(sport.SportName);
        holder.imageView.setImageResource(sport.SportImage);
    }

    @Override
    public int getItemCount()
    {
        return sportList.size();
    }

    // The below class holds the references to the views within the item layout.
    public static class SportsViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        ImageView imageView;

        public SportsViewHolder(@NonNull View itemView)
        {
            super(itemView);
            textView = itemView.findViewById(R.id.textView_id_card_item_layout);
            imageView = itemView.findViewById(R.id.imageView_id_card_item_layout);
        }
    }
}
