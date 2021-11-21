package com.tw.product;

public class Product {
    private int itemId;
    private String itemName;
    private double price;
    private int qty;

    public Product(int itemId, String itemName, double price, int qty) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.qty = qty;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
