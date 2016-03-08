package com.bignerdranch.android.fccriminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Robert on 2/10/2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private int levelOfCrime = 0;


    public Crime() {
        //Generate Unique Identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public int getLevelOfCrime() {
        return levelOfCrime;
    }

    public void setLevelOfCrime(int levelOfCrime) {
        this.levelOfCrime = levelOfCrime;
    }
}
