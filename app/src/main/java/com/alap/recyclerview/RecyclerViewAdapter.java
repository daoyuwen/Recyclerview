package com.alap.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.alap.recyclerview.databinding.ItemBinding;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    List<Song> songs;

    public RecyclerViewAdapter(List<Song> songs) {
        this.songs = songs;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding itemBinding  = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),R.layout.item,parent,false);

        return new MyViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Song song = songs.get(position);
        holder.itemBinding.setSong(song);
    }



    @Override
    public int getItemCount() {
        return songs.size();
    }

    protected static class MyViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding itemBinding;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public MyViewHolder(ItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.itemBinding =itemBinding;
        }
    }
}
