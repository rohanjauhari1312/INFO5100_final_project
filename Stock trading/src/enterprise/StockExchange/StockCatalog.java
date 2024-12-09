/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.StockExchange;

import enterprise.StockExchange.Stock;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author archil
 */
public class StockCatalog {

    private List<Stock> stockCatalog;

    public StockCatalog() {
        stockCatalog = new ArrayList<Stock>();
    }

    public List<Stock> getStockcatalog() {
        return stockCatalog;
    }

    public Stock addStock(Stock stock) {
        Stock p = stock;
        stockCatalog.add(p);
        return p;
    }

    public void removeStock(Stock p) {
        stockCatalog.remove(p);
    }

    public Stock searchStock(int id) {
        for (Stock stock : stockCatalog) {
            if (stock.getId() == id) {
                return stock;
            }
        }
        return null;
    }
    
        public Stock searchStock(String id) {
        for (Stock stock : stockCatalog) {
            if (stock.getName().equals( id)) {
                return stock;
            }
        }
        return null;
    }
}
