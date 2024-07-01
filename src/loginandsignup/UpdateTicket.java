
package loginandsignup;


public class UpdateTicket extends javax.swing.JFrame {

    
    public UpdateTicket() {
        initComponents();
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Flight_Id_TextField = new javax.swing.JTextField();
        Flight_Name_TextField = new javax.swing.JTextField();
        Flight_Id_Label = new javax.swing.JLabel();
        Destination_TextField = new javax.swing.JTextField();
        Flight_Name_Label = new javax.swing.JLabel();
        From_TextField = new javax.swing.JTextField();
        From_Label = new javax.swing.JLabel();
        Date_TextField = new javax.swing.JTextField();
        Destination_Label = new javax.swing.JLabel();
        Arrival_Time_TextField = new javax.swing.JTextField();
        Date_Label = new javax.swing.JLabel();
        Departure_Time_TextField = new javax.swing.JTextField();
        Arrival_Time_Label = new javax.swing.JLabel();
        Departure_Time_Label = new javax.swing.JLabel();
        Price_Label = new javax.swing.JLabel();
        Ticket_No_TextField = new javax.swing.JTextField();
        Ticket_No_Label = new javax.swing.JLabel();
        Price_TextField = new javax.swing.JTextField();
        Search_Button = new javax.swing.JButton();
        Customer_Name_Label = new javax.swing.JLabel();
        Contact_No_Label = new javax.swing.JLabel();
        Address_Label = new javax.swing.JLabel();
        Seat_Label = new javax.swing.JLabel();
        Total_Price_Label = new javax.swing.JLabel();
        Total_Price_TextField = new javax.swing.JTextField();
        Customer_Name_TextField = new javax.swing.JTextField();
        Contact_No_TextField = new javax.swing.JTextField();
        Address_TextField = new javax.swing.JTextField();
        Seat_TextField = new javax.swing.JTextField();
        Update_Button = new javax.swing.JButton();
        Home_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AirlineReservationSystem");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("Update Ticket");

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

        Flight_Id_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Flight_Id_Label.setText("Flight ID :");

        Destination_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Destination_TextFieldActionPerformed(evt);
            }
        });

        Flight_Name_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Flight_Name_Label.setText("Flight Name :");

        From_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                From_TextFieldActionPerformed(evt);
            }
        });

        From_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        From_Label.setText("From :");

        Date_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date_TextFieldActionPerformed(evt);
            }
        });

        Destination_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Destination_Label.setText("Destination :");

        Arrival_Time_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Arrival_Time_TextFieldActionPerformed(evt);
            }
        });

        Date_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Date_Label.setText("Date :");

        Departure_Time_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Departure_Time_TextFieldActionPerformed(evt);
            }
        });

        Arrival_Time_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Arrival_Time_Label.setText("Arrival Time :");

        Departure_Time_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Departure_Time_Label.setText("Departure Time :");

        Price_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Price_Label.setText("Price :");

        Ticket_No_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ticket_No_TextFieldActionPerformed(evt);
            }
        });

        Ticket_No_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Ticket_No_Label.setText("Ticket No :");

        Price_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Price_TextFieldActionPerformed(evt);
            }
        });

        Search_Button.setBackground(new java.awt.Color(153, 153, 153));
        Search_Button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Search_Button.setText("Search");

        Customer_Name_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Customer_Name_Label.setText("Customer Name :");

        Contact_No_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Contact_No_Label.setText("Contact No :");

        Address_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Address_Label.setText("Address :");

        Seat_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Seat_Label.setText("Seat :");

        Total_Price_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Total_Price_Label.setText("Total Price :");

        Total_Price_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_Price_TextFieldActionPerformed(evt);
            }
        });

        Customer_Name_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Customer_Name_TextFieldActionPerformed(evt);
            }
        });

        Contact_No_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contact_No_TextFieldActionPerformed(evt);
            }
        });

        Address_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Address_TextFieldActionPerformed(evt);
            }
        });

        Seat_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat_TextFieldActionPerformed(evt);
            }
        });

        Update_Button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Update_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/updateicon.png"))); // NOI18N
        Update_Button.setText("Update");

        Home_Button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Home_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/homeicon.png"))); // NOI18N
        Home_Button.setText("Home");
        Home_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_ButtonActionPerformed(evt);
            }
        });

        Exit_Button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(From_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(From_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Flight_Id_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ticket_No_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Flight_Id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Ticket_No_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(Search_Button))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Flight_Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Flight_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Destination_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Destination_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Date_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Departure_Time_Label)
                                            .addComponent(Arrival_Time_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Price_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Departure_Time_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Arrival_Time_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Price_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Customer_Name_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Contact_No_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Address_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Seat_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Total_Price_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Total_Price_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Customer_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Contact_No_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Address_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Seat_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ticket_No_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ticket_No_Label)
                    .addComponent(Search_Button))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Flight_Id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Flight_Id_Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Flight_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Flight_Name_Label))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(From_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(From_Label))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Destination_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Destination_Label)
                            .addComponent(Customer_Name_Label)
                            .addComponent(Customer_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date_Label)
                            .addComponent(Contact_No_Label)
                            .addComponent(Contact_No_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Arrival_Time_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Arrival_Time_Label)
                            .addComponent(Address_Label)
                            .addComponent(Address_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Departure_Time_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Departure_Time_Label)
                            .addComponent(Seat_Label)
                            .addComponent(Seat_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Price_Label)
                            .addComponent(Price_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Total_Price_Label)
                            .addComponent(Total_Price_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(126, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
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

    private void Flight_Id_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flight_Id_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Flight_Id_TextFieldActionPerformed

    private void Flight_Name_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flight_Name_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Flight_Name_TextFieldActionPerformed

    private void Destination_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Destination_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Destination_TextFieldActionPerformed

    private void From_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_From_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_From_TextFieldActionPerformed

    private void Date_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date_TextFieldActionPerformed

    private void Arrival_Time_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Arrival_Time_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Arrival_Time_TextFieldActionPerformed

    private void Departure_Time_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Departure_Time_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Departure_Time_TextFieldActionPerformed

    private void Ticket_No_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ticket_No_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ticket_No_TextFieldActionPerformed

    private void Price_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Price_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Price_TextFieldActionPerformed

    private void Total_Price_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_Price_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Total_Price_TextFieldActionPerformed

    private void Customer_Name_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Customer_Name_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Customer_Name_TextFieldActionPerformed

    private void Contact_No_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contact_No_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contact_No_TextFieldActionPerformed

    private void Address_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Address_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Address_TextFieldActionPerformed

    private void Seat_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat_TextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address_Label;
    private javax.swing.JTextField Address_TextField;
    private javax.swing.JLabel Arrival_Time_Label;
    private javax.swing.JTextField Arrival_Time_TextField;
    private javax.swing.JLabel Contact_No_Label;
    private javax.swing.JTextField Contact_No_TextField;
    private javax.swing.JLabel Customer_Name_Label;
    private javax.swing.JTextField Customer_Name_TextField;
    private javax.swing.JLabel Date_Label;
    private javax.swing.JTextField Date_TextField;
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
    private javax.swing.JLabel Seat_Label;
    private javax.swing.JTextField Seat_TextField;
    private javax.swing.JLabel Ticket_No_Label;
    private javax.swing.JTextField Ticket_No_TextField;
    private javax.swing.JLabel Total_Price_Label;
    private javax.swing.JTextField Total_Price_TextField;
    private javax.swing.JButton Update_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
