package com.example.testing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Frag1 extends Fragment {
    private static final String PRODUCT_URL ="http://192.168.1.111/CMS/api.php";
    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag1_layout, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.rv);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        loadProducts();

        MyAdapter myAdapter = new MyAdapter(getActivity(), myFoodList);
        mRecyclerView.setAdapter(myAdapter);

        return v;




/*
        mFoodData = new FoodData("One Dish Chicken & Rice Bake", "Rs.20", R.drawable.coffe);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Bread", "Rs.30", R.drawable.bread);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Fries Tomatoes Food", "Rs.50", R.drawable.friestomatoesfood);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Pizza Gourmet", "Rs.100", R.drawable.pizzagourmet);
        myFoodList.add(mFoodData);


        mFoodData = new FoodData("Bread", "Rs.30", R.drawable.bread);
        myFoodList.add(mFoodData);


        mFoodData = new FoodData("pizza", "Rs.100", R.drawable.pizzagourmet);
        myFoodList.add(mFoodData);


        mFoodData = new FoodData("Coffe", "Rs.20", R.drawable.coffe);
        myFoodList.add(mFoodData);
*/

    }

    private void loadProducts() {
        StringRequest stringRequest =new StringRequest(Request.Method.GET, PRODUCT_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONArray ProductDetails =new JSONArray(response);

                            for (int i=0; i<ProductDetails.length();i++){
                                JSONObject productObject = ProductDetails.getJSONObject(i);

                                String add_title =  productObject.getString("add_title");
                                String add_rs =  productObject.getString("add_rs");
                                String add_img =  productObject.getString("add_img");

                                FoodData food = new FoodData(add_title, add_rs,add_img);
                                myFoodList.add(food);
                            }

                            MyAdapter myAdapter = new MyAdapter(getActivity(), myFoodList);
                            mRecyclerView.setAdapter(myAdapter);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(), error.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
        Volley.newRequestQueue(getActivity()).add(stringRequest);
    }
}
