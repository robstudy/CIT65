package com.bignerdranch.android.fccriminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Robert on 2/24/2016.
 */
public class CrimeListActivity extends SingleFrameActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
