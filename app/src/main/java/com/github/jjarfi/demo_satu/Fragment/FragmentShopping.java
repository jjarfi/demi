package com.github.jjarfi.demo_satu.Fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.github.jjarfi.demo_satu.R;

public class FragmentShopping extends Fragment {
    View v;
    Toolbar toolbar;
    TextView tv;
    Typeface face;

    public FragmentShopping(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_shopping, container, false);
        return v;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        toolbar = view.findViewById(R.id.toolbar);
        tv = view.findViewById(R.id.tvTitle);
        face = Typeface.createFromAsset(getActivity().getAssets(),"Matiz.ttf");
        tv.setTypeface(face);
    }
}
