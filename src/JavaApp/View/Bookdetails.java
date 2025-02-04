/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JavaApp.View;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author artii
 */
public class Bookdetails extends javax.swing.JFrame {
    /**
     * Creates new form HomePage
     */
    private Connection connection;
    
    public Bookdetails() {
        initComponents();
        fetchData();
    }
    private void fetchData() {
    Connection connection = null;
    try {
        // Establish connection to the ticketbookingdb database
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines", "root", "admin123");
        Statement stmt = connection.createStatement();
        
        // SQL query to select all relevant fields from the Tickets table
        String sql = "SELECT customer_name, contact_no, address, ticket_no, flight_name, departure_from, destination, departure_time, arrival_time, seat FROM Tickets";
        ResultSet rs = stmt.executeQuery(sql);

        // Get the DefaultTableModel from the JTable
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear any existing rows in the table

        // Loop through the result set and add each row to the table model
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("customer_name"),
                rs.getString("contact_no"),
                rs.getString("address"),
                rs.getString("ticket_no"), 
                rs.getString("flight_name"),
                rs.getString("departure_from"),
                rs.getString("destination"),
                rs.getTime("departure_time"),
                rs.getTime("arrival_time"),
                rs.getString("seat")
            });
        }

        // Close the result set and statement
        rs.close();
        stmt.close();
    } catch (SQLException e) {
        e.printStackTrace(); // Handle SQL exceptions
    } finally {
        if (connection != null) {
            try {
                connection.close(); // Close the connection
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

//    private void fetchData() {
//    Connection connection = null;
//    try {
//        // Establish connection to the ticketbookingdb database
//        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbookingdb", "root", "Teju_sha3187");
//        Statement stmt = connection.createStatement();
//        
//        // SQL query to select all relevant fields from the Ticket table
//        String sql = "SELECT customer_name, contact_no, address, ticket_no, flight_name, departure_from, destination, departure_time, arrival_time, seat FROM Ticket";
//        ResultSet rs = stmt.executeQuery(sql);
//
//        // Get the DefaultTableModel from the JTable
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.setRowCount(0); // Clear any existing rows in the table
//
//        // Loop through the result set and add each row to the table model
//        while (rs.next()) {
//            model.addRow(new Object[]{
//                rs.getString("customer_name"),
//                rs.getString("contact_no"),
//                rs.getString("address"),
//                rs.getInt("ticket_no"),
//                rs.getString("flight_name"),
//                rs.getString("departure_from"),
//                rs.getString("destination"),
//                rs.getTime("departure_time"),
//                rs.getTime("arrival_time"),
//                rs.getString("seat")
//            });
//        }
//
//        // Close the result set and statement
//        rs.close();
//        stmt.close();
//    } catch (SQLException e) {
//        e.printStackTrace(); // Handle SQL exceptions
//    } finally {
//        if (connection != null) {
//            try {
//                connection.close(); // Close the connection
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}


    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DashBookTicket = new javax.swing.JLabel();
        DashBookingDetails = new javax.swing.JLabel();
        DashUpdateTicket = new javax.swing.JLabel();
        DashCancelTicket = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DashHome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/brand.png"))); // NOI18N

        DashBookTicket.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DashBookTicket.setForeground(new java.awt.Color(220, 213, 199));
        DashBookTicket.setIcon(new FlatSVGIcon("ticket.svg"));
        DashBookTicket.setText("   Book Ticket");
        DashBookTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashBookTicketMouseClicked(evt);
            }
        });

        DashBookingDetails.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DashBookingDetails.setForeground(new java.awt.Color(219, 212, 199));
        DashBookingDetails.setIcon(new FlatSVGIcon("details.svg"));
        DashBookingDetails.setText("     Booking Details");
        DashBookingDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashBookingDetailsMouseClicked(evt);
            }
        });

        DashUpdateTicket.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DashUpdateTicket.setForeground(new java.awt.Color(219, 212, 199));
        DashUpdateTicket.setIcon(new FlatSVGIcon("update.svg"));
        DashUpdateTicket.setText("   Update Ticket");
        DashUpdateTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashUpdateTicketMouseClicked(evt);
            }
        });

        DashCancelTicket.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DashCancelTicket.setForeground(new java.awt.Color(219, 212, 199));
        DashCancelTicket.setIcon(new FlatSVGIcon("cancel.svg"));
        DashCancelTicket.setText("   Cancel Ticket");
        DashCancelTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashCancelTicketMouseClicked(evt);
            }
        });

        DashHome.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DashHome.setForeground(new java.awt.Color(204, 204, 204));
        DashHome.setIcon(new FlatSVGIcon("home.svg")
        );
        DashHome.setText("   Home");
        DashHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(DashBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 53, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(DashHome)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel2))
                                    .addComponent(DashBookTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DashCancelTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DashUpdateTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(117, 117, 117)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DashHome))
                .addGap(42, 42, 42)
                .addComponent(DashBookTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(DashBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(DashUpdateTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(DashCancelTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(490, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 1080));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName(""); // NOI18N
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1620, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1600, 950));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer Name", "Contact No", "Address", "Ticket No", "Flight Name", "From", "Destination", "Depature Time", "Arrival time", "Seat"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 1220, 870));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DashBookTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashBookTicketMouseClicked
        // TODO add your handling code here:
        this.dispose();
        ticketbook bt= new ticketbook();
        bt.setVisible(true);
    }//GEN-LAST:event_DashBookTicketMouseClicked

    private void DashHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashHomeMouseClicked
        // TODO add your handling code here:
        this.dispose();
        HomePage hp = new HomePage();
        hp.setVisible(true);
    }//GEN-LAST:event_DashHomeMouseClicked

    private void DashBookingDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashBookingDetailsMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Bookdetails bd= new Bookdetails();
        bd.setVisible(true);
    }//GEN-LAST:event_DashBookingDetailsMouseClicked

    private void DashUpdateTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashUpdateTicketMouseClicked
        // TODO add your handling code here:
        this.dispose();
        UpdateTicket up= new UpdateTicket();
        up.setVisible(true);
    }//GEN-LAST:event_DashUpdateTicketMouseClicked

    private void DashCancelTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashCancelTicketMouseClicked
        // TODO add your handling code here:
        this.dispose();
        CancelTicket ct= new CancelTicket();
        ct.setVisible(true);
    }//GEN-LAST:event_DashCancelTicketMouseClicked

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
            java.util.logging.Logger.getLogger(Bookdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DashBookTicket;
    private javax.swing.JLabel DashBookingDetails;
    private javax.swing.JLabel DashCancelTicket;
    private javax.swing.JLabel DashHome;
    private javax.swing.JLabel DashUpdateTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
