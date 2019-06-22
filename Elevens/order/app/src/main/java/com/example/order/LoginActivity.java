package com.example.order;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    private FirebaseUser currentUser;
    private Button LoginButton, PhoneLoginButton;
    private EditText UserEmaill, UserPassword;
    private TextView NeedNewAccountLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        InitializeFields(); // initializing the components

        NeedNewAccountLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendUserToRegisterActivity();
            }
        });

    }

    private void InitializeFields() {
        LoginButton = (Button) findViewById(R.id.login_button);
        PhoneLoginButton = (Button) findViewById(R.id.phone_login_button);
        UserEmaill = (EditText)findViewById(R.id.login_email);
        UserPassword = (EditText)findViewById(R.id.login_password);
        NeedNewAccountLink = (TextView)findViewById(R.id.need_account_link);
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (currentUser != null) { // this means the user is Authenticated so we will send him to MainActivity
            SendUserToMainActivity();
        }
    }

    private void SendUserToMainActivity() {
        Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(loginIntent);
    }
    private void SendUserToRegisterActivity() {
        Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(registerIntent);
    }

}