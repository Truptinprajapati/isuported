package com.example.vaksys_42.truptiisuportedappsdemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by vaksys-42 on 1/7/17.
 */

class CustomPageAdapter extends PagerAdapter {

        Context mcontext;
    LayoutInflater inflater;
    int[] mResources={
        R.drawable.viewpager1,
                R.drawable.viewpager2,
                R.drawable.third,
                R.drawable.fifth,
    };

    public CustomPageAdapter(Context context)
    {
        mcontext=context;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount()
    {
            return mResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View itemview=inflater.inflate(R.layout.pager,container,false);
        ImageView imageview=(ImageView)itemview.findViewById(R.id.imageView);
        imageview.setImageResource(mResources[position]);
        container.addView(itemview);

        return itemview;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
