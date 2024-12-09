/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import enterprise.StockExchange.Stock;
import java.util.ArrayList;

/**
 *
 * @author rohanjauhari
 */
public class Order {

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    ArrayList<OrderItem> orderItemList;
    public Order () {
    this.orderItemList = new ArrayList<OrderItem>();
    }
    public void addNewOrderItem(Stock product, double price, int quantity){
        OrderItem orderItem = new OrderItem(product, price, quantity);
        orderItemList.add (orderItem) ;
    }

    public void deleteltem(OrderItem item) {
        orderItemList.remove(item);
    }

    public OrderItem findProduct(Stock product){
    for (OrderItem oi : this.getOrderItemList ()){
        if (oi.getProduct().equals (product) ){
        return oi;
    }
    }
    return null;
}
}

