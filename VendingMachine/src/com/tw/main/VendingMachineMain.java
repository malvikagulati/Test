package com.tw.main;

import com.tw.product.Product;
import com.tw.vm.VendingMachine;

import java.util.Scanner;

public class VendingMachineMain {
    public static void main(String[] args) {
        int itemIdCounter=1;
        VendingMachine vendingMachine = new VendingMachine("Vending Machine1");
        Product coldDrink =  new Product(itemIdCounter++,"Pepsi", 20, 3 );
        Product biscuits =  new Product(itemIdCounter++,"Parle-G", 5, 5 );
        Product namkeen =  new Product(itemIdCounter++,"Bhujia", 10, 10 );
        vendingMachine.addProduct(coldDrink);
        vendingMachine.addProduct(biscuits);
        vendingMachine.addProduct(namkeen);

        vendingMachine.displayProducts();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Item-Id to purchase");
        int itemId = sc.nextInt();
        System.out.println("Enter Amount:");
        double amount = sc.nextDouble();

        vendingMachine.sellProduct(itemId, amount);
        System.out.println("Total Amount in Vending Machine is:"+vendingMachine.getTotalAmount());
    }
}
