package com.example.wang_.mapapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PassName{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Frag1 f1 = new Frag1();

        getSupportFragmentManager().beginTransaction().add(R.id.MainLayout, f1).commit();

    }


    @Override
    public void sendName(int pos) {

        Frag2 f2 = new Frag2();

        Bundle bundle = new Bundle();
        bundle.putInt("Country", pos);

        f2.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().add(R.id.MainLayout, f2, "Hi").commit();
        //Toast.makeText(this, nm, Toast.LENGTH_SHORT).show();
    }
}
