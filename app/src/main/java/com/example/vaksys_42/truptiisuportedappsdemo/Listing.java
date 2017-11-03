package com.example.vaksys_42.truptiisuportedappsdemo;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;



public class Listing extends android.app.Fragment implements View.OnClickListener {

RecyclerView recyclerView;
    ImageView listing;

    ViewPager viewPager;
    CustomPageAdapter mCustomPagerAdapter;


    String[] listing_title={


            "Air Conditioning",
            "Alcohole",
            "Disabled Access",
            "Fax",
            "Flight Moniter",
            "Internet",
            "News Paper / Mazagine",
            "Soft Drinks",
            "TelePhone",
            "Television",
            "WiFi"

    };
    int[] listing_img={
            R.drawable.list1,
            R.drawable.alcohol,
            R.drawable.disable,
            R.drawable.li9,
            R.drawable.list4,
            R.drawable.list5,
            R.drawable.news,
            R.drawable.list3,
            R.drawable.list7,
            R.drawable.list8,
            R.drawable.wifiiiiii
    };

    Listing_Adapter listingAdapter;
    ArrayList<Listing_Information> arrayList;
    Listing_Information listingsetget;
    Context c;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_listing, container, false);

        ImageView fbimage=(ImageView)view.findViewById(R.id.listing_img2);
        fbimage.setOnClickListener(this);

        viewPager=(ViewPager)view.findViewById(R.id.view_pager);
        mCustomPagerAdapter = new CustomPageAdapter(getActivity());
        viewPager.setAdapter(mCustomPagerAdapter);

        recyclerView = (RecyclerView) view.findViewById(R.id.list_recycler);
        listing = (ImageView) view.findViewById(R.id.listingbtn);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        arrayList = new ArrayList<>();

        for (int i = 0; i < listing_title.length; i++) {
            listingsetget = new Listing_Information();
            listingsetget.setListing_title(listing_title[i]);
            listingsetget.setListing_img(listing_img[i]);
            arrayList.add(listingsetget);
        }

        listingAdapter=new Listing_Adapter(c,arrayList);
        recyclerView.setAdapter(listingAdapter);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        ((MainActivity) getActivity()).setActionBarTitle("Merchant Name");
    }

    @Override
    public void onClick(View v) {
        String uri = "https://www.facebook.com/";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }
}
