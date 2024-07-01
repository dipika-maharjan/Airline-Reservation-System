
package loginandsignup;


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
        Flight_Id_TextField = new javax.swing.JTextField();
        Flight_Name_TextField = new javax.swing.JTextField();
        From_TextField = new javax.swing.JTextField();
        Destination_TextField = new javax.swing.JTextField();
        Arrival_Time_TextField = new javax.swing.JTextField();
        Departure_Time_TextField = new javax.swing.JTextField();
        Price_TextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Add_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        Search_Button = new javax.swing.JButton();
        Home_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();
        DateChooser = new com.toedter.calendar.JDateChooser();

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

        Flight_Id_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flight_Id_TextFieldActionPerformed(evt);
            }
        });

        Flight_Name_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flight_Name_TextFieldActionPerformed(evt);
            }
        });

        From_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                From_TextFieldActionPerformed(evt);
            }
        });

        Destination_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Destination_TextFieldActionPerformed(evt);
            }
        });

        Arrival_Time_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Arrival_Time_TextFieldActionPerformed(evt);
            }
        });

        Departure_Time_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Departure_Time_TextFieldActionPerformed(evt);
            }
        });

        Price_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Price_TextFieldActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Arrival_Time_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Arrival_Time_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Destination_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Destination_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Date_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Flight_Name_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(Flight_Id_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Flight_Id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Flight_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(From_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(From_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Departure_Time_Label)
                                .addGap(18, 18, 18)
                                .addComponent(Departure_Time_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Price_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Price_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(Flight_Id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Flight_Name_Label)
                            .addComponent(Flight_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(From_Label)
                            .addComponent(From_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Destination_Label)
                            .addComponent(Destination_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Date_Label)
                            .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Arrival_Time_Label)
                            .addComponent(Arrival_Time_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Departure_Time_Label)
                            .addComponent(Departure_Time_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Price_Label)
                            .addComponent(Price_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void Flight_Id_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flight_Id_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Flight_Id_TextFieldActionPerformed

    private void Flight_Name_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flight_Name_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Flight_Name_TextFieldActionPerformed

    private void From_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_From_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_From_TextFieldActionPerformed

    private void Destination_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Destination_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Destination_TextFieldActionPerformed

    private void Arrival_Time_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Arrival_Time_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Arrival_Time_TextFieldActionPerformed

    private void Departure_Time_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Departure_Time_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Departure_Time_TextFieldActionPerformed

    private void Price_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Price_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Price_TextFieldActionPerformed

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
            public void run() {
                new AddFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JLabel Arrival_Time_Label;
    private javax.swing.JTextField Arrival_Time_TextField;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JLabel Date_Label;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JLabel Departure_Time_Label;
    private javax.swing.JTextField Departure_Time_TextField;
    private javax.swing.JLabel Destination_Label;
    private javax.swing.JTextField Destination_TextField;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JLabel Flight_Id_Label;
    private javax.swing.JTextField Flight_Id_TextField;
    private javax.swing.JLabel Flight_Name_Label;
    private javax.swing.JTextField Flight_Name_TextField;
    private javax.swing.JLabel From_Label;
    private javax.swing.JTextField From_TextField;
    private javax.swing.JButton Home_Button;
    private javax.swing.JLabel Price_Label;
    private javax.swing.JTextField Price_TextField;
    private javax.swing.JButton Search_Button;
    private javax.swing.JButton Update_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
