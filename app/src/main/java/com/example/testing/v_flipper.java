package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class v_flipper extends AppCompatActivity {
    ViewFlipper vflipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_flipper);
        int images[] ={R.drawable.bread, R.drawable.coffe,R.drawable.omlet};

        vflipper =findViewById(R.id.v_flipper);

        for (int image: images) {

        flipperImages(image);
        }
    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        vflipper.addView(imageView);
        vflipper.setFlipInterval(1000);
        vflipper.setAutoStart(true);



        vflipper.setInAnimation(this,android.R.anim.slide_in_left);

    }
}
