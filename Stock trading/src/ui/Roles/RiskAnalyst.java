/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Roles;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import enterprise.StockExchange.Stock;
import java.awt.CardLayout;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import ui.Admin.PersonDirectory;
import ui.Admin.Admin;
import ui.userRoles.UserDashboard;

/**
 *
 * @author rohanjauhari
 */
public class RiskAnalyst extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    JPanel userProcessContainer;
    Person p;
    Admin a;
    String un;
    public RiskAnalyst(JPanel userProcessContainer, Admin admin, String username, String password) throws IOException, InterruptedException {
        this.userProcessContainer=userProcessContainer;
        this.un = username;
        this.a = admin;
        initComponents();
        jTextField1.setText(username);
        populateTable();
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
        jTextField1 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWatchlist = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtAdd = new javax.swing.JTextField();

        jLabel1.setText("Welcome Risk Analyst");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblWatchlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock", "Price", "Volatility", "Trend", "Trailing PE", "Forward PE", "Risk score", "52 week high", "200 week high", "Verdict"
            }
        ));
        jScrollPane1.setViewportView(tblWatchlist);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 604, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)
                        .addGap(392, 392, 392))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this) ;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout. previous (userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://yahoo-finance15.p.rapidapi.com/api/v1/markets/stock/quotes?ticker="+txtAdd.getText()))
        .header("x-rapidapi-key", "f538519bddmshdd875603384a825p11fd5bjsn0639eb1a04a7")
        .header("x-rapidapi-host", "yahoo-finance15.p.rapidapi.com")
        .method("GET", HttpRequest.BodyPublishers.noBody())
        .build();
        HttpResponse<String> response;
            try {
                                JsonParser parser = new JsonParser();

                response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
                        JsonObject jsonObject = parser.parse(response.body()).getAsJsonObject();
                        DefaultTableModel model1 = (DefaultTableModel) tblWatchlist.getModel();
        JsonElement name=jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("longName");
        Double price = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("regularMarketPrice").getAsDouble();
        JsonElement open = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("regularMarketOpen");
        Double high = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("regularMarketDayHigh").getAsDouble();
        Double low = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("regularMarketDayLow").getAsDouble();
        JsonElement trailingPE = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("trailingPE");
        JsonElement forwardPE = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("forwardPE");
        JsonElement prevClose = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("regularMarketPreviousClose");
//        Stock stock = new Stock(name.getAsString(), price, open, high, low, prevClose);
        Double fiftyTwoWeekHigh = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("fiftyTwoWeekHigh").getAsDouble();
        Double twoHundredDayAvg = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("twoHundredDayAverage").getAsDouble();
        Object row[] = new Object [10];
        
        double regularMarketChangePercent = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("regularMarketChangePercent").getAsDouble();; // in %
        double postMarketChangePercent = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("postMarketChangePercent").getAsDouble();; // in %
        double regularMarketVolume = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("regularMarketVolume").getAsDouble();; // number of shares
        double averageDailyVolume3Month = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("averageDailyVolume3Month").getAsDouble();; // number of shares
        double regularMarketPrice = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("regularMarketPrice").getAsDouble();; // in USD
        double fiftyTwoWeekLow = jsonObject.get("body").getAsJsonArray().get(0).getAsJsonObject().get("fiftyTwoWeekLow").getAsDouble();; // in USD

        // Weights
        double w1 = 0.4; // Weight for regular market change percent
        double w2 = 0.1; // Weight for post-market change percent
        double w3 = 0.2; // Weight for volume trend
        double w4 = 0.2; // Weight for 52-week high proximity
        double w5 = 0.1; // Weight for 52-week low proximity

        // Calculations
        double volumeTrend = regularMarketVolume / averageDailyVolume3Month;

        double proximityToHigh = 1 - Math.abs((regularMarketPrice - fiftyTwoWeekHigh) / fiftyTwoWeekHigh);

        double proximityToLow = 1 - Math.abs((regularMarketPrice - fiftyTwoWeekLow) / fiftyTwoWeekLow);

        // Risk score formula
        double score = (w1 * regularMarketChangePercent)
                     + (w2 * postMarketChangePercent)
                     + (w3 * volumeTrend)
                     + (w4 * proximityToHigh)
                     + (w5 * proximityToLow);

        // Output the result
//        System.out.printf("Bullish/Bearish Score: %.4f%n", score);

        // Interpretation
        if (score > 0) {
            row[3]="bullish";
        } else {
            row[3]="bearish";
        }
        
        row[0] = name.getAsString();
        row[1] = price;
        row[2] = (high-low)/price;
        row[4] = trailingPE;
        row[5] = forwardPE;
        row[6] = score;
        row[7] = fiftyTwoWeekHigh;
        row[8] = twoHundredDayAvg;
        if (score>0.2)
            row[9] = "Buy";
        else if (score<-0.2)
            row[9] = "Sell";
        else
            row[9] = "Hold";
        model1. addRow (row);
                        
            } catch (IOException ex) {
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtAdd.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblWatchlist;
    private javax.swing.JTextField txtAdd;
    // End of variables declaration//GEN-END:variables

    private void populateTable() throws IOException, InterruptedException {
        DefaultTableModel model = (DefaultTableModel) tblWatchlist.getModel();
        model.setRowCount (0) ;
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
        for (int i=0;i<10;i++) {
                    Object row[] = new Object [10];

            JsonElement name=jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("longName");
        Double price = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketPrice").getAsDouble();
        JsonElement open = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketOpen");
        Double high = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketDayHigh").getAsDouble();
        Double low = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketDayLow").getAsDouble();
        JsonElement trailingPE = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("trailingPE");
        JsonElement forwardPE = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("forwardPE");
        JsonElement prevClose = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketPreviousClose");
//        Stock stock = new Stock(name.getAsString(), price, open, high, low, prevClose);
        Double fiftyTwoWeekHigh = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("fiftyTwoWeekHigh").getAsDouble();
        Double twoHundredDayAvg = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("twoHundredDayAverage").getAsDouble();
        
        double regularMarketChangePercent = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketChangePercent").getAsDouble();; // in %
        double postMarketChangePercent = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("postMarketChangePercent").getAsDouble();; // in %
        double regularMarketVolume = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketVolume").getAsDouble();; // number of shares
        double averageDailyVolume3Month = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("averageDailyVolume3Month").getAsDouble();; // number of shares
        double regularMarketPrice = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketPrice").getAsDouble();; // in USD
        double fiftyTwoWeekLow = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("fiftyTwoWeekLow").getAsDouble();; // in USD

        // Weights
        double w1 = 0.4; // Weight for regular market change percent
        double w2 = 0.1; // Weight for post-market change percent
        double w3 = 0.2; // Weight for volume trend
        double w4 = 0.2; // Weight for 52-week high proximity
        double w5 = 0.1; // Weight for 52-week low proximity

        // Calculations
        double volumeTrend = regularMarketVolume / averageDailyVolume3Month;

        double proximityToHigh = 1 - Math.abs((regularMarketPrice - fiftyTwoWeekHigh) / fiftyTwoWeekHigh);

        double proximityToLow = 1 - Math.abs((regularMarketPrice - fiftyTwoWeekLow) / fiftyTwoWeekLow);

        // Risk score formula
        double score = (w1 * regularMarketChangePercent)
                     + (w2 * postMarketChangePercent)
                     + (w3 * volumeTrend)
                     + (w4 * proximityToHigh)
                     + (w5 * proximityToLow);

        // Output the result
        System.out.printf("Bullish/Bearish Score: %.4f%n", score);

        // Interpretation
        if (score > 0) {
            row[3]="bullish";
        } else {
            row[3]="bearish";
        }
        
        row[0] = name.getAsString();
        row[1] = price;
        row[2] = (high-low)/price;
        row[4] = trailingPE;
        row[5] = forwardPE;
        row[6] = score;
        row[7] = fiftyTwoWeekHigh;
        row[8] = twoHundredDayAvg;
        if (score>0.2)
            row[9] = "Buy";
        else if (score<-0.2)
            row[9] = "Sell";
        else
            row[9] = "Hold";
        model. addRow (row);

            
        
        }
    }
}
