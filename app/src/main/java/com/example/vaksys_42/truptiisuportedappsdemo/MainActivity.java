package com.example.vaksys_42.truptiisuportedappsdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
;


import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView img1, img2, img3, img4;
    Fragment fragment=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        View.OnClickListener listener=new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                if (v == findViewById(R.id.featurebtn))
                {
                   fragment=new Feature();
                }
                else if (v == findViewById(R.id.listingbtn))
                {
                    fragment=new Listing();
                }
                else if (v == findViewById(R.id.nearMe))
                {
                    fragment=new NearMe();

                }
                else if (v == findViewById(R.id.myfvrtbtn))
                {
                    fragment=new Favourites();
                }
                FragmentManager manager=getFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                transaction.replace(R.id._main_fragment,fragment);
                getFragmentManager().popBackStack();
                transaction.commit();

            }
        };

        img1 = (ImageView) findViewById(R.id.featurebtn);
        img1.setOnClickListener(listener);
        img2 = (ImageView) findViewById(R.id.listingbtn);
        img2.setOnClickListener(listener);
        img3 = (ImageView) findViewById(R.id.nearMe);
        img3.setOnClickListener(listener);
        img4 = (ImageView) findViewById(R.id.myfvrtbtn);
        img4.setOnClickListener(listener);




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Fragment objFragment=null;
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            // Handle the camera action
        } else if (id == R.id.myAut) {

        } else if (id == R.id.login) {

        } else if (id == R.id.signUp) {

        } else if (id == R.id.filter) {

        } else if (id == R.id.nearMe) {
            objFragment=new NearMe();

        } else if (id == R.id.favourites) {
            objFragment=new Favourites();


        } else if (id == R.id.features) {
            objFragment= new Feature();

        } else if (id == R.id.about) {
            objFragment=new Listing();

        } else if (id == R.id.merchandise) {

        } else if (id == R.id.worldCup) {

        }
        FragmentManager manager=getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id._main_fragment,objFragment);
        transaction.addToBackStack(null);
        transaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}
