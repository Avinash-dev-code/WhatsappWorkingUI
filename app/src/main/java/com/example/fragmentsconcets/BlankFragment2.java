package com.example.fragmentsconcets;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class BlankFragment2 extends Fragment {
    RecyclerView recyclerView;

    int image[]={R.drawable.download,R.drawable.linus,R.drawable.images,R.drawable.elson,R.drawable.larry,R.drawable.download,R.drawable.linus,R.drawable.images,R.drawable.elson,R.drawable.larry};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank2, container, false);

       recyclerView=(RecyclerView)view.findViewById(R.id.programminglist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        String lanaguages[]={"Sergey brin","Linus Torvalds","Sunder Pichaie","Larry Elson","Larry Page","Sergey brin","Linus Torvalds","Sunder Pichaie","Larry Elson","Larry Page"};

        recyclerView.setAdapter(new ProgrammingAdapter(lanaguages, image));

   return view;




    }
}
