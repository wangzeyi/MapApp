package com.example.wang_.mapapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{


    int myImages[];
    String myCountry[];
    Context ctx;

    LayoutInflater layoutinflator;

    public MyAdapter(int[] myImages, String[] myCountry, Context ctx) {
        this.myImages = myImages;
        this.myCountry = myCountry;
        this.ctx = ctx;

        layoutinflator =  (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return myCountry.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = layoutinflator.inflate(R.layout.item_layout, null);

        TextView country_tv = v.findViewById(R.id.Country_Tv);
        ImageView country_image = v.findViewById(R.id.Country_Image);

        country_tv.setText(myCountry[position]);
        country_image.setImageResource(myImages[position]);


        return v;
    }
}
