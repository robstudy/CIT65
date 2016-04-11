package com.bignerdranch.android.fccriminalintent.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.bignerdranch.android.fccriminalintent.Crime;

import java.util.Date;
import java.util.UUID;

import static com.bignerdranch.android.fccriminalintent.database.CrimeDbSchema.*;

/**
 * Created by robertgarza1 on 4/4/16.
 */
public class CrimeCursorWrapper extends CursorWrapper {
    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeTable.Cols.TITLE));
        long date = getLong(getColumnIndex(CrimeTable.Cols.DATE));
        int isSolved = getInt(getColumnIndex(CrimeTable.Cols.SOLVED));
        int severityOfCrime = getInt(getColumnIndex(CrimeTable.Cols.LEVELOFCRIME));
        int time = getInt(getColumnIndex(CrimeTable.Cols.TIME));
        String suspect = getString(getColumnIndex(CrimeTable.Cols.SUSPECT));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setSolved(isSolved != 0);
        crime.setLevelOfCrime(severityOfCrime);
        crime.setTime(new Date(time));
        crime.setSuspect(suspect);

        return crime;
    }
}
