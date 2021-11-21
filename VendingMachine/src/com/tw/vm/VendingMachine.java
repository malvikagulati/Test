package com.tw.vm;

import com.tw.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private String name;
    private double totalAmount;
    private List<Product> products = new ArrayList<>();

    public VendingMachine(String name) {
        this.name = name;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        System.out.println(name + " has following Products:");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println("Item Id: " + product.getItemId() + " Name:" + product.getItemName() + " Price:" + product.getPrice());
        }
    }

    public void sellProduct(int itemId, double amount) {
        boolean itemFound = false;
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            int actualItemId = product.getItemId();
            if (actualItemId == itemId) {
                itemFound = true;
                double actualPrice = product.getPrice();
                if (amount < actualPrice) {
                    System.out.println("Entered Amount by user is less than Actual Price of Product:" + product.getItemName());
                    break;
                } else {
                    if (amount > actualPrice) {
                        double balanceToReturn = amount - actualPrice;
                        System.out.println("Dispensing Product: " + product.getItemName() + " and returning balance: " + balanceToReturn);

                    } else {
                        System.out.println("Dispensing Product: " + product.getItemName());
                        totalAmount = totalAmount + actualPrice;
                    }
                    totalAmount = totalAmount + actualPrice;
                    int newQty = product.getQty() - 1;
                    product.setQty(newQty);
                }
            }
        }

        if (!itemFound) {
            System.out.println("Entered Item is not available in Vending Machine: " + this.name);
        }
    }
}
