package com.Moaaz.project1;

public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;

    public Order(int customerId, int orderId, Product[] products, float totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }

    public void printOrderInfo(){
        System.out.println("Customer Id is " + customerId + ", Order Id is " + orderId);
        for (int i = 0;i<products.length;i++){
            System.out.println("Product number "+i+ " is "+products[i]);
        }
        System.out.println("Total price is " +totalPrice);
    }
}
