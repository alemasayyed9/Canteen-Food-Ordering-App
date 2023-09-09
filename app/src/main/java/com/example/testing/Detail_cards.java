package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testing.MyAdapter2;

import java.util.ArrayList;
import java.util.List;

public class Detail_cards extends AppCompatActivity {

    TextView Title,Rs2;
    ImageView Img;




    RecyclerView mRecyclerView2;
    List<FoodData2> myFoodList2;
    FoodData2 mFoodData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cards);

        Title =(TextView) findViewById(R.id.idtitle2);
        Rs2 =(TextView) findViewById(R.id.rs2);
        Img =(ImageView) findViewById(R.id.imglist2);


        Bundle mBundle = getIntent().getExtras();

        if (mBundle!=null){

            Title.setText(mBundle.getString("Title"));
            Rs2.setText(mBundle.getString("Price"));
            Img.setImageResource(mBundle.getInt("Image"));
        }



        mRecyclerView2 = (RecyclerView)findViewById(R.id.rv2);


        LinearLayoutManager layoutManager= new LinearLayoutManager(Detail_cards.this, LinearLayoutManager.HORIZONTAL ,false);
        /*GridLayoutManager gridLayoutManager =new GridLayoutManager(MainActivity.this,1);*/

        mRecyclerView2.setLayoutManager(layoutManager);

        myFoodList2 = new ArrayList<>();

        mFoodData2 = new FoodData2("Coffe with Biscuits",R.drawable.bread);
        myFoodList2.add(mFoodData2);


        mFoodData2 = new FoodData2("Bread",R.drawable.bread);
        myFoodList2.add(mFoodData2);

        mFoodData2 = new FoodData2("Fries Tomatoes Food",R.drawable.pizzagourmet);
        myFoodList2.add(mFoodData2);

        mFoodData2= new FoodData2("Pizza Gourmet",R.drawable.pizzagourmet);
        myFoodList2.add(mFoodData2);


        mFoodData2 = new FoodData2("Bread",R.drawable.bread);
        myFoodList2.add(mFoodData2);


        mFoodData2 = new FoodData2("pizza",R.drawable.pizzagourmet);
        myFoodList2.add(mFoodData2);


        mFoodData2 = new FoodData2("Coffe",R.drawable.coffe);
        myFoodList2.add(mFoodData2);




        MyAdapter2 myAdapter2 =new MyAdapter2(Detail_cards.this,myFoodList2);

        mRecyclerView2.setAdapter(myAdapter2);



    }


}
