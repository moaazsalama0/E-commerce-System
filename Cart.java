package com.Moaaz.project1;

public class Cart{
    private int customerId;
    private int nProducts;
    private Product[] products;

    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = new Product[nProducts];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getNProducts() {
        return nProducts;
    }

    public void setNProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProduct(Product product, int el) {
        if (el >= 0 && el < nProducts) {
            products[el] = product;
        } else {
            System.out.println("incorrect size");
        }
    }

    public void removeProduct(int el) {
        if (el >= 0 && el < nProducts) {
            products[el] = null;
        } else {
            System.out.println("incorrect size");
        }
    }
    public double calculatePrice() {
        double totalPrice = 0;
        for (int i=0;i <nProducts;i++) {
            if (products[i] != null) {
                totalPrice += products[i].getPrice();
            }
        }
        return totalPrice;
    }
}