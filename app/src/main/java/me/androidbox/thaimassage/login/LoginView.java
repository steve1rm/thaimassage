package me.androidbox.thaimassage.login;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import me.androidbox.thaimassage.R;
import me.androidbox.thaimassage.login.search.SearchActivity;
import timber.log.Timber;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginView extends Fragment {
    public static final String TAG = LoginView.class.getSimpleName();

    private GoogleApiClient mGoogleApiClient;
    private static final int RC_SIGN_IN = 007;
    private Unbinder mUnbinder;

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
        final View view = inflater.inflate(R.layout.login_view, container, false);

        mUnbinder = ButterKnife.bind(LoginView.this, view);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        mGoogleApiClient = new GoogleApiClient.Builder(getActivity())
                .enableAutoManage(getActivity(), new GoogleApiClient.OnConnectionFailedListener() {
                    @Override
                    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
                        Timber.e("onConnectionFailed %s", connectionResult.getErrorMessage());
                    }
                })
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();

        return view;
    }

    @SuppressWarnings("unused")
    @OnClick(R.id.sign_in_button)
    public void sign_in() {
/*
        final Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        startActivityForResult(signInIntent, RC_SIGN_IN);
*/

        startActivity(new Intent(getActivity(), SearchActivity.class));
    }
}
