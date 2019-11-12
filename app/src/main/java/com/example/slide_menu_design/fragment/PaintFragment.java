package com.example.slide_menu_design.fragment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.slide_menu_design.R;

import yalantis.com.sidemenu.interfaces.ScreenShotable;

/**
 * Created by delaroy on 11/2/17.
 */

public class PaintFragment extends Fragment implements ScreenShotable {

    private View containerView;
    protected ImageView mImageView;
    protected int res;
    private Bitmap bitmap;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.paint_fragment, container, false);
        return rootView;
    }


    @Override
    public void takeScreenShot() {

    }

    @Override
    public Bitmap getBitmap() {
        return null;
    }
}
