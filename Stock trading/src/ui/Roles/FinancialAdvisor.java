/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Roles;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.CardLayout;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import ui.Admin.PersonDirectory;
import ui.Admin.Admin;

/**
 *
 * @author rohanjauhari
 */
public class FinancialAdvisor extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    JPanel userProcessContainer;
    Person p;
    Admin a;
    ArrayList<String> recommendations = new ArrayList<String>();
    String un;
    public FinancialAdvisor(JPanel userProcessContainer, Admin admin, String username) throws IOException, InterruptedException {
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWatchlist = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Optima", 3, 18)); // NOI18N
        jLabel1.setText("Welcome Financial Advisor");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(51, 51, 51));
        btnBack.setForeground(new java.awt.Color(204, 204, 204));
        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Optima", 2, 14)); // NOI18N
        jLabel2.setText("Recommended Stocks");

        tblWatchlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock", "Price", "Volatility", "Trend", "Trailing PE", "Forward PE", "Risk score", "52 week high", "200 week high", "Verdict"
            }
        ));
        jScrollPane1.setViewportView(tblWatchlist);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Optima", 2, 12)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("These stocks reflect diverse industries such as technology, healthcare, energy, and consumer goods. However, always consider your investment goals and consult a financial advisor before making decisions.");
        jScrollPane3.setViewportView(jTextArea2);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        jButton1.setText("Send Email to user");
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(13, Short.MAX_VALUE))
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
        sendEmail("Stock Recommendations","Hello\n\nHere are recommended stocks "+recommendations+"\n\nBest wishes,\nTeam Dr. Trade.");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblWatchlist;
    // End of variables declaration//GEN-END:variables

    private void populateTable() throws IOException, InterruptedException {
        DefaultTableModel model = (DefaultTableModel) tblWatchlist.getModel();
        model.setRowCount (0) ;
                HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://yahoo-finance15.p.rapidapi.com/api/v1/markets/stock/quotes?ticker=TSM%2CAMD%2CNOW%2CMA%2CAMZN%2CPFE%2CXOM%2CCRM%2CPII%2CAVGO"))
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
        recommendations.add(name.getAsString());
        Double price = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketPrice").getAsDouble();
        JsonElement open = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketOpen");
        Double high = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketDayHigh").getAsDouble();
        Double low = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketDayLow").getAsDouble();
        JsonElement trailingPE = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("trailingPE");
        JsonElement forwardPE = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("forwardPE");
        JsonElement prevClose = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketPreviousClose");
//      Stock stock = new Stock(name.getAsString(), price, open, high, low, prevClose);
        Double fiftyTwoWeekHigh = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("fiftyTwoWeekHigh").getAsDouble();
        Double twoHundredDayAvg = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("twoHundredDayAverage").getAsDouble();
        
        double regularMarketChangePercent = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketChangePercent").getAsDouble();//
        double postMarketChangePercent = 0.5;//jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("postMarketChangePercent").getAsDouble(); 
        double regularMarketVolume = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketVolume").getAsDouble(); 
        double averageDailyVolume3Month = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("averageDailyVolume3Month").getAsDouble(); 
        double regularMarketPrice = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("regularMarketPrice").getAsDouble(); 
        double fiftyTwoWeekLow = jsonObject.get("body").getAsJsonArray().get(i).getAsJsonObject().get("fiftyTwoWeekLow").getAsDouble(); 

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

    private void sendEmail(String subject, String body) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // Use the SMTP server you want
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        final String username = "rohanjauhari13@gmail.com"; 
        final String password ="cskb vucf ssdb joar";
        // Set up the session
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username,password);
            }
        });
              try {
            // Create a MimeMessage object
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("rohanjauhari13@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("rohanjauhari13@gmail.com"));
            message.setSubject(subject);
            message.setText(body);

            // Send the email
            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
