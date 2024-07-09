
package View;


import View.HomePage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AddFlight extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
   
    public AddFlight() {
        initComponents();
        setResizable(false);
        initializeTableModel();
    }
    
    private void initializeTableModel() {
        String[] columnNames = {"Flight_ID", "Flight_Name", "From", "Destination", "Date", "Arrival_Time", "Departure_Time", "Flight_Price"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };
        jTable1.setModel(tableModel);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Flight_Id_Label = new javax.swing.JLabel();
        Flight_Name_Label = new javax.swing.JLabel();
        From_Label = new javax.swing.JLabel();
        Destination_Label = new javax.swing.JLabel();
        Date_Label = new javax.swing.JLabel();
        Arrival_Time_Label = new javax.swing.JLabel();
        Departure_Time_Label = new javax.swing.JLabel();
        Price_Label = new javax.swing.JLabel();
        flightIdField = new javax.swing.JTextField();
        flightNameField = new javax.swing.JTextField();
        fromLocationField = new javax.swing.JTextField();
        destinationFiled = new javax.swing.JTextField();
        flightDateField = new javax.swing.JTextField();
        departureTimeField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Add_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        Search_Button = new javax.swing.JButton();
        Home_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();
        arrivalTimeField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AirlineReservationSystem");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Add Flight Details");

        Flight_Id_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Flight_Id_Label.setText("Flight ID :");

        Flight_Name_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Flight_Name_Label.setText("Flight Name :");

        From_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        From_Label.setText("From :");

        Destination_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Destination_Label.setText("Destination :");

        Date_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Date_Label.setText("Date :");

        Arrival_Time_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Arrival_Time_Label.setText("Arrival Time :");

        Departure_Time_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Departure_Time_Label.setText("Departure Time :");

        Price_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Price_Label.setText("Price :");

        flightIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightIdFieldActionPerformed(evt);
            }
        });

        flightNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNameFieldActionPerformed(evt);
            }
        });

        fromLocationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromLocationFieldActionPerformed(evt);
            }
        });

        destinationFiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationFiledActionPerformed(evt);
            }
        });

        flightDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightDateFieldActionPerformed(evt);
            }
        });

        departureTimeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureTimeFieldActionPerformed(evt);
            }
        });

        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight_ID", "Flight_Name", "From", "Destination", "Date", "Arrival_Time", "Departure_Time", "Flight_Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Add_Button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Add_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addicon.png"))); // NOI18N
        Add_Button.setText("Add");
        Add_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_ButtonMouseClicked(evt);
            }
        });

        Delete_Button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Delete_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Deleteicon.png"))); // NOI18N
        Delete_Button.setText("Delete");

        Update_Button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Update_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/updateicon.png"))); // NOI18N
        Update_Button.setText("Update");

        Search_Button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Search_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchicon.png"))); // NOI18N
        Search_Button.setText("Search");

        Home_Button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Home_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/homeicon.png"))); // NOI18N
        Home_Button.setText("Home");
        Home_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_ButtonActionPerformed(evt);
            }
        });

        Exit_Button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Exit_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/exiticon.jpg"))); // NOI18N
        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });

        arrivalTimeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrivalTimeFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Arrival_Time_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(arrivalTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Destination_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(destinationFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Date_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(flightDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Flight_Name_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(Flight_Id_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flightIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flightNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(From_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fromLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Departure_Time_Label)
                                .addGap(18, 18, 18)
                                .addComponent(departureTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Price_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Flight_Id_Label)
                            .addComponent(flightIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Flight_Name_Label)
                            .addComponent(flightNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(From_Label)
                            .addComponent(fromLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Destination_Label)
                            .addComponent(destinationFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Date_Label)
                            .addComponent(flightDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Arrival_Time_Label)
                            .addComponent(arrivalTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Departure_Time_Label)
                            .addComponent(departureTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Price_Label)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void flightIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightIdFieldActionPerformed

    private void flightNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNameFieldActionPerformed

    private void fromLocationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromLocationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromLocationFieldActionPerformed

    private void destinationFiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationFiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationFiledActionPerformed

    private void flightDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightDateFieldActionPerformed

    private void departureTimeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureTimeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureTimeFieldActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void Home_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_ButtonActionPerformed
        // TODO add your handling code here:
        HomePage HomePageFrame = new HomePage();
        HomePageFrame.setVisible(true);
        HomePageFrame.pack();
        HomePageFrame.setLocationRelativeTo(HomePageFrame);
        this.dispose();
    }//GEN-LAST:event_Home_ButtonActionPerformed

    private void Add_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_ButtonMouseClicked
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines", "root", "admin123");
            String query = "INSERT INTO flightDetails (flight_id, flight_name, from_location, destination, flight_date, departure_time, arrival_time, price) VALUES (?, ?, ?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, flightIdField.getText());
            ps.setString(2, flightNameField.getText());
            ps.setString(3, fromLocationField.getText());
            ps.setString(4, destinationFiled.getText());
            ps.setString(5, flightDateField.getText());
            ps.setString(6, departureTimeField.getText());
            ps.setString(7, arrivalTimeField.getText());
            ps.setString(8, priceField.getText());


            // Execute the query
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {

                JOptionPane.showMessageDialog(this, "Flight Details added Successfully!", "Main Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Error: Details registration failed.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    
    }//GEN-LAST:event_Add_ButtonMouseClicked

    private void arrivalTimeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrivalTimeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrivalTimeFieldActionPerformed

    
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
        java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            new AddFlight().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JLabel Arrival_Time_Label;
    private javax.swing.JLabel Date_Label;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JLabel Departure_Time_Label;
    private javax.swing.JLabel Destination_Label;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JLabel Flight_Id_Label;
    private javax.swing.JLabel Flight_Name_Label;
    private javax.swing.JLabel From_Label;
    private javax.swing.JButton Home_Button;
    private javax.swing.JLabel Price_Label;
    private javax.swing.JButton Search_Button;
    private javax.swing.JButton Update_Button;
    private javax.swing.JTextField arrivalTimeField;
    private javax.swing.JTextField departureTimeField;
    private javax.swing.JTextField destinationFiled;
    private javax.swing.JTextField flightDateField;
    private javax.swing.JTextField flightIdField;
    private javax.swing.JTextField flightNameField;
    private javax.swing.JTextField fromLocationField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField priceField;
    // End of variables declaration//GEN-END:variables
}
