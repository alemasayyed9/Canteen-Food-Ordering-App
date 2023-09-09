package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

        public  void breakfast(View view)
        {
            startActivity(new Intent(this,Tablayout.class));
        }
        public  void lunch(View view)
        {
            startActivity(new Intent(this,Tablayout.class));
        }
    public  void chinese(View view)
    {
        startActivity(new Intent(this,Tablayout.class));
    }

    public  void snacks(View view)
    {
        startActivity(new Intent(this,Tablayout.class));
    }

}