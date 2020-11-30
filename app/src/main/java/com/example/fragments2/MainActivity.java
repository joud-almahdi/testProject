package com.example.fragments2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeFragments(View view)
    {
        Fragment f =  f = new Fragment1();;
        if (view==findViewById(R.id.button1)){
            f = new Fragment1();
            FragmentManager fm= getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fr,f);
            ft.commit();
        }


        if (view==findViewById(R.id.button2))
            f = new Fragment2();
        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fr,f);
        ft.commit();
    }
}