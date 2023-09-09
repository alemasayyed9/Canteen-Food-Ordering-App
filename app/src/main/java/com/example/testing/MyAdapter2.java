package com.example.testing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testing.R;

import java.util.List;

public class MyAdapter2 extends  RecyclerView.Adapter<FoodViewHolder2> {

    private Context mcontext2;
    private List<FoodData2> myFoodList2;


    public MyAdapter2(Context mcontext2, List<FoodData2> myFoodList2) {
        this.mcontext2 = mcontext2;
        this.myFoodList2 = myFoodList2;
    }


    @NonNull
    @Override
    public FoodViewHolder2 onCreateViewHolder(@NonNull ViewGroup viewGroup2, int i) {

        View mView2 =  LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.order_list_view,viewGroup2,false);

        return new FoodViewHolder2(mView2);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder2 foodViewHolder2, int i) {

        foodViewHolder2.imageView2.setImageResource(myFoodList2.get(i).getItemImage());

        foodViewHolder2.mTitle2.setText(myFoodList2.get(i).getItemName());



    }

    @Override
    public int getItemCount() {
        return myFoodList2.size();
    }
}




class FoodViewHolder2 extends RecyclerView.ViewHolder{

    ImageView imageView2;
    TextView mTitle2;
    CardView mcardView2;

    public FoodViewHolder2(View itemView2) {
        super(itemView2);

        imageView2 = itemView2.findViewById(R.id.imglist2);
        mTitle2    = itemView2.findViewById(R.id.title2);

        mcardView2 = itemView2.findViewById(R.id.listcard2);


    }
}
