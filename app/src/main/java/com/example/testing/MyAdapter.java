package com.example.testing;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyAdapter extends  RecyclerView.Adapter<FoodViewHolder> {

    private Context mcontext;
    private List<FoodData> myFoodList;

    //Constructor
    public MyAdapter(Context mcontext, List<FoodData> myFoodList) {
        this.mcontext = mcontext;
        this.myFoodList = myFoodList;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View mView =  LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_view,viewGroup,false);

        return new FoodViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(FoodViewHolder foodViewHolder, int i) {
        FoodData info = myFoodList.get(i);

        foodViewHolder.mTitle.setText(info.getItemName());

        foodViewHolder.mPrice.setText(info.getItemPrice());

        Glide.with(mcontext)
                .load(info.getItemImage())
                .into(foodViewHolder.imageView);

        foodViewHolder.mcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            /*    Intent intent= new Intent(mcontext, Detail_cards.class);
                intent.putExtra("Image",myFoodList.get(foodViewHolder.getAdapterPosition()).getItemImage());
                intent.putExtra("Title",myFoodList.get(foodViewHolder.getAdapterPosition()).getItemName());
                intent.putExtra("Price",myFoodList.get(foodViewHolder.getAdapterPosition()).getItemPrice());

                mcontext.startActivity(intent);
*/

               /* foodViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(mcontext,"OnClick called on Position" + i,Toast.LENGTH_SHORT).show();
                        addItem(currentposition,infodata);
                    }
                });
                foodViewHolder.imageView.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        Toast.makeText(mcontext,"OnLongClick called on Position" + i,Toast.LENGTH_SHORT).show();
                        removeitem(infodata);

                        return true;
                    }
                });
*/
            }
        });

    }/*
    private void removeitem(FoodData infodata) {
        int currposition =myFoodList.indexOf(infodata);
        myFoodList.remove(currposition);
        notifyItemRemoved(currposition);
    }

    private void addItem(int i, FoodData infodata) {
        myFoodList.add(i,infodata);
        notifyItemInserted(i);
    }*/



    @Override
    public int getItemCount() {
        return myFoodList.size();
    }
}

class FoodViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView mTitle,mPrice;
    CardView mcardView;

    public FoodViewHolder(View itemView) {
        super(itemView);

        mTitle    = itemView.findViewById(R.id.idtitle);
        mPrice    = itemView.findViewById(R.id.Rs);
        imageView = itemView.findViewById(R.id.imglist);

        mcardView = itemView.findViewById(R.id.listcard);
    }
}
