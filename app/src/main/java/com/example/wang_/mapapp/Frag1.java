package com.example.wang_.mapapp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Frag1 extends Fragment {


    ListView map_list;
    String[] myCountries = {"China", "India", "USA", "Japan","China", "India", "USA", "Japan"};

    int[] myPictures = {R.drawable.china, R.drawable.india, R.drawable.usa, R.drawable.japan,
            R.drawable.china, R.drawable.india, R.drawable.usa, R.drawable.japan};

    PassName pn;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        pn = (PassName) getActivity();

    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag1, container, false);

        map_list = v.findViewById(R.id.Map_List);

        MyAdapter ma = new MyAdapter(myPictures, myCountries, getActivity());

        map_list.setAdapter(ma);


        map_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Log.d("MyTag", Integer.toString(position));

               //Toast.makeText(getContext(), Integer.toString(position), Toast.LENGTH_SHORT).show();
               pn.sendName(position);
            }
        });

        return v;
    }


}
