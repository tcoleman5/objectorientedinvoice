package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        ArrayList<inventory> products = new ArrayList<inventory>();
        ArrayList<accounting> prices = new ArrayList<accounting>();
        
        stock s = new inventory();
        
        s.setProduct("Bison Sweater");
        s.setPrice(55.99);
        products.add(I);

        s = new inventory();
        s.setProduct("Bison Tee");
        s.setPrice(14.99);
        products.add(I);

        s = new inventory();
        s.setProduct("Bison Hoodie");
        s.setPrice(23.99);
        products.add(I);

        s = new inventory();
        s.setProduct("Bison Bumpersticker");
        s.setPrice(4.99);
        products.add(I);
        
        String answer = "";
        String item;
        
        do {
            System.out.println("What do you want to do?");
            System.out.println("1) Add purchase 2) Change purchase 3) Show purchases 4) Finish transaction");
            answer = input.nextLine();

            if (answer.equals("1")) {
                System.out.println("What item would you like to purchase?");
                item = input.nextLine();
                }
                
                for (int i = 0; i < storeProd.size(); i++) {
                    if (storeProd().equals(item))
                    }
                    products.add(item.get(prices));
                
                for (int i = 0; i < storeProd.size(); i++) {
                    System.out.println("You have added" + storeProd.get(i) + " at the price of $ " + prodPrices.get(i) + "to your cart");
                }

            } else if (answer.equals("2")) {
                System.out.println("You currently have the following items in your cart:");
                
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(products.get(i) + " at the price(s) of $ " + prices.get(i));
                }
                
                System.out.println("What item would you  like to change? ");
                item = input.nextLine()
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i) += item) {
                         products.remove(item);
                         products.remove(item);
                    }
                    
            } else if (answer.equals("3")) {
                System.out.println("You currently have the following items in your cart:");   
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(products.get(i) + " at the price(s) of $ " + prices.get(i));
                }
            }

        } while (! answer.equals("4"));
        double totalcost = 0.0;
        for (int i = 0; i < products.size(); i++) {
            totalcost += products.get(i);
        }
        
        System.out.println("Your order total is: $ " + totalcost);
    }
}
