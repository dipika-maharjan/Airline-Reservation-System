
package View;

import View.UpdateTicket;
import View.CancelTicket;
import View.BookTicket;
import View.BookDetails;
import View.AddFlight;


public class HomePage extends javax.swing.JFrame {

    
    public HomePage() {
        initComponents();
        setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Add_Flight_Details_Button = new javax.swing.JButton();
        Book_Details_Button = new javax.swing.JButton();
        Update_Ticket_Button = new javax.swing.JButton();
        Cancel_Ticket_Button = new javax.swing.JButton();
        Book_Ticket_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AirlineReservationSystem");
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("Airline Reservation System");

        Add_Flight_Details_Button.setBackground(new java.awt.Color(0, 153, 153));
        Add_Flight_Details_Button.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Add_Flight_Details_Button.setText("Add Flight Details");
        Add_Flight_Details_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Flight_Details_ButtonActionPerformed(evt);
            }
        });

        Book_Details_Button.setBackground(new java.awt.Color(0, 153, 153));
        Book_Details_Button.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Book_Details_Button.setText("Book Details");
        Book_Details_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_Details_ButtonActionPerformed(evt);
            }
        });

        Update_Ticket_Button.setBackground(new java.awt.Color(0, 153, 153));
        Update_Ticket_Button.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Update_Ticket_Button.setText("Update Ticket");
        Update_Ticket_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_Ticket_ButtonActionPerformed(evt);
            }
        });

        Cancel_Ticket_Button.setBackground(new java.awt.Color(0, 153, 153));
        Cancel_Ticket_Button.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Cancel_Ticket_Button.setText("Cancel Ticket");
        Cancel_Ticket_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_Ticket_ButtonActionPerformed(evt);
            }
        });

        Book_Ticket_Button.setBackground(new java.awt.Color(0, 153, 153));
        Book_Ticket_Button.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Book_Ticket_Button.setText("Book Ticket");
        Book_Ticket_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_Ticket_ButtonActionPerformed(evt);
            }
        });

        Exit_Button.setBackground(new java.awt.Color(0, 153, 153));
        Exit_Button.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cancel_Ticket_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addGap(354, 354, 354))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Book_Details_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Add_Flight_Details_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Update_Ticket_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(Book_Ticket_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Exit_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Book_Ticket_Button)
                    .addComponent(Add_Flight_Details_Button))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Book_Details_Button)
                    .addComponent(Update_Ticket_Button))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel_Ticket_Button)
                    .addComponent(Exit_Button))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_Flight_Details_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Flight_Details_ButtonActionPerformed
        // TODO add your handling code here:
        AddFlight AddFlightFrame = new AddFlight();
        AddFlightFrame.setVisible(true);
        AddFlightFrame.pack();
        AddFlightFrame.setLocationRelativeTo(AddFlightFrame);
        this.dispose();
    }//GEN-LAST:event_Add_Flight_Details_ButtonActionPerformed

    private void Book_Ticket_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_Ticket_ButtonActionPerformed
        // TODO add your handling code here:
        BookTicket BookTicketFrame = new BookTicket();
        BookTicketFrame.setVisible(true);
        BookTicketFrame.pack();
        BookTicketFrame.setLocationRelativeTo(BookTicketFrame);
        this.dispose();
    }//GEN-LAST:event_Book_Ticket_ButtonActionPerformed

    private void Book_Details_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_Details_ButtonActionPerformed
        // TODO add your handling code here:
        BookDetails BookDetailsFrame = new BookDetails();
        BookDetailsFrame.setVisible(true);
        BookDetailsFrame.pack();
        BookDetailsFrame.setLocationRelativeTo(BookDetailsFrame);
        this.dispose();
    }//GEN-LAST:event_Book_Details_ButtonActionPerformed

    private void Update_Ticket_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_Ticket_ButtonActionPerformed
        // TODO add your handling code here:
        UpdateTicket UpdateTicketFrame = new UpdateTicket();
        UpdateTicketFrame.setVisible(true);
        UpdateTicketFrame.pack();
        UpdateTicketFrame.setLocationRelativeTo(UpdateTicketFrame);
        this.dispose();
    }//GEN-LAST:event_Update_Ticket_ButtonActionPerformed

    private void Cancel_Ticket_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_Ticket_ButtonActionPerformed
        // TODO add your handling code here:
        CancelTicket CancelTicketFrame = new CancelTicket();
        CancelTicketFrame.setVisible(true);
        CancelTicketFrame.pack();
        CancelTicketFrame.setLocationRelativeTo(CancelTicketFrame);
        this.dispose();
    }//GEN-LAST:event_Cancel_Ticket_ButtonActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Flight_Details_Button;
    private javax.swing.JButton Book_Details_Button;
    private javax.swing.JButton Book_Ticket_Button;
    private javax.swing.JButton Cancel_Ticket_Button;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JButton Update_Ticket_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
