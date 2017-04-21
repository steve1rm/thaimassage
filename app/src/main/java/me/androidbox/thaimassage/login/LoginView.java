package me.androidbox.thaimassage.login;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.androidbox.thaimassage.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginView extends Fragment {
    public static final String TAG = LoginView.class.getSimpleName();

    public LoginView() {
        // Required empty public constructor
    }

    public static LoginView newInstance() {
        return new LoginView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.login_view, container, false);
    }
}
