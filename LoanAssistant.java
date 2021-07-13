package local.consumerloanassistantproject;
import java.awt.Color;
public class LoanAssistant extends javax.swing.JFrame {
     double loan;
     double interest;
     double paymentno;
     double monthpayment;
     public LoanAssistant() {
     initComponents();
numberofpay.setBackground(Color.white);
monthlypay.setBackground(Color.yellow);
paymentbtn.setVisible(true);
monthpaybtn.setVisible(false);
newloanbtn.setEnabled(false);
monthlypay.setFocusable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        interestrat = new javax.swing.JTextField();
        loanamt = new javax.swing.JTextField();
        numberofpay = new javax.swing.JTextField();
        monthlypay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loantxt = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        cptpayment = new javax.swing.JButton();
        newloanbtn = new javax.swing.JButton();
        paymentbtn = new javax.swing.JButton();
        monthpaybtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOAN ASSISTANT");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Interest Rate");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Number of Payments");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Monthly Payment ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Loan Amount");

        interestrat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        loanamt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        numberofpay.setBackground(new java.awt.Color(255, 255, 0));
        numberofpay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numberofpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberofpayActionPerformed(evt);
            }
        });

        monthlypay.setBackground(new java.awt.Color(255, 255, 0));
        monthlypay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Loan Analysis ");

        loantxt.setColumns(20);
        loantxt.setRows(5);
        jScrollPane1.setViewportView(loantxt);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cptpayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cptpayment.setText("Compute Number of  Payments");
        cptpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cptpaymentActionPerformed(evt);
            }
        });

        newloanbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newloanbtn.setText("New Loan Analysis");
        newloanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newloanbtnActionPerformed(evt);
            }
        });

        paymentbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paymentbtn.setText("X");
        paymentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentbtnActionPerformed(evt);
            }
        });

        monthpaybtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        monthpaybtn.setText("X");
        monthpaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthpaybtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(575, 575, 575)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(interestrat, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numberofpay, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loanamt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthlypay, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newloanbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cptpayment))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthpaybtn)
                            .addComponent(paymentbtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(loanamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(interestrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(numberofpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentbtn))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(monthlypay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthpaybtn))
                        .addGap(35, 35, 35)
                        .addComponent(cptpayment)
                        .addGap(26, 26, 26)
                        .addComponent(newloanbtn)
                        .addGap(0, 90, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numberofpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberofpayActionPerformed
       
    }//GEN-LAST:event_numberofpayActionPerformed

    private void newloanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newloanbtnActionPerformed
    monthlypay.setText("");
    newloanbtn.setEnabled(false);
    cptpayment.setEnabled(true);
    loantxt.setText("");      
    }//GEN-LAST:event_newloanbtnActionPerformed

    private void cptpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cptpaymentActionPerformed
    if(paymentbtn.isVisible())
    {
    newloanbtn.setEnabled(true);
    cptpayment.setEnabled(false);
    String monthpay;
    double payment;
    double interestgain;
    monthlypay.setFocusable(true);
    loan= Double.parseDouble(loanamt.getText());
    interest= Double.parseDouble(interestrat.getText());
    paymentno= Double.parseDouble(numberofpay.getText());
    monthlypay.setFocusable(true);
    payment= loan +(loan*interest/100);
    monthpayment= payment/paymentno;
    monthpay= Double.toString(monthpayment);
    monthlypay.setText(monthpay);
    interestgain= (payment-loan); 
    loantxt.append("\n\nLoan Amount:\n\n"+loan+"\n\nInterest:\n\n"+interest+"\n\nNumber of Payment:\n\n"+paymentno+"\n\nMonthly Payment:\n\n"+monthpayment+"\n\nInterest Gained:\n\n"+interestgain);
    }
    else{
    newloanbtn.setEnabled(true);
    cptpayment.setEnabled(false);
    String noofpay;
    double payment;
    double interestgain;
    monthlypay.setFocusable(true);
    loan= Double.parseDouble(loanamt.getText());
    interest= Double.parseDouble(interestrat.getText());
    monthpayment= Double.parseDouble(monthlypay.getText());
    numberofpay.setFocusable(true);
    payment= loan +(loan*interest/100);
    paymentno= payment/monthpayment;
    noofpay= Double.toString(paymentno);
    numberofpay.setText(noofpay);
    interestgain= (payment-loan);
    loantxt.append("\n\nLoan Amount:\n\n"+loan+"\n\nInterest:\n\n"+interest+"\n\nNumber of Payment:\n\n"+paymentno+"\n\nMonthly Payment:\n\n"+monthpayment+"\n\nInterest Gained:\n\n"+interestgain);
    }             
    }//GEN-LAST:event_cptpaymentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    System.exit(0); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void paymentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentbtnActionPerformed
         loanamt.setText("");
         interestrat.setText("");
         numberofpay.setText("");
         monthlypay.setText("");
         numberofpay.setBackground(Color.yellow);
         monthlypay.setBackground(Color.white);
         paymentbtn.setVisible(false);
         monthpaybtn.setVisible(true);
         monthlypay.setFocusable(true);
         numberofpay.setFocusable(false);
         newloanbtn.setEnabled(false);
         cptpayment.setEnabled(true);     
    }//GEN-LAST:event_paymentbtnActionPerformed

    private void monthpaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthpaybtnActionPerformed
         loanamt.setText("");
         interestrat.setText("");
         numberofpay.setText("");
         monthlypay.setText("");
         numberofpay.setBackground(Color.white);
         monthlypay.setBackground(Color.yellow);
         paymentbtn.setVisible(true);
         monthpaybtn.setVisible(false);
         numberofpay.setFocusable(true);
         monthlypay.setFocusable(false);
         newloanbtn.setEnabled(false);
         cptpayment.setEnabled(true);
    }//GEN-LAST:event_monthpaybtnActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanAssistant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cptpayment;
    private javax.swing.JTextField interestrat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loanamt;
    private javax.swing.JTextArea loantxt;
    private javax.swing.JTextField monthlypay;
    private javax.swing.JButton monthpaybtn;
    private javax.swing.JButton newloanbtn;
    private javax.swing.JTextField numberofpay;
    private javax.swing.JButton paymentbtn;
    // End of variables declaration//GEN-END:variables

}
