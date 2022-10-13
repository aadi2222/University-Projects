package com.adi;
//SP20-BCS-055

public class CountedProduct extends Product {
    private int quantity;

    public CountedProduct(String pName, double pPrice, int quantity) {
        super(pName, pPrice);
        this.quantity = quantity;
    }

    @Override
    public double getpPrice() {
        return super.getpPrice() * quantity;
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
        return "Counted Product("+"Quantity: "+quantity+")"+super.toString();
    }
}
