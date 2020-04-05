package com.example.fragmentsconcets;

import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {
    private  String[] data;
    private int[]  profile;
    public ProgrammingAdapter(String[] data,int[] profile)
    {
            this.data=data;
            this.profile=profile;
    }


    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());

        View view=inflater.inflate(R.layout.list_view_layout,parent,false);

        return new ProgrammingViewHolder(view);
    }


    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {
        String title=data[position];
        int  image=profile[position];
        holder.imageIcon.setImageResource(profile[position]);

        holder.txtTitle.setText(title );






    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class  ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView imageIcon;
        TextView  txtTitle;

        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            imageIcon=(ImageView)itemView.findViewById(R.id.imageView1);
            txtTitle=(TextView)itemView.findViewById(R.id.txtView);
        }
    }


}
