package me.androidbox.thaimassage.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.androidbox.thaimassage.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if(savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.login_container, LoginView.newInstance(), LoginView.TAG)
                    .commit();
        }
    }
}
