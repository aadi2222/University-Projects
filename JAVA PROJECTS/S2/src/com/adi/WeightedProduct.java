package com.adi;
//SP20-BCS-055

public class WeightedProduct extends Product {
    private double weight;

    public WeightedProduct(String pName, double pPrice, double weight) {
        super(pName, pPrice);
        this.weight = weight;
    }

    @Override
    public double getpPrice() {
        return super.getpPrice()*weight;
    }

    @Override
    public double purchaseBill() {
        return getpPrice();
    }

    public static double purchaseBill(Billing[] items) {
        double total = 0;

        for (Billing item: items) {
            total += item.purchaseBill();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Weighed Product("+"Weight: "+weight+")"+super.toString();
    }
}
