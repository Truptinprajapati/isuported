package com.example.vaksys_42.truptiisuportedappsdemo;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vaksys-42 on 1/7/17.
 */

public class Feature_Adapter extends RecyclerView.Adapter<Feature_Adapter.MyViewholder> {
    ArrayList<Feature_Information>arrayList;
    Context c;
    Resources resources;




    public Feature_Adapter(Context c, ArrayList<Feature_Information> arraylist)
    {
        this.c = c;
        this.arrayList=arraylist;
    }

    public class MyViewholder extends RecyclerView.ViewHolder
    {

        TextView tv;
        ImageView img;
        RelativeLayout img2;
        RelativeLayout relativeLayout;

        public MyViewholder(View itemview) {
            super(itemview);
            tv=(TextView)itemview.findViewById(R.id.recycler_tv1);
            img=(ImageView)itemview.findViewById(R.id.images);
            img2=(RelativeLayout)itemview.findViewById(R.id.rectengle);
            relativeLayout=(RelativeLayout)itemview.findViewById(R.id.custom_feature_relativelayout);

        }
    }
    @Override
    public Feature_Adapter.MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_feature, null);
        return new MyViewholder(view);
    }


    public void onBindViewHolder(Feature_Adapter.MyViewholder holder, int position)
    {
        if(position==0)

        holder.tv.setText(arrayList.get(position).getFirsttitle());
        holder.img.setImageResource(arrayList.get(position).getImg());

        if(position==1)
            holder.relativeLayout.setBackgroundResource(R.drawable.middlebar);
        holder.tv.setText(arrayList.get(position).getFirsttitle());
        holder.img.setImageResource(arrayList.get(position).getImg());
        holder.img2.setBackgroundResource(R.drawable.rectangleleft_0);

        if(position==2)

            holder.tv.setText(arrayList.get(position).getFirsttitle());
        holder.img.setImageResource(arrayList.get(position).getImg());

        if(position==3)

            holder.relativeLayout.setBackgroundResource(R.drawable.middlebar);
        holder.tv.setText(arrayList.get(position).getFirsttitle());
        holder.img.setImageResource(arrayList.get(position).getImg());


        if(position==4)

            holder.tv.setText(arrayList.get(position).getFirsttitle());
        holder.img.setImageResource(arrayList.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


}
