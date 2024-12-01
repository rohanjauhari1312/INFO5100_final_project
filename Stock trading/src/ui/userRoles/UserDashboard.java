/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.userRoles;

import Organizations.Organization;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import enterprise.StockExchange.Stock;
import enterprise.StockExchange.StockCatalog;
import java.awt.CardLayout;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Order;
import model.OrderItem;
import model.Person;
import ui.Admin.Admin;

/**
 *
 * @author rohanjauhari
 */
public class UserDashboard extends javax.swing.JPanel {

    /**
     * Creates new form UserDashboard
     */
        Order currentOrder,portfolio;
    JPanel userProcessContainer;
    StockCatalog stocks;
    Person p;
    Admin admin;
    public UserDashboard(JPanel userProcessContainer, Admin admin,  String username, String password, Person p) throws IOException, InterruptedException {
        this.admin=admin;
        this.userProcessContainer = userProcessContainer;
        initComponents();
        this.p = p;
                txtName.setText(username);
this.currentOrder = new Order();
stocks = new StockCatalog();
        populateWatchlistTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWatchlist = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnBuy = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnModifyQuantity = new javax.swing.JButton();
        txtNewQuantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        lblItemsInCart = new javax.swing.JLabel();
        btnAddToCart = new javax.swing.JButton();
        spnQuantity = new javax.swing.JSpinner();
        lblQuantity = new javax.swing.JLabel();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnRemoveWatchlist = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        jLabel1.setText("Welcome user");

        jButton1.setText("<<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblWatchlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Stock", "Current price", "Open", "High", "Low", "Prev Close"
            }
        ));
        jScrollPane1.setViewportView(tblWatchlist);

        btnAdd.setText("Add Stock");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBuy.setText("Buy");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        btnProfile.setText("View Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        jLabel2.setText("Watchlist");

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);

        lblItemsInCart.setText("Items in cart:");

        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lblQuantity.setText("Quantity:");

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        btnRemoveWatchlist.setText("Remove");
        btnRemoveWatchlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveWatchlistActionPerformed(evt);
            }
        });

        jLabel3.setText("Total");

        txtTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnRemoveWatchlist)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnProfile)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(256, 256, 256)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton1)))
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addComponent(btnAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRemoveOrderItem)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuy)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(lblQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(171, 171, 171))
                            .addComponent(lblItemsInCart)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModifyQuantity)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnProfile)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveWatchlist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddToCart)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantity))
                .addGap(1, 1, 1)
                .addComponent(lblItemsInCart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveOrderItem)
                    .addComponent(btnModifyQuantity)
                    .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuy)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this) ;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout. previous (userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        // TODO add your handling code here:
        if (Double.parseDouble(p.getBankBalance())<Double.parseDouble(txtTotal.getText())){
            JOptionPane.showMessageDialog (this, "Insufficient bank balance. You have a total of "+p.getBankBalance()+".");
            return;
        }
        portfolio = currentOrder;
        currentOrder = new Order ();
        populateCartTable ();
        txtNewQuantity.setText ("") ;

        spnQuantity.setValue (0);
        JOptionPane.showMessageDialog (this, "Thanks for purchasing.");
    }//GEN-LAST:event_btnBuyActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        UserProfile uf = new UserProfile(userProcessContainer,p, admin,portfolio, stocks);
        userProcessContainer.add("UserProfile", uf);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCart.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select the order item first.");
            return;
        }
        OrderItem item = (OrderItem) tblCart.getValueAt (selectedRowIndex, 0);
        int quant = 0;
        try
        {
            quant = Integer.parseInt (txtNewQuantity.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check the modified quantity field");
            return;
        }        
        item.setQuantity(quant);
        populateCartTable();
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWatchlist.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the product first.");
            return;
        }
        Stock stock =  stocks.searchStock(tblWatchlist.getValueAt (selectedRowIndex, 0).toString());
        int quant = 0;
        try {
            quant = (Integer) spnQuantity.getValue();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check the price and quantity fields.");
            return;
        }

        OrderItem item = currentOrder. findProduct (stock);
        if (item == null) {
            currentOrder.addNewOrderItem(stock, stock.getCurrentPrice(), quant);
        }
        populateCartTable ();
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        int selectedRowIndex = tblCart.getSelectedRow() ;
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the order item first.");
            return;
        }
        OrderItem item = (OrderItem) tblCart.getValueAt(selectedRowIndex, 0);
        currentOrder.deleteltem(item);

        populateCartTable();
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveWatchlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveWatchlistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveWatchlistActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnRemoveWatchlist;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblItemsInCart;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblWatchlist;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void populateCartTable() {
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model. setRowCount (0) ;
        double sum=0;
        for (OrderItem oi : currentOrder.getOrderItemList()) {
            Object row[] = new Object [4];
            row [0] = oi.getProduct().getName();
            row[1] = oi.getSalesPrice();
            row[2] = oi.getQuantity();
            row [3] = oi.getQuantity() * oi.getSalesPrice();
            sum=sum+oi.getQuantity() * oi.getSalesPrice();
            model.addRow (row);
        }
        txtTotal.setText(String.valueOf(sum));
    }

    private void populateWatchlistTable() throws IOException, InterruptedException {
        ArrayList<String> stockList = new ArrayList<>(Arrays.asList(
    "AAPL",  // Apple
    "F",     // Ford
    "NFLX",  // Netflix
    "NVDA",  // NVIDIA
    "MSFT",  // Microsoft
    "TSLA",  // Tesla
    "META",  // Meta Platforms
    "AMZN",  // Amazon
    "KO",    // Coca-Cola
    "CAVGO"  // Berkshire Hathaway
));
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://yahoo-finance15.p.rapidapi.com/api/v1/markets/stock/quotes?ticker=AAPL%2CF%2CNFLX%2CNVDA%2CMSFT%2CTSLA%2CMETA%2CAMZN%2CKO%2CAVGO"))
        .header("x-rapidapi-key", "f538519bddmshdd875603384a825p11fd5bjsn0639eb1a04a7")
        .header("x-rapidapi-host", "yahoo-finance15.p.rapidapi.com")
        .method("GET", HttpRequest.BodyPublishers.noBody())
        .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
                JsonParser parser = new JsonParser();
        
        // Parse the string to a JsonObject
        JsonObject jsonObject = parser.parse(response.body()).getAsJsonObject();
        System.out.println(jsonObject.getAsJsonObject());
        DefaultTableModel model1 = (DefaultTableModel) tblWatchlist.getModel();
    model1.setRowCount(0);
    for (int i=0;i<10;i++) {
        Object row[] = new Object [7];
        JsonElement name=jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("longName");
        JsonElement price = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketPrice");
        JsonElement open = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketOpen");
        JsonElement high = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketDayHigh");
        JsonElement low = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketDayLow");
        JsonElement prevClose = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketPreviousClose");
        Stock stock = new Stock(name, price, open, high, low, prevClose);
        stocks.addStock(stock);
        row[0] = stock.getName();
        row[1] = price;
        row[2] = open;
        row[3] = high;
        row[4] = low;
        row[5] = prevClose;
        row[6] = stock;
        model1. addRow (row);
       }
    }
}

