package com.brunodevesa.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/**
 * Created by bruno.devesa on 07/03/2016.
 */
public abstract class SingleFragmentActivity  extends FragmentActivity{

    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        //get the FragmentManager :
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();

        // get a fragment to FragmentManager deal with  it: ( the fragment is getted from its layout container - to tell where its goin)
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        // Fragment Manager dealing with the fragment like:
        // " Create a new fragment transaction, include one add operation and then commit it"
        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment) // add(<container view ID>, <fragment>)
                    .commit();
        }
    }
}
