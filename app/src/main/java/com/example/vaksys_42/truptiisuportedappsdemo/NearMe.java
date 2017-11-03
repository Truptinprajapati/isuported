package com.example.vaksys_42.truptiisuportedappsdemo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class NearMe extends android.app.Fragment implements OnMapReadyCallback {

MapView mapView;
    GoogleMap map;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_near_me, container, false);

        mapView= (MapView) view.findViewById(R.id.mapview);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);


        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.icon,menu);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng sydney = new LatLng(23.062412, 72.571380);
        LatLng sydney1=new LatLng(23.067816, 72.575736);
        LatLng sydney2 = new LatLng(23.067135, 72.572099);
        LatLng sydney3=new LatLng(23.061192, 72.570221);
        LatLng sydney4= new LatLng(23.063468, 72.566273);
        LatLng sydney5=new LatLng(23.063093, 72.567979);

        map=googleMap;
        map.getUiSettings().setZoomControlsEnabled(true);
        map.addMarker(new MarkerOptions().position(sydney).title("Vakratunda System Pvt.Ltd"));
        map.addMarker(new MarkerOptions().position(sydney1).title("Ranip BRTS Bus Stand"));
        map.addMarker(new MarkerOptions().position(sydney2).title("Adani CNG Pump"));
        map.addMarker(new MarkerOptions().position(sydney3).title("Nirman High School"));
        map.addMarker(new MarkerOptions().position(sydney4).title("Naranpura Police Station"));
        map.addMarker(new MarkerOptions().position(sydney5).title("AMC Market"));

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,15));
    }

    @Override
    public void onResume() {
        super.onResume();

        ((MainActivity)getActivity()).setActionBarTitle("Distance");
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        mapView.onSaveInstanceState(outState);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }
}
