package com.magicmob.javawy.expertsystem;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText username , password;
    Button Login,Signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        Login = (Button)findViewById(R.id.btnLogIn);
        Signup = (Button)findViewById(R.id.btnSignUp);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckValidate();
            }
        });

      /*  Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        */
    }

    public  void CheckValidate()
    {
        final String user = username.getText().toString();
        final String pass = password.getText().toString();

        if(isValidPassword(pass) && isValidUsername(user))
        {
            Intent intent = new Intent(LoginActivity.this,SplashActivity.class);
            startActivity(intent);
        }
        else
        {
            if(! isValidUsername(user) && isValidPassword(pass))
            {
                username.setError("Invalid Username");
            }
            else if(isValidUsername(user) && !isValidPassword(pass))
            {
                password.setError("Invalid Password");
            }
            else
            {
                username.setError("Invalid Username");
                password.setError("Invalid Password");
            }
        }
    }
    private boolean isValidUsername(String username) {
        if (username != null && username.equals("ali")) {
            return true;
        }
        return false;
    }

    private boolean isValidPassword(String pass) {
        if (pass != null && pass.equals("123")) {
            return true;
        }
        return false;
    }

}
