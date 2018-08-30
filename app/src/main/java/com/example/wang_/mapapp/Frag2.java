package com.example.wang_.mapapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Frag2 extends Fragment {

    ImageView country_image_f2;
    int[] myPictures = {R.drawable.china, R.drawable.india, R.drawable.usa, R.drawable.japan,
            R.drawable.china, R.drawable.india, R.drawable.usa, R.drawable.japan};
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag2, container, false);

        country_image_f2 = v.findViewById(R.id.Country_Image_F2);

        Bundle bundle = new Bundle();
        bundle = getArguments();

        int country = bundle.getInt("Country");

        country_image_f2.setImageResource(myPictures[country]);

        return v;
    }
}
