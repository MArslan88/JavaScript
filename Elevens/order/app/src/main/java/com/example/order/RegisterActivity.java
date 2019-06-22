package com.example.order;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    private Button CreateAccountButton;
    private EditText UserEmaill, UserPassword;
    private TextView AlreadyHaveAccountLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        InitializeFields(); // initializing the components

        AlreadyHaveAccountLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendUserToLoginActivity();
            }
        });
    }




    private void InitializeFields() {
        CreateAccountButton = (Button)findViewById(R.id.register_button);
        UserEmaill = (EditText)findViewById(R.id.register_email);
        UserPassword = (EditText)findViewById(R.id.register_password);
        AlreadyHaveAccountLink = (TextView)findViewById(R.id.already_have_account_link);

    }

    private void SendUserToLoginActivity() {
        Intent loginIntent = new Intent(RegisterActivity.this,LoginActivity.class);
        startActivity(loginIntent);
    }
}
