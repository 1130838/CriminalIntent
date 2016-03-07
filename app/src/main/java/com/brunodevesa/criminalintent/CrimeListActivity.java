package com.brunodevesa.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by bruno.devesa on 07/03/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
