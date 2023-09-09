package com.example.testing;

public class FoodData {

    private String ItemName;
    private String ItemPrice;
    private String ItemImage;

    public FoodData(String itemName, String itemPrice, String itemImage) {
        ItemName = itemName;
        ItemPrice = itemPrice;
        ItemImage = itemImage;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getItemPrice() {
        return ItemPrice;
    }

    public String getItemImage() {
        return ItemImage;
    }
}
