package com.example.mehul.loginregister;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bLogout;
    EditText etName, etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText)findViewById(R.id.etName);
        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);
        bLogout = (Button)findViewById(R.id.bLogout);

        bLogout.setOnClickListener(this);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.bLogout:
                break;
        }
    }


}
