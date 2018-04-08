package com.example.android.android_me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.data.AndroidImageAssets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Keenan on 4/6/2018.
 */

public class BodyPartsFragment extends Fragment {

    private static final String LIST_KEY = "LIST_KEY";
    private static final String INDEX_KEY = "INDEX_KEY";
    private ArrayList<Integer> mImageIds;
    private int mListIndex = 0;

    public BodyPartsFragment() {

    }

    public BodyPartsFragment setmImageIds(ArrayList<Integer> mImageIds) {
        this.mImageIds = mImageIds;
        return this;
    }

    public int getmListIndex() {
        return mListIndex;
    }

    public BodyPartsFragment setmListIndex(int mListIndex) {
        this.mListIndex = mListIndex;
        return this;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        if(savedInstanceState != null) {
            mImageIds = savedInstanceState.getIntegerArrayList(LIST_KEY);
            mListIndex = savedInstanceState.getInt(INDEX_KEY);
        }

        View view = inflater.inflate(R.layout.fragment_body_part, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.fragment_body_part);

        if (mImageIds != null) {

            imageView.setImageResource(mImageIds.get(mListIndex));
            view.setOnClickListener(v -> {
                imageView.setImageResource(mImageIds.get(++mListIndex%mImageIds.size()));
            });
        } else {
            Log.v(this.getClass().getName(), "No image!");
        }
        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putIntegerArrayList(LIST_KEY, mImageIds);
        outState.putInt(INDEX_KEY, mListIndex);
    }


}