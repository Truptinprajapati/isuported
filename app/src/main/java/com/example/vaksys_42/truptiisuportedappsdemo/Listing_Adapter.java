package com.example.vaksys_42.truptiisuportedappsdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vaksys-42 on 1/7/17.
 */

public class Listing_Adapter extends RecyclerView.Adapter<Listing_Adapter.MyViewholder> {

    ArrayList<Listing_Information>arrayList;
    Context c;


    public Listing_Adapter(Context c, ArrayList<Listing_Information> arrayList)
    {
        this.c=c;
        this.arrayList=arrayList;
    }
    public static class MyViewholder extends RecyclerView.ViewHolder {

        TextView tv;
        ImageView img;

        public MyViewholder(View itemView) {
            super(itemView);
            tv= (TextView)itemView.findViewById(R.id.listing_tv);
            img=(ImageView)itemView.findViewById(R.id.listing_liimage);

        }
    }



    @Override
    public Listing_Adapter.MyViewholder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_adapter_listing,null);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {

        holder.tv.setText(arrayList.get(position).getListing_title());
        holder.img.setImageResource(arrayList.get(position).getListing_img());


    }



    @Override
    public int getItemCount() {
        return arrayList.size();
    }


}
