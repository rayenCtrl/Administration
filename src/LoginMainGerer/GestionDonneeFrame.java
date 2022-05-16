
package LoginMainGerer;


public class GestionDonneeFrame extends javax.swing.JFrame {


    public GestionDonneeFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        OperationDrpdwn = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        DepartmentDrpdwn = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        classDrpdwn = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        TypeOpDrpdwn = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        IDinput = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        numInscInput = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        nomInput = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        prenomInput = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        EmailInput = new javax.swing.JFormattedTextField();
        validationBtn = new javax.swing.JButton();
        SearchInput = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        telInput1 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cinInput = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Gestionnaire de Données");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Opération sur:");

        OperationDrpdwn.setForeground(new java.awt.Color(51, 51, 51));
        OperationDrpdwn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Etudiant", "Item 2", "Item 3", "Item 4" }));
        OperationDrpdwn.setToolTipText("");
        OperationDrpdwn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperationDrpdwnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Département:");

        DepartmentDrpdwn.setForeground(new java.awt.Color(51, 51, 51));
        DepartmentDrpdwn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Département IRM", "Item 2", "Item 3", "Item 4" }));
        DepartmentDrpdwn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentDrpdwnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Classe:");

        classDrpdwn.setForeground(new java.awt.Color(51, 51, 51));
        classDrpdwn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IRM 1-1", "Item 2", "Item 3", "Item 4" }));
        classDrpdwn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classDrpdwnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("TypeOpération:");

        TypeOpDrpdwn.setForeground(new java.awt.Color(51, 51, 51));
        TypeOpDrpdwn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modification", "Item 2", "Item 3", "Item 4" }));
        TypeOpDrpdwn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeOpDrpdwnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("ID Elément:");

        IDinput.setForeground(new java.awt.Color(153, 153, 153));
        IDinput.setText("taper ID de l'element");
        IDinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDinputActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Num Insc");

        numInscInput.setForeground(new java.awt.Color(153, 153, 153));
        numInscInput.setText("Laisser vide pour ne pas modifier");
        numInscInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numInscInputActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Nom");

        nomInput.setForeground(new java.awt.Color(153, 153, 153));
        nomInput.setText("Laisser vide pour ne pas modifier");
        nomInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomInputActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Prénom");

        prenomInput.setForeground(new java.awt.Color(153, 153, 153));
        prenomInput.setText("Laisser vide pour ne pas modifier");
        prenomInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomInputActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Email");

        EmailInput.setForeground(new java.awt.Color(153, 153, 153));
        EmailInput.setText("Laisser vide pour ne pas modifier");
        EmailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailInputActionPerformed(evt);
            }
        });

        validationBtn.setBackground(new java.awt.Color(0, 102, 51));
        validationBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        validationBtn.setForeground(new java.awt.Color(255, 255, 255));
        validationBtn.setText("Valider");
        validationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validationBtnActionPerformed(evt);
            }
        });

        SearchInput.setForeground(new java.awt.Color(153, 153, 153));
        SearchInput.setText("Search");
        SearchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchInputActionPerformed(evt);
            }
        });

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(21167), "Rio", "Hunter", "r.hun21167@pi.tn",  new Integer(124578963),  new Integer(22159487)},
                { new Integer(19019), "Khalilo", "Kremlin", "k.k19019@pi.tn",  new Integer(123456789),  new Integer(55136879)},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Num Insc", "Nom", "Prénom", "Email", "CIN", "Tél"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(searchTable);

        jLabel2.setText("Tél");

        telInput1.setForeground(new java.awt.Color(153, 153, 153));
        telInput1.setText("Laisser vide pour ne pas modifier");
        telInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telInput1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logohome.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Acceuil");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Etudiants");

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Enseignants");

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Notes et Resultats");

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Gestionnaire de Données");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addComponent(jLabel16)
                .addGap(47, 47, 47)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setText("CIN");

        cinInput.setForeground(new java.awt.Color(153, 153, 153));
        cinInput.setText("Laisser vide pour ne pas modifier");
        cinInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TypeOpDrpdwn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(OperationDrpdwn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(63, 63, 63)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(IDinput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DepartmentDrpdwn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prenomInput, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(47, 47, 47)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(classDrpdwn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(408, 408, 408)
                            .addComponent(validationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(numInscInput, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(9, 9, 9)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cinInput, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGap(69, 69, 69)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nomInput, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(telInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(240, 240, 240)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OperationDrpdwn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(DepartmentDrpdwn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(classDrpdwn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TypeOpDrpdwn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(IDinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prenomInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numInscInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(validationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(SearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cinInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinInputActionPerformed

    private void OperationDrpdwnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_OperationDrpdwnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_OperationDrpdwnActionPerformed

    private void DepartmentDrpdwnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DepartmentDrpdwnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_DepartmentDrpdwnActionPerformed

    private void classDrpdwnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_classDrpdwnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_classDrpdwnActionPerformed

    private void TypeOpDrpdwnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TypeOpDrpdwnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_TypeOpDrpdwnActionPerformed

    private void IDinputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_IDinputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_IDinputActionPerformed

    private void numInscInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_numInscInputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_numInscInputActionPerformed

    private void nomInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nomInputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_nomInputActionPerformed

    private void prenomInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_prenomInputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_prenomInputActionPerformed

    private void EmailInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EmailInputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_EmailInputActionPerformed

    private void classInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_classInputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_classInputActionPerformed

    private void SearchInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SearchInputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_SearchInputActionPerformed

    private void validationBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_validationBtnActionPerformed
        // TODO add your handling code here:
        // get selected operation and store it in a variable
        // System.out.println("Operation : " + OperationDrpdwn.getSelectedItem());
        String operation = (String) TypeOpDrpdwn.getSelectedItem();
        switch (operation) {
            case "Ajout":
                // get inputs
                String nom = nomInput.getText();
                String prenom = prenomInput.getText();
                String numInsc = numInscInput.getText();
                String email = EmailInput.getText();
                Etudiant etudiant = new Etudiant();
                etudiant.setNom(nom);
                etudiant.setPrenom(prenom);
                etudiant.setNum_insc(Integer.parseInt(numInsc));
                etudiant.setEmail(email);

                // check if inputs are empty
                if (nom.isEmpty() || prenom.isEmpty() || numInsc.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "Erreur",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    // check if the student already exists
                    if (etudiant.findByNum_insc() >= 0) {
                        JOptionPane.showMessageDialog(null, "Cet étudiant existe déjà", "Erreur",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    // check if email already used
                    else if (etudiant.findByEmail() >= 0) {
                        JOptionPane.showMessageDialog(null, "Cet email existe déjà", "Erreur",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        // create student
                        System.out.println(etudiant.create());
                        // clear inputs
                        nomInput.setText("");
                        prenomInput.setText("");
                        numInscInput.setText("");
                        EmailInput.setText("");
                        JOptionPane.showMessageDialog(null, "L'étudiant a été ajouté avec succès", "Succès",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                }

                break;
            case "Modification":
                // get inputs
                String nom2 = nomInput.getText();
                String prenom2 = prenomInput.getText();
                String numInsc2 = numInscInput.getText();
                String email2 = EmailInput.getText();
                int id = Integer.parseInt(IDinput.getText());
                Etudiant etudiant2 = new Etudiant();
                etudiant2.setNom(nom2);
                etudiant2.setPrenom(prenom2);
                etudiant2.setNum_insc(Integer.parseInt(numInsc2));
                etudiant2.setEmail(email2);

                // check if inputs are empty
                if (nom2.isEmpty() || prenom2.isEmpty() || numInsc2.isEmpty() || email2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "Erreur",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    // check if the student already exists
                    if (etudiant2.findByNum_insc() >= 0) {
                        JOptionPane.showMessageDialog(null, "Cet étudiant existe déjà", "Erreur",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    // check if email already used
                    else if (etudiant2.findByEmail() >= 0) {
                        JOptionPane.showMessageDialog(null, "Cet email existe déjà", "Erreur",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        // update student
                        Etudiant etudiant3 = new Etudiant();
                        // etudiant is a personne
                        etudiant3.setId(id);
                        etudiant3.update(etudiant2);

                        // clear inputs
                        nomInput.setText("");
                        prenomInput.setText("");
                        numInscInput.setText("");
                        EmailInput.setText("");
                        JOptionPane.showMessageDialog(null, "L'étudiant a été modifié avec succès", "Succès",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                break;
            case "Suppression":
                // check if id is empty
                if (IDinput.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Veuillez remplir le champ ID ou selectionner l'élément à supprimer", "Erreur",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    // get id
                    int id2 = Integer.parseInt(IDinput.getText());
                    // delete student
                    Etudiant etudiant4 = new Etudiant();
                    etudiant4.setId(id2);
                    etudiant4.delete();
                    // clear inputs
                    nomInput.setText("");
                    prenomInput.setText("");
                    numInscInput.setText("");
                    EmailInput.setText("");
                    IDinput.setText("");
                    JOptionPane.showMessageDialog(null, "L'étudiant a été supprimé avec succès", "Succès",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            default:
                break;
        }

    }// GEN-LAST:event_validationBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionDonneeFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDonneeFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDonneeFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDonneeFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDonneeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DepartmentDrpdwn;
    private javax.swing.JFormattedTextField EmailInput;
    private javax.swing.JFormattedTextField IDinput;
    private javax.swing.JComboBox<String> OperationDrpdwn;
    private javax.swing.JFormattedTextField SearchInput;
    private javax.swing.JComboBox<String> TypeOpDrpdwn;
    private javax.swing.JFormattedTextField cinInput;
    private javax.swing.JComboBox<String> classDrpdwn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField nomInput;
    private javax.swing.JFormattedTextField numInscInput;
    private javax.swing.JFormattedTextField prenomInput;
    private javax.swing.JTable searchTable;
    private javax.swing.JFormattedTextField telInput1;
    private javax.swing.JButton validationBtn;
    // End of variables declaration//GEN-END:variables
}
