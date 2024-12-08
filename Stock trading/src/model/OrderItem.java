/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import enterprise.StockExchange.Stock;

/**
 *
 * @author rohanjauhari
 */
public class OrderItem {
    Stock product;
double salesPrice;
int quantity;
public OrderItem(Stock product, double salesPrice, int quantity) {
    this.product = product;
    this.salesPrice = salesPrice;
    this.quantity = quantity;
}

    public Stock getProduct() {
        return product;
    }

    public void setProduct(Stock product) {
        this.product = product;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
public String toString(){
return this.product.toString();
}

}
