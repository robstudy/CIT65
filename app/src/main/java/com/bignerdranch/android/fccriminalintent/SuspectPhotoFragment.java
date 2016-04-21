package com.bignerdranch.android.fccriminalintent;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by robertgarza1 on 4/20/16.
 */
public class SuspectPhotoFragment extends DialogFragment{

    private static final String SUSPECT_PHOTO_ARG = "suspect_photo_image";

    public static SuspectPhotoFragment newInstance(File photoFile) {
        Bundle args = new Bundle();
        args.putSerializable(SUSPECT_PHOTO_ARG, photoFile);

        SuspectPhotoFragment fragment = new SuspectPhotoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        super.onCreateDialog(savedInstanceState);

        File photoFile = (File) getArguments().getSerializable(SUSPECT_PHOTO_ARG);

        Bitmap image = PictureUtils.getScaledBitmap(photoFile.getPath(), getActivity());

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.suspect_photo, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.suspect_photo);
        imageView.setImageBitmap(image);

        return new AlertDialog.Builder(getActivity()).setView(imageView).create();
    }
}
