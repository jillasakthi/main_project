package com.example.mainproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.Viewholder>{

    ArrayList<AudioModal> songsList;
    Context context;

    public MusicListAdapter(ArrayList<AudioModal> songsList, Context context) {
        this.songsList = songsList;
        this.context = context;
    }

    @Override
    public Viewholder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false);
        return new MusicListAdapter.Viewholder(view);
    }

    @Override
    public void onBindViewHolder( MusicListAdapter.Viewholder holder, int position) {
        AudioModal songData = songsList.get(position);
        holder.titleTextView.setText(songData.getTitle());



    }

    @Override
    public int getItemCount() {
        return songsList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        TextView titleTextView;
        ImageView iconImageView;
        public Viewholder( View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.music_title_text);
            iconImageView = itemView.findViewById(R.id.icon_view);
        }
    }
}
