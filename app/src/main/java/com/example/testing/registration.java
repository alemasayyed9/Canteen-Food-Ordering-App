package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class registration extends AppCompatActivity {
    EditText username,password,email,mobileno;
    String  reg_username,reg_pass,reg_email,reg_mobileno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        /*fullname = (EditText)findViewById(R.id.et1);*/
        username = (EditText) findViewById(R.id.et2);
        password = (EditText) findViewById(R.id.et3);
        email = (EditText) findViewById(R.id.et4);
        mobileno = (EditText) findViewById(R.id.et5);

  /*  username.setOnFocusChangeListener(new View.OnFocusChangeListener() {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            if(username.getText().length()<5 ){
                username.setError("error");
            }
        }
    });*/}
/*

        public void validatePassword (String password){
            Pattern upperCase = Pattern.compile("[A-Z]");
            Pattern lowerCase = Pattern.compile("[a-z]");
            Pattern digitCase = Pattern.compile("[0-9]");
*/


    public void userReg(View view)
    {
        reg_username = username.getText().toString();
        reg_pass = password.getText().toString();
        reg_email = email.getText().toString();
        reg_mobileno = mobileno.getText().toString();

        String method = "register";
        Background background = new Background(this);
        background.execute(method,reg_username,reg_pass,reg_email,reg_mobileno);
        finish();
    }

}


