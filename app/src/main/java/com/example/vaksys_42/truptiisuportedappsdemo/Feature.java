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
import android.widget.LinearLayout;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Feature extends android.app.Fragment {

    RecyclerView recyclerview;
    ImageView feature;
    LinearLayout ll;



    String[] firsttitle={"Murry's", "Abbas Sad", "La Lucha", "Wella", "5th Avenue"};
    int[] img={R.drawable.favourite1, R.drawable.favourite2, R.drawable.favoutir3, R.drawable.favourite4, R.drawable.favourite5};

    ArrayList<Feature_Information>arraylist;
    Feature_Information feature_information;
    Feature_Adapter featureAdapter;
    private Context c;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_feature, container, false);

        recyclerview=(RecyclerView)view.findViewById(R.id.recycle);
        feature=(ImageView)view.findViewById(R.id.featurebtn);

        recyclerview.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        arraylist=new ArrayList<>();
        ll=(LinearLayout)view.findViewById(R.id.image_block);

        for (int i=0;i<=4;i++)
        {
            feature_information=new Feature_Information();
            feature_information.setFirsttitle(firsttitle[i]);
            feature_information.setImg(img[i]);
            arraylist.add(feature_information);
        }
        featureAdapter=new Feature_Adapter(c, arraylist);
        recyclerview.setAdapter(featureAdapter);
        return view;

    }

    @Override
    public void onResume() {
        super.onResume();

        ((MainActivity)getActivity()).setActionBarTitle("Featured");
    }
}
