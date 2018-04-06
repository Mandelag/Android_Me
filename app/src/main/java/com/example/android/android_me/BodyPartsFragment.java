package com.example.android.android_me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by Keenan on 4/6/2018.
 */

public class BodyPartsFragment extends Fragment {
     public BodyPartsFragment() {

     }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_body_part, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.fragment_body_part);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return view;
    }
}
