package com.example.vaksys_42.truptiisuportedappsdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vaksys-42 on 3/7/17.
 */

class Favorites_Adapter extends RecyclerView.Adapter<Favorites_Adapter.MyViewHolder> {

    ArrayList<Favourites_Information>arrayList;
    Context c;


    public Favorites_Adapter(Context c, ArrayList<Favourites_Information> arrayList) {
        this.c=c;
        this.arrayList=arrayList;
    }



    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv;
        ImageView img;
        RelativeLayout relativeLayout;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv=(TextView)itemView.findViewById(R.id.feature_tv1);
            img=(ImageView) itemView.findViewById(R.id.images);
            relativeLayout=(RelativeLayout)itemView.findViewById(R.id.custom_favourite_relativelayout);

        }
    }

    @Override
    public Favorites_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_favourites,null);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        if(position==0)

            holder.tv.setText(arrayList.get(position).getMyfvorittitle());
        holder.img.setImageResource(arrayList.get(position).getFvorit_Img());

        if(position==1)
            holder.relativeLayout.setBackgroundResource(R.drawable.middlebar);
        holder.tv.setText(arrayList.get(position).getMyfvorittitle());
        holder.img.setImageResource(arrayList.get(position).getFvorit_Img());
//        holder.img2.setBackgroundResource(R.drawable.rectangleleft_0);

        if(position==2)

            holder.tv.setText(arrayList.get(position).getMyfvorittitle());
        holder.img.setImageResource(arrayList.get(position).getFvorit_Img());

        if(position==3)

            holder.relativeLayout.setBackgroundResource(R.drawable.middlebar);
        holder.tv.setText(arrayList.get(position).getMyfvorittitle());
        holder.img.setImageResource(arrayList.get(position).getFvorit_Img());


        if(position==4)

            holder.tv.setText(arrayList.get(position).getMyfvorittitle());
        holder.img.setImageResource(arrayList.get(position).getFvorit_Img());

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }


}
