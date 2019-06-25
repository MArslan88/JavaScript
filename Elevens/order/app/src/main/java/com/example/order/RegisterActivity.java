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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    private Button CreateAccountButton;
    private EditText UserEmaill, UserPassword;
    private TextView AlreadyHaveAccountLink;

    private FirebaseAuth mAuth;
    private DatabaseReference RootRef;
    private ProgressDialog loadingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance(); // that was creating a problem so i added this com.google.gms:google-services:4.2.0 in the gradle project
        RootRef= FirebaseDatabase.getInstance().getReference();

        InitializeFields(); // initializing the components

        AlreadyHaveAccountLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendUserToLoginActivity();
            }
        });

        CreateAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CreateNewAccount();
            }
        });
    }

    private void CreateNewAccount() {
        String email = UserEmaill.getText().toString();
        String password = UserPassword.getText().toString();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please Enter Email...", Toast.LENGTH_SHORT).show();
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please Enter Password...", Toast.LENGTH_SHORT).show();
        }
        else{ // if both field are not empty then
            // for LoadingBar during the account creation
            loadingBar.setTitle("Creating New Account");
            loadingBar.setMessage("Please wait, while we are creating new account for you...");

            // if user will touch the screen then loadingBar will not disappear until the account has been created
            loadingBar.setCanceledOnTouchOutside(true);
            loadingBar.show(); // this will show the loading bar on the screen

            //create an account for the user
            mAuth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                // to get the user id from the Firebase
                                String currentUserID = mAuth.getCurrentUser().getUid();
                                RootRef.child("Users").child(currentUserID).setValue("");

                                SendUserToMainActivity(); // when account is created successfully then send the user to MainActivity to login
                                Toast.makeText(RegisterActivity.this, "Account Created Successfully...", Toast.LENGTH_SHORT).show();
                                loadingBar.dismiss(); // when account is created then dismiss the loadingBar
                            }else{ // if any error occur
                                String message = task.getException().toString(); // it will the error from the Exception
                                // and that error into Toast message
                                Toast.makeText(RegisterActivity.this, "Error: "+message, Toast.LENGTH_SHORT).show();
                                loadingBar.dismiss(); // if any Error occur then dismiss the loadingBar also

                            }
                        }
                    });
        }
    }

    private void InitializeFields() {
        CreateAccountButton = (Button)findViewById(R.id.register_button);
        UserEmaill = (EditText)findViewById(R.id.register_email);
        UserPassword = (EditText)findViewById(R.id.register_password);
        AlreadyHaveAccountLink = (TextView)findViewById(R.id.already_have_account_link);

        loadingBar = new ProgressDialog(this);
    }

    private void SendUserToLoginActivity() {
        Intent loginIntent = new Intent(RegisterActivity.this,LoginActivity.class);

        // this will stop the user to get again the LoginActivity when user press the back button
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginIntent);
        finish(); // part of addFlags line
    }
    private void SendUserToMainActivity() {
        Intent mainIntent = new Intent(RegisterActivity.this, MainActivity.class);

        // this will stop the user to get again the RegisterActivity when user press the back button
        mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(mainIntent);
        finish(); // part of addFlags line
    }
}
