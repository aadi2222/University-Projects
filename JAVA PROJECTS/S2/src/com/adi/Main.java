package com.adi;

public class Main {
//SP20-BCS-055
    public static void main(String[] args) {


            Billing[] products = new Billing[4];
        products[0] = new WeightedProduct("rice", 6, 23);
        products[1] = new WeightedProduct("beans", 20, 10);
        products[2] = new CountedProduct("pens", 7.6, 30);
        products[3] = new CountedProduct("books", 70, 82);

            for (Billing pro: products) {
                System.out.println(pro);
                System.out.println("SubTotal: "+pro.purchaseBill());
            }

            System.out.println("Grand Total: "+Product.purchaseBill(products));

    }
}
