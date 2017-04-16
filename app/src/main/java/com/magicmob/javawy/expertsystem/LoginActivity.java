package com.magicmob.javawy.expertsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
<<<<<<< HEAD
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button login;
=======
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText mUser;
    private EditText mPass;

>>>>>>> origin/master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
<<<<<<< HEAD

        login=(Button) findViewById(R.id.button2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,HomeActivity.class));
            }
        });
=======
        setupViews();
        mUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,SignupActivity.class));
            }
        });
    }

    private void setupViews() {
         mUser = (EditText) findViewById(R.id.username);
        mPass = (EditText) findViewById(R.id.password);
>>>>>>> origin/master
    }

}
