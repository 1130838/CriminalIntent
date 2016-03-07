package com.brunodevesa.criminalintent.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by bruno.devesa on 07/03/2016.
 */
public class CrimeLab {

    private List<Crime> mCrimesList;

    // Singleton Pattern
    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimesList = new ArrayList<>();
        generateBoringCrimes();
    }



    public List<Crime> getCrimesList() {
        return mCrimesList;
    }

    public Crime getCrime(UUID id) {
        for (int i = 0; i < mCrimesList.size(); i++) {
            if (mCrimesList.get(i).getiD().equals(id)) {
                return mCrimesList.get(i);
            }
        }
        return null;
    }

    private void generateBoringCrimes() {
        for (int i = 0; i < 100 ; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #"+i);
            crime.setIsSolved(i%2 == 0); // Every other one
            mCrimesList.add(crime);
        }
    }

}
