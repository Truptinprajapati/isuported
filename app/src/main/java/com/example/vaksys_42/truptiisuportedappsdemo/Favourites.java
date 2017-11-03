package com.example.vaksys_42.truptiisuportedappsdemo;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Favourites extends android.app.Fragment {

    RecyclerView recyclerView;
    ImageView favourite;

     String[] myfavouritestitle={"New Dack Tevarn", "Atlantic Girl", "White Dog Cafe", "Coast", "Bourbone Street Bar"};
     int[] Favourite_img={R.drawable.first, R.drawable.second, R.drawable.third, R.drawable.forth, R.drawable.fifth};


    ArrayList<Favourites_Information>arrayList;
    Favourites_Information myfavourites;
    Favorites_Adapter myfavouritesadapter;
    Context c;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_favourites, container, false);

        recyclerView=(RecyclerView)view.findViewById(R.id.myfvorit_recycle);
        favourite=(ImageView)view.findViewById(R.id.myfvrtbtn);

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        arrayList=new ArrayList<>();

        for (int i=0;i<=4;i++)
        {
            myfavourites=new Favourites_Information();
            myfavourites.setMyfavouritestitle(myfavouritestitle[i]);
            myfavourites.setfavourite_Img(Favourite_img[i]);
            arrayList.add(myfavourites);
        }
        myfavouritesadapter=new Favorites_Adapter(c,arrayList);
        recyclerView.setAdapter(myfavouritesadapter);

        return view;

    }



    @Override
    public void onResume() {
        super.onResume();

        ((MainActivity)getActivity()).setActionBarTitle("Favourites");
    }
}
