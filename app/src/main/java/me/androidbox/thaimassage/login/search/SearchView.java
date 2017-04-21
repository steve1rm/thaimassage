package me.androidbox.thaimassage.login.search;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.androidbox.thaimassage.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchView extends Fragment {


    public SearchView() {
        // Required empty public constructor
    }

    public static SearchView newInstance() {
        return new SearchView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.search_view, container, false);
    }

}
