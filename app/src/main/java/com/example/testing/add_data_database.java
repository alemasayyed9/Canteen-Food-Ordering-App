package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class add_data_database extends AppCompatActivity {
    EditText et_title, et_rs, et_img;
    String add_title, add_rs, add_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data_database);

        et_title = (EditText) findViewById(R.id.id_title);
        et_rs = (EditText) findViewById(R.id.rs);
        et_img = (EditText) findViewById(R.id.img);
    }
    public void dataAdd(View view)
    {
        add_title =et_title.getText().toString();
        add_rs =et_rs.getText().toString();
        add_img =et_img.getText().toString();

        String method = "addData";
        Background background = new Background(this);
        background.execute(method,add_title,add_rs,add_img);
        
    }


}