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

import java.util.List;

/**
 * Created by Keenan on 4/6/2018.
 */

public class BodyPartsFragment extends Fragment {

    private List<Integer> mImageIds;
    private int mListIndex = 0;

    public BodyPartsFragment() {

    }

    public BodyPartsFragment setmImageIds(List<Integer> mImageIds) {
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
        View view = inflater.inflate(R.layout.fragment_body_part, container, false);
        if (mImageIds != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.fragment_body_part);
            imageView.setImageResource(mImageIds.get(mListIndex));
        } else {
            Log.v(this.getClass().getName(), "No image!");
        }
        return view;
    }
}
