
package LoginMainGerer;

import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GestionDonneeFrame extends javax.swing.JFrame {

        public GestionDonneeFrame() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
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
                jLabel11 = new javax.swing.JLabel();
                numInscInput = new PlaceholderTextField("");
                jLabel12 = new javax.swing.JLabel();
                nomInput = new PlaceholderTextField("");
                jLabel13 = new javax.swing.JLabel();
                EmailInput = new PlaceholderTextField("");
                jLabel14 = new javax.swing.JLabel();
                prenomInput = new PlaceholderTextField();
                validationBtn = new javax.swing.JButton();
                SearchInput = new PlaceholderTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                searchTable = new javax.swing.JTable();
                jLabel2 = new javax.swing.JLabel();
                telInput1 = new PlaceholderTextField("");
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel16 = new javax.swing.JLabel();
                jLabel17 = new javax.swing.JLabel();
                jLabel18 = new javax.swing.JLabel();
                jLabel19 = new javax.swing.JLabel();
                cinInput = new PlaceholderTextField("");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Gestionaire des données");

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

                jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel5.setText("Gestionnaire de Données");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel6.setText("Opération sur:");

                OperationDrpdwn.setForeground(new java.awt.Color(51, 51, 51));
                OperationDrpdwn.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Etudiant", "Enseignants", "Matières", "Notes" }));
                OperationDrpdwn.setToolTipText("");
                OperationDrpdwn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                OperationDrpdwnActionPerformed(evt);
                        }
                });

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel7.setText("Département:");

                DepartmentDrpdwn.setForeground(new java.awt.Color(51, 51, 51));
                DepartmentDrpdwn.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Département IRM", "Département Méca", "Département Indus" }));
                DepartmentDrpdwn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                DepartmentDrpdwnActionPerformed(evt);
                        }
                });

                jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel8.setText("Classe:");

                classDrpdwn.setForeground(new java.awt.Color(51, 51, 51));
                classDrpdwn.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "IRM 1-1", "IRM 1-2", "IRM 1-3" }));
                classDrpdwn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                classDrpdwnActionPerformed(evt);
                        }
                });

                jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel9.setText("TypeOpération:");

                TypeOpDrpdwn.setForeground(new java.awt.Color(51, 51, 51));
                TypeOpDrpdwn.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Ajout", "Modification", "Suppression" }));
                TypeOpDrpdwn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                TypeOpDrpdwnActionPerformed(evt);
                        }
                });

                jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel11.setText("Num Insc");

                numInscInput.setForeground(new java.awt.Color(0, 0, 0));
                numInscInput.setPlaceholder("Saisir le numéro d'inscription");
                numInscInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                numInscInputActionPerformed(evt);
                        }
                });

                jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel12.setText("Nom");

                nomInput.setForeground(new java.awt.Color(0, 0, 0));
                nomInput.setPlaceholder("Saisir le nom");
                nomInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nomInputActionPerformed(evt);
                        }
                });

                jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel13.setText("Prénom");

                EmailInput.setForeground(new java.awt.Color(0, 0, 0));
                EmailInput.setPlaceholder("Saisir l'email");
                EmailInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                EmailInputActionPerformed(evt);
                        }
                });

                jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel14.setText("Email");

                prenomInput.setForeground(new java.awt.Color(0, 0, 0));
                prenomInput.setPlaceholder("Saisir le prénom");
                prenomInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                prenomInputActionPerformed(evt);
                        }
                });

                validationBtn.setBackground(new java.awt.Color(0, 51, 51));
                validationBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
                validationBtn.setForeground(new java.awt.Color(255, 255, 255));
                validationBtn.setText("Valider");
                validationBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                validationBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                validationBtnActionPerformed(evt);
                        }
                });

                SearchInput.setForeground(new java.awt.Color(0, 0, 0));
                SearchInput.setText("Search");
                SearchInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                SearchInputActionPerformed(evt);
                        }
                });
                DefaultTableModel modell = new DefaultTableModel(new Object[][] {
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null },
                                { null, null, null, null, null, null }
                },
                                new String[] {
                                                "Num Insc", "Nom", "Prénom", "Email", "CIN", "Tél"
                                }) {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                                return false;
                        }
                };
                searchTable.setModel(modell);
                // searchTable.setModel(new javax.swing.table.DefaultTableModel(
                // new Object[][] {
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null },
                // { null, null, null, null, null, null }
                // },
                // new String[] {
                // "Num Insc", "Nom", "Prénom", "Email", "CIN", "Tél"
                // }) {
                // Class[] types = new Class[] {
                // java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
                // java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
                // };

                // public Class getColumnClass(int columnIndex) {
                // return types[columnIndex];
                // }
                // });
                searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                searchTableMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(searchTable);

                jLabel2.setText("Tél");

                telInput1.setForeground(new java.awt.Color(0, 0, 0));
                telInput1.setPlaceholder("Saisir le numéro de téléphone");
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
                jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel3MouseClicked(evt);
                        }
                });
                // jLabel3.addActionListener()

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
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel18)
                                                                .addGap(48, 48, 48)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel1)
                                                                .addGap(25, 25, 25))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel16)
                                                                                .addComponent(jLabel17)
                                                                                .addComponent(jLabel18))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                jLabel19.setText("CIN");

                cinInput.setForeground(new java.awt.Color(0, 0, 0));
                cinInput.setPlaceholder("Saisir le CIN");
                cinInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cinInputActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(408, 408, 408)
                                                                                                .addComponent(validationBtn,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                92,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(112, 112, 112)
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                315,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(99, 99, 99)
                                                                                                .addComponent(jSeparator1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                705,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(44, 44, 44)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                839,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(SearchInput,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                141,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addGap(74, 74, 74)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel14,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                43,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(jLabel11,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                68,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(numInscInput,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                188,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(EmailInput,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                188,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(28, 28, 28)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(cinInput,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                188,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel19,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                43,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGap(51, 51, 51)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(telInput1,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                188,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel2,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                37,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel12,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                43,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(nomInput,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                188,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGap(51, 51, 51)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(prenomInput,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                188,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel13,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                63,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                7,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jLabel9,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel6,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(TypeOpDrpdwn,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(OperationDrpdwn,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                93,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(63, 63, 63)
                                                                                                .addComponent(jLabel7)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(DepartmentDrpdwn,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel8,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                52,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(12, 12, 12)))
                                                                .addComponent(classDrpdwn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                86,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(177, 177, 177)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                55,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(40, 40, 40)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSeparator1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                10,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(60, 60, 60)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                26,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(OperationDrpdwn,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(DepartmentDrpdwn,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(classDrpdwn,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(61, 61, 61)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel9)
                                                                                .addComponent(TypeOpDrpdwn,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel13,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                20,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel12)
                                                                                .addComponent(jLabel11))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(numInscInput,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(nomInput,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(prenomInput,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel19)
                                                                                .addComponent(jLabel14))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(telInput1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(cinInput,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(EmailInput,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(89, 89, 89)
                                                                .addComponent(validationBtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(SearchInput,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                275,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(47, 47, 47)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
                this.fillTable();
        }// </editor-fold>//GEN-END:initComponents

        private void telInput1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_telInput1ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_telInput1ActionPerformed

        private void cinInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cinInputActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_cinInputActionPerformed

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
                String operation = (String) TypeOpDrpdwn.getSelectedItem();
                String element = (String) OperationDrpdwn.getSelectedItem();
                switch (operation) {
                        case "Ajout":
                                // IDinput.setEnabled(false);
                                // IDinput.setPlaceholder("");
                                nomInput.setEnabled(true);
                                nomInput.setPlaceholder("Saisir le nom");
                                EmailInput.setEnabled(true);
                                EmailInput.setPlaceholder("Saisir le prénom ");
                                telInput1.setEnabled(true);
                                telInput1.setPlaceholder("Saisir le numéro de téléphone");
                                cinInput.setEnabled(true);
                                cinInput.setPlaceholder("Saisir le CIN");
                                prenomInput.setEnabled(true);
                                prenomInput.setPlaceholder("Saisir l'email");
                                numInscInput.setEnabled(true);
                                numInscInput.setPlaceholder("Saisir le numéro d'inscription");
                                break;
                        case "Modification":

                                nomInput.setEnabled(true);
                                nomInput.setPlaceholder("Saisir le nom");
                                EmailInput.setEnabled(true);
                                EmailInput.setPlaceholder("Saisir le prénom ");
                                telInput1.setEnabled(true);
                                telInput1.setPlaceholder("Saisir le numéro de téléphone");
                                cinInput.setEnabled(true);
                                cinInput.setPlaceholder("Saisir le CIN");
                                prenomInput.setEnabled(true);
                                prenomInput.setPlaceholder("Saisir l'email");
                                numInscInput.setEnabled(true);
                                numInscInput.setPlaceholder("Saisir le numéro d'inscription");
                                break;
                        case "Suppression":

                                nomInput.setEnabled(false);
                                nomInput.setPlaceholder("");
                                EmailInput.setEnabled(false);
                                EmailInput.setPlaceholder("");
                                telInput1.setEnabled(false);
                                telInput1.setPlaceholder("");
                                cinInput.setEnabled(false);
                                cinInput.setPlaceholder("");
                                prenomInput.setEnabled(false);
                                prenomInput.setPlaceholder("");
                                numInscInput.setEnabled(false);
                                numInscInput.setPlaceholder("");
                                break;

                        default:
                                break;
                }
        }// GEN-LAST:event_TypeOpDrpdwnActionPerformed

        private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel3MouseClicked
                // TODO add your handling code here:
                this.dispose();
                if (DBConnection.getUserr().getRole().equals("Administrateur")) {
                        new AdminHomeFrame().setVisible(true);
                } else if (DBConnection.getUserr().getRole().equals("Chef Département")) {
                        new ChefHomeFrame().setVisible(true);
                } else {
                        new StaffMainFrame().setVisible(true);
                }
        }// GEN-LAST:event_jLabel3MouseClicked

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

        private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {

                if (!TypeOpDrpdwn.getSelectedItem().equals("Ajout")) {
                        DefaultTableModel tblModel = (DefaultTableModel) searchTable.getModel();
                        String tblName = tblModel.getValueAt(searchTable.getSelectedRow(), 1).toString();
                        String tblPrenom = tblModel.getValueAt(searchTable.getSelectedRow(), 2).toString();
                        String tblTel = tblModel.getValueAt(searchTable.getSelectedRow(), 5).toString();
                        String tblCin = tblModel.getValueAt(searchTable.getSelectedRow(), 4).toString();
                        String tblEmail = tblModel.getValueAt(searchTable.getSelectedRow(), 3).toString();
                        String tblNumInsc = tblModel.getValueAt(searchTable.getSelectedRow(), 0).toString();

                        nomInput.setText(tblName);
                        EmailInput.setText(tblEmail);
                        telInput1.setText(tblTel);
                        cinInput.setText(tblCin);
                        prenomInput.setText(tblPrenom);
                        numInscInput.setText(tblNumInsc);
                }

        }

        private void validationBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_validationBtnActionPerformed
                // TODO add your handling code here:
                // get selected operation and store it in a variable
                // System.out.println("Operation : " + OperationDrpdwn.getSelectedItem());
                String operation = (String) TypeOpDrpdwn.getSelectedItem();
                switch (operation) {
                        case "Ajout":
                                // get inputs
                                String nom = nomInput.getText();
                                String email = EmailInput.getText();
                                String numInsc = numInscInput.getText();
                                String prenom = prenomInput.getText();
                                String tel = telInput1.getText();
                                String cin = cinInput.getText();
                                Etudiant etudiant = new Etudiant();
                                System.out.println(email);

                                // check if inputs are empty
                                if (nom.isEmpty() || prenom.isEmpty() || numInsc.isEmpty() || email.isEmpty()
                                                || tel.isEmpty() || cin.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs",
                                                        "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                Pattern VALID_EMAIL_ADDRESS_REGEX1 = Pattern
                                                .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                                                                Pattern.CASE_INSENSITIVE);
                                Matcher matcher1 = VALID_EMAIL_ADDRESS_REGEX1.matcher(email);
                                if (!matcher1.find()) {
                                        JOptionPane.showMessageDialog(null, "Email invalide", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                Pattern VALID_TEL_REGEX1 = Pattern.compile("^[0-9]{8}$", Pattern.CASE_INSENSITIVE);
                                Matcher matcher2 = VALID_TEL_REGEX1.matcher(tel);
                                if (!matcher2.find()) {
                                        JOptionPane.showMessageDialog(null, "Numéro de téléphone invalide", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                Pattern VALID_CIN_REGEX1 = Pattern.compile("^[0-9]{8}$", Pattern.CASE_INSENSITIVE);
                                if (!VALID_CIN_REGEX1.matcher(cin).find()) {
                                        JOptionPane.showMessageDialog(null, "CIN invalide", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                etudiant.setNom(nom);
                                etudiant.setPrenom(prenom);
                                etudiant.setNum_insc(Integer.parseInt(numInsc));
                                etudiant.setEmail(email);
                                etudiant.setTel(tel);
                                etudiant.setCIN(Integer.parseInt(cin));

                                // check if the student already exists
                                if (etudiant.findByNum_insc() >= 0) {
                                        JOptionPane.showMessageDialog(null, "Cet étudiant existe déjà",
                                                        "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                // check if email already used
                                if (etudiant.findByEmail() >= 0) {
                                        JOptionPane.showMessageDialog(null, "Cet email existe déjà", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                if (etudiant.findByCIN() >= 0) {
                                        JOptionPane.showMessageDialog(null, "Ce CIN existe déjà", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }

                                else {
                                        // create student
                                        System.out.println(etudiant.create());
                                        // clear inputs
                                        nomInput.setText("");
                                        EmailInput.setText("");
                                        numInscInput.setText("");
                                        prenomInput.setText("");
                                        telInput1.setText("");
                                        cinInput.setText("");

                                        JOptionPane.showMessageDialog(null,
                                                        "L'étudiant a été ajouté avec succès", "Succès",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                        // this.fillTable();
                                }

                                break;
                        case "Modification":
                                // get inputs
                                String nom1 = nomInput.getText();
                                String prenom1 = prenomInput.getText();
                                String numInsc1 = numInscInput.getText();
                                String email1 = EmailInput.getText();
                                String tel1 = telInput1.getText();
                                String cin1 = cinInput.getText();
                                Etudiant etudiant1 = new Etudiant();

                                // check if inputs are empty
                                if (nom1.isEmpty() || prenom1.isEmpty() || numInsc1.isEmpty() || email1.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs",
                                                        "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                // check if email is valid
                                Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern
                                                .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                                                                Pattern.CASE_INSENSITIVE);
                                Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email1);
                                if (!matcher.find()) {
                                        System.out.println("Email invalide " + email1);
                                        JOptionPane.showMessageDialog(null, "Email invalide", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                // check if tel is valid
                                Pattern VALID_TEL_REGEX = Pattern.compile("^[0-9]{8}$", Pattern.CASE_INSENSITIVE);
                                if (!VALID_TEL_REGEX.matcher(tel1).find()) {
                                        JOptionPane.showMessageDialog(null, "Numéro de téléphone invalide", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                // check if cin is valid
                                Pattern VALID_CIN_REGEX = Pattern.compile("^[0-9]{8}$", Pattern.CASE_INSENSITIVE);
                                if (!VALID_CIN_REGEX.matcher(cin1).find()) {
                                        JOptionPane.showMessageDialog(null, "CIN invalide", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                etudiant1.setNom(nom1);
                                etudiant1.setPrenom(prenom1);
                                etudiant1.setNum_insc(Integer.parseInt(numInsc1));
                                etudiant1.setEmail(email1);
                                etudiant1.setTel(tel1);
                                etudiant1.setCIN(Integer.parseInt(cin1));
                                // check if the student already exists
                                if (etudiant1.findByNum_insc() < 0 && etudiant1.findByEmail() < 0
                                                && etudiant1.findByCIN() < 0) {
                                        JOptionPane.showMessageDialog(null, "Cet étudiant n'existe pas!", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;

                                }
                                if (etudiant1.findByCIN() >= 0) {
                                        Etudiant etudiant2 = new Etudiant();
                                        etudiant2.setID(etudiant1.findByCIN());
                                        etudiant2.read();
                                        System.out.println("hello " + etudiant1.toString());
                                        System.out.println("hello " + etudiant1.findByCIN());
                                        System.out.println("hello " + etudiant2.toString());
                                        if (etudiant2.getNum_insc() != etudiant1.getNum_insc()
                                                        && etudiant1.findByNum_insc() >= 0) {
                                                JOptionPane.showMessageDialog(null,
                                                                "Ce numéro d'inscription est déjà utilisé par un autre étudiant",
                                                                "Erreur",
                                                                JOptionPane.ERROR_MESSAGE);

                                        } else if (!etudiant2.getEmail().equals(etudiant1.getEmail())
                                                        && etudiant1.findByEmail() >= 0) {
                                                JOptionPane.showMessageDialog(null,
                                                                "Cet email est déjà utilisé par un autre étudiant",
                                                                "Erreur",
                                                                JOptionPane.ERROR_MESSAGE);
                                        } else {
                                                etudiant1.setID(etudiant2.getID());
                                                etudiant1.update();
                                                JOptionPane.showMessageDialog(null,
                                                                "L'étudiant a été modifié avec succès", "Succès",
                                                                JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        break;
                                } else if (etudiant1.findByNum_insc() >= 0) {
                                        Etudiant etudiant2 = new Etudiant();
                                        etudiant2.setID(etudiant1.findByNum_insc());
                                        etudiant2.read();
                                        if (etudiant2.getCIN() != etudiant1.getCIN()
                                                        && etudiant1.findByCIN() >= 0) {
                                                JOptionPane.showMessageDialog(null,
                                                                "Ce CIN est déjà utilisé par un autre étudiant",
                                                                "Erreur",
                                                                JOptionPane.ERROR_MESSAGE);
                                        } else if (!etudiant2.getEmail().equals(etudiant1.getEmail())
                                                        && etudiant1.findByEmail() >= 0) {
                                                JOptionPane.showMessageDialog(null,
                                                                "Cet email est déjà utilisé par un autre étudiant",
                                                                "Erreur",
                                                                JOptionPane.ERROR_MESSAGE);
                                        } else {
                                                etudiant1.setID(etudiant2.getID());
                                                etudiant1.update();
                                                JOptionPane.showMessageDialog(null,
                                                                "L'étudiant a été modifié avec succès", "Succès",
                                                                JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        break;
                                } else if (etudiant1.findByEmail() >= 0) {
                                        Etudiant etudiant2 = new Etudiant();
                                        etudiant2.setID(etudiant1.findByEmail());
                                        etudiant2.read();
                                        if (etudiant2.getCIN() != etudiant1.getCIN()
                                                        && etudiant1.findByCIN() >= 0) {
                                                JOptionPane.showMessageDialog(null,
                                                                "Ce CIN est déjà utilisé par un autre étudiant",
                                                                "Erreur",
                                                                JOptionPane.ERROR_MESSAGE);
                                        } else if (etudiant2.getNum_insc() != etudiant1.getNum_insc()
                                                        && etudiant1.findByNum_insc() >= 0) {
                                                JOptionPane.showMessageDialog(null,
                                                                "Ce numéro d'inscription est déjà utilisé par un autre étudiant",
                                                                "Erreur",
                                                                JOptionPane.ERROR_MESSAGE);
                                        } else {
                                                etudiant1.setID(etudiant2.getID());
                                                etudiant1.update();
                                                JOptionPane.showMessageDialog(null,
                                                                "L'étudiant a été modifié avec succès", "Succès",
                                                                JOptionPane.INFORMATION_MESSAGE);
                                                nomInput.setText("");
                                                EmailInput.setText("");
                                                numInscInput.setText("");
                                                cinInput.setText("");
                                                prenomInput.setText("");
                                                telInput1.setText("");
                                        }
                                }
                                // clear the fields
                                nomInput.setText("");
                                EmailInput.setText("");
                                numInscInput.setText("");
                                cinInput.setText("");
                                prenomInput.setText("");
                                telInput1.setText("");
                                // this.fillTable();

                                break;
                        case "Suppression":
                                if (numInscInput.getText().equals("")) {
                                        JOptionPane.showMessageDialog(null, "Veuillez séléctioner un étudiant",
                                                        "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                Etudiant e = new Etudiant();
                                e.setNum_insc(Integer.parseInt(numInscInput.getText()));
                                e.setID(e.findByNum_insc());

                                e.delete();
                                JOptionPane.showMessageDialog(null, "L'étudiant a été supprimé avec succès",
                                                "Succès", JOptionPane.INFORMATION_MESSAGE);
                                // clear the fields
                                nomInput.setText("");
                                EmailInput.setText("");
                                numInscInput.setText("");
                                cinInput.setText("");
                                prenomInput.setText("");
                                telInput1.setText("");
                                // update table
                                // this.fillTable();
                                break;

                        default:
                                break;
                }
                this.fillTable();

        }// GEN-LAST:event_validationBtnActionPerformed

        public void fillTable() {
                // get all students
                Etudiant etudiant = new Etudiant();
                List<Object> etudiants = etudiant.findAll();
                // fill table
                DefaultTableModel model = (DefaultTableModel) searchTable.getModel();
                model.setRowCount(0);
                for (Object etudiant1 : etudiants) {
                        Etudiant etudiant2 = (Etudiant) etudiant1;
                        System.out.println(etudiant2.toString());
                        model.addRow(new Object[] { etudiant2.getNum_insc(), etudiant2.getNom(), etudiant2.getPrenom(),
                                        etudiant2.getEmail(), etudiant2.getCIN(), etudiant2.getTel() });
                }
        }

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
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(GestionDonneeFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(GestionDonneeFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(GestionDonneeFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(GestionDonneeFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                GestionDonneeFrame frame = new GestionDonneeFrame();
                                frame.setVisible(true);

                                frame.fillTable();
                        }
                });

        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox<String> DepartmentDrpdwn;
        private PlaceholderTextField EmailInput;
        private javax.swing.JComboBox<String> OperationDrpdwn;
        private PlaceholderTextField SearchInput;
        private javax.swing.JComboBox<String> TypeOpDrpdwn;
        private PlaceholderTextField cinInput;
        private javax.swing.JComboBox<String> classDrpdwn;
        private javax.swing.JLabel jLabel1;
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
        private PlaceholderTextField nomInput;
        private PlaceholderTextField numInscInput;
        private PlaceholderTextField prenomInput;
        private javax.swing.JTable searchTable;
        private PlaceholderTextField telInput1;
        private javax.swing.JButton validationBtn;
        private javax.swing.JOptionPane JOptionPane;
        // End of variables declaration//GEN-END:variables
}
// hello rayen