/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.StockExchange;

import com.google.gson.JsonElement;

/**
 *
 * @author archil
 */
public class Stock {
    String name;
    int id;
    double currentPrice, open, high, low, prevClose;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
    
    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getPrevClose() {
        return prevClose;
    }

    public void setPrevClose(double prevClose) {
        this.prevClose = prevClose;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Stock.count = count;
    }
    private static int count = 0;
    public Stock(String name, JsonElement price, JsonElement open, JsonElement high, JsonElement low, JsonElement prevClose){
        count++;
        this.name = name;
        this.currentPrice = price.getAsDouble();
        this.open = open.getAsDouble();
        this.high = high.getAsDouble();
        this.low = low.getAsDouble();
        this.prevClose = prevClose.getAsDouble();
        id=count;
    }
    
}
