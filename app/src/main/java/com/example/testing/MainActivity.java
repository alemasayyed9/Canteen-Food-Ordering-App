package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    String login_username,login_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.editText6);
        password = (EditText)findViewById(R.id.editText7);
    }

    public  void userLogin(View view)
    {
        login_username = username.getText().toString();
        login_pass = password.getText().toString();

        String method = "login";
        Background background = new Background(this);
        background.execute(method ,login_username,login_pass);
        check();
    }



    public  void Reg(View view)
    {
        startActivity(new Intent(this,registration.class));
    }

  /* public  void userTab(View view)
    {
        startActivity(new Intent(this,add_data_database.class));
    }*/
    public  void forget(View view)
    {
        startActivity(new Intent(this,Forgetpassword.class));
    }

    public void check()
    {
        if (username.getText().toString().equals("admin") && password.getText().toString().equals(("admin@786")))
        {
            Toast.makeText(this,"Admin Login",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,add_data_database.class));
        }
        else {
            startActivity(new Intent(this,Home.class));
        }

    }

}
