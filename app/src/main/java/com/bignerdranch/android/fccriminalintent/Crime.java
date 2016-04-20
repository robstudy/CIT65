package com.bignerdranch.android.fccriminalintent;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Robert on 2/10/2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle = "";
    private Date mDate;
    private Date mTime;
    private boolean mSolved;
    private int levelOfCrime = 0;
    private String mSuspect;

    DateFormat df = DateFormat.getDateInstance();
    DateFormat tf = DateFormat.getTimeInstance();

    public Crime(){
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        //Generate Unique Identifier
        mId = id;
        mDate = new Date();
        mTime = new Date();
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

    public String getDateString() {
        return df.format(mDate);
    }

    public Date getTime() {
        return mTime;
    }

    public void setTime(Date mTime) {
        this.mTime = mTime;
    }

    public String getTimeString() {
        return tf.format(mTime);
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String mSuspect) {
        this.mSuspect = mSuspect;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }
}
