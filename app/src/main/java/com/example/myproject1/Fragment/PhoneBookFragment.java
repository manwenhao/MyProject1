package com.example.myproject1.Fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myproject1.R;

public class PhoneBookFragment extends Fragment {

    public PhoneBookFragment() {

    }

    public static PhoneBookFragment newInstance() {
        PhoneBookFragment fragment = new PhoneBookFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_phone_book, container, false);
    }

}
