package com.example.mehul.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {

    Button bRegister;
    EditText etName, etUsername, etAge, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etName = (EditText)findViewById(R.id.etName);
        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);
        etAge = (EditText)findViewById(R.id.etAge);
        bRegister = (Button)findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.bRegister:
                Intent intent = new Intent(this, Login.class);
                startActivity(intent);
                break;
        }


    }



}
