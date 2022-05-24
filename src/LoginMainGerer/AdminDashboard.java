
package LoginMainGerer;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AdminDashboard extends javax.swing.JFrame {

        public AdminDashboard() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel3 = new javax.swing.JPanel();
                userTab = new javax.swing.JTabbedPane();
                jPanel1 = new javax.swing.JPanel();
                jPanel8 = new javax.swing.JPanel();
                jLabel6 = new javax.swing.JLabel();
                nameInput = new PlaceholderTextField();
                jLabel7 = new javax.swing.JLabel();
                prenomInput = new PlaceholderTextField();
                jLabel8 = new javax.swing.JLabel();
                emailInput = new PlaceholderTextField();
                jLabel9 = new javax.swing.JLabel();
                cinInput = new PlaceholderTextField();
                jLabel10 = new javax.swing.JLabel();
                telInput = new PlaceholderTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                userTable = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                jComboBox1 = new javax.swing.JComboBox<>();
                jLabel2 = new javax.swing.JLabel();
                jComboBox2 = new javax.swing.JComboBox<>();
                validationBtn = new javax.swing.JButton();
                SearchInput = new PlaceholderTextField();
                jPanel2 = new javax.swing.JPanel();
                jPanel4 = new javax.swing.JPanel();
                jPanel5 = new javax.swing.JPanel();
                jPanel6 = new javax.swing.JPanel();
                jPanel7 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel16 = new javax.swing.JLabel();
                jLabel17 = new javax.swing.JLabel();
                jLabel18 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Administration");
                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel8.setBackground(new java.awt.Color(255, 255, 255));

                jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
                jLabel6.setText("Nom");
                nameInput.setPlaceholder("Saisir nom");

                nameInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nameInputActionPerformed(evt);
                        }
                });

                jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
                jLabel7.setText("Prénom");
                prenomInput.setPlaceholder("Saisir prénom");

                prenomInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                prenomInputActionPerformed(evt);
                        }
                });

                jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
                jLabel8.setText("Email");
                emailInput.setPlaceholder("Saisir email");
                emailInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                emailInputActionPerformed(evt);
                        }
                });

                jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
                jLabel9.setText("CIN");
                cinInput.setPlaceholder("Saisir CIN");

                cinInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cinInputActionPerformed(evt);
                        }
                });

                jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
                jLabel10.setText("Tél");
                telInput.setPlaceholder("Saisir tél");

                telInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                telInputActionPerformed(evt);
                        }
                });
                DefaultTableModel model = new DefaultTableModel(new Object[][] {
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null },
                                { null, null, null, null, null }
                },
                                new String[] {
                                                "Nom", "Prénom", "Email", "CIN", "Tél", "Rôle"
                                }) {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                                // all cells false
                                return false;
                        }

                };
                userTable.setModel(model);
                // userTable.setModel(new javax.swing.table.DefaultTableModel(
                // new Object[][] {
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null },
                // { null, null, null, null, null }
                // },
                // new String[] {
                // "Nom", "Prénom", "Email", "CIN", "Tél", "Rôle"
                // }));
                jScrollPane1.setViewportView(userTable);
                userTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                userTableMouseClicked(evt);
                        }
                });
                jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
                jLabel1.setText("Rôle");

                jComboBox1.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Chef Département", "Scolarité", "Administrateur" }));

                jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
                jLabel2.setText("Type d'opération");

                jComboBox2
                                .setModel(new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Ajout", "Modification", "Suppression" }));
                jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox2ActionPerformed(evt);
                        }
                });

                validationBtn.setBackground(new java.awt.Color(0, 51, 51));
                validationBtn.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
                validationBtn.setForeground(new java.awt.Color(255, 255, 255));
                validationBtn.setText("Valider");
                validationBtn.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                validationBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                validationBtnActionPerformed(evt);
                        }
                });

                SearchInput.setForeground(new java.awt.Color(0, 0, 0));
                SearchInput.setPlaceholder("Search");
                SearchInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                SearchInputActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(
                                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                                .addGap(58, 58, 58)
                                                                .addGroup(jPanel8Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(SearchInput,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                141,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel8Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGroup(jPanel8Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel8Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(88, 88, 88)
                                                                                                                                .addGroup(jPanel8Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(jPanel8Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGroup(jPanel8Layout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addComponent(jLabel2)
                                                                                                                                                                                .addComponent(jComboBox2,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                .addGroup(jPanel8Layout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addComponent(jLabel1,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                37,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addComponent(jComboBox1,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                                                .addGroup(jPanel8Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGroup(jPanel8Layout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                                false)
                                                                                                                                                                                .addComponent(jLabel6,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                71,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addComponent(jLabel8,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                71,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addComponent(jLabel10,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                65,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addComponent(nameInput)
                                                                                                                                                                                .addComponent(emailInput)
                                                                                                                                                                                .addComponent(telInput,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                150,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                .addGap(26, 26, 26)
                                                                                                                                                                .addGroup(jPanel8Layout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                                .addComponent(prenomInput,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                150,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addGroup(jPanel8Layout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                .addComponent(jLabel9,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                71,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addComponent(cinInput,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                150,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                .addComponent(jLabel7,
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                71,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                                                                .addGroup(jPanel8Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(158, 200,
                                                                                                                                                200)
                                                                                                                                .addComponent(validationBtn,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                80,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addContainerGap(113, Short.MAX_VALUE)));
                jPanel8Layout.setVerticalGroup(
                                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                                .addGap(36, 36, 36)
                                                                .addComponent(SearchInput,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel8Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                385,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel8Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel8Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel8Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel2)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jComboBox2,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel8Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel1)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jComboBox1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(55, 55, 55)
                                                                                                .addGroup(jPanel8Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel6)
                                                                                                                .addComponent(jLabel7))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel8Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(nameInput,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(prenomInput,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(jPanel8Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel8)
                                                                                                                .addComponent(jLabel9))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel8Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(emailInput,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(cinInput,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel10)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(telInput,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(44, 44, 44)
                                                                                                .addComponent(validationBtn)))
                                                                .addContainerGap(52, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                userTab.addTab("Utilisateur", jPanel1);

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 946, Short.MAX_VALUE));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 501, Short.MAX_VALUE));

                userTab.addTab("Notes", jPanel2);

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 946, Short.MAX_VALUE));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 501, Short.MAX_VALUE));

                userTab.addTab("Accès", jPanel4);

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 946, Short.MAX_VALUE));
                jPanel5Layout.setVerticalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 501, Short.MAX_VALUE));

                userTab.addTab("Spécialité", jPanel5);

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 946, Short.MAX_VALUE));
                jPanel6Layout.setVerticalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 501, Short.MAX_VALUE));

                userTab.addTab("Diplôme", jPanel6);

                jPanel7.setBackground(new java.awt.Color(255, 0, 51));

                jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("Acceuil");
                jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel3MouseClicked(evt);
                        }
                });

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
                jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel18MouseClicked(evt);
                        }
                });

                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logohome.png"))); // NOI18N

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel5)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(jLabel4)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jLabel16)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jLabel17)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                .addContainerGap(722, Short.MAX_VALUE)
                                                                                .addComponent(jLabel18)
                                                                                .addGap(41, 41, 41))));
                jPanel7Layout.setVerticalGroup(
                                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel16)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel17))
                                                                .addGap(18, 18, 18))
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                48, Short.MAX_VALUE)
                                                                .addContainerGap())
                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                .addGap(19, 19, 19)
                                                                                .addComponent(jLabel18)
                                                                                .addContainerGap(19,
                                                                                                Short.MAX_VALUE))));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(userTab)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(jPanel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(userTab)));

                pack();
                this.filltable();
        }// </editor-fold>//GEN-END:initComponents

        private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel18MouseClicked
                // TODO add your handling code here:
                this.dispose();
                new GestionDonneeFrame().setVisible(true);
        }// GEN-LAST:event_jLabel18MouseClicked

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

        private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox2ActionPerformed
                // TODO add your handling code here:
                String operation = jComboBox2.getSelectedItem().toString();

                switch (operation) {
                        case "Ajout":
                                nameInput.setEnabled(true);
                                prenomInput.setEnabled(true);
                                emailInput.setEnabled(true);
                                telInput.setEnabled(true);
                                cinInput.setEnabled(true);
                                jComboBox1.setEnabled(true);
                                break;
                        case "Modification":
                                nameInput.setEnabled(true);
                                prenomInput.setEnabled(true);
                                emailInput.setEnabled(true);
                                telInput.setEnabled(true);
                                cinInput.setEnabled(true);
                                jComboBox1.setEnabled(true);
                                break;

                        case "Suppression":
                                nameInput.setEnabled(false);
                                prenomInput.setEnabled(false);
                                emailInput.setEnabled(false);
                                telInput.setEnabled(false);
                                cinInput.setEnabled(false);
                                jComboBox1.setEnabled(false);
                                break;

                        default:
                                break;
                }
        }// GEN-LAST:event_jComboBox2ActionPerformed

        private void telInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_telInputActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_telInputActionPerformed

        private void cinInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cinInputActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_cinInputActionPerformed

        private void emailInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_emailInputActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_emailInputActionPerformed

        private void prenomInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_prenomInputActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_prenomInputActionPerformed

        private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameInputActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_nameInputActionPerformed

        private void validationBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_validationBtnActionPerformed
                // TODO add your handling code here:
                String operation = jComboBox2.getSelectedItem().toString();
                String name = nameInput.getText();
                String prenom = prenomInput.getText();
                String email = emailInput.getText();
                String tel = telInput.getText();
                String cin = cinInput.getText();
                String role = jComboBox1.getSelectedItem().toString();
                // tilisateur user = new Utilisateur(name, prenom, email, Integer.parseInt(cin),
                // tel, role);
                switch (operation) {
                        case "Ajout":
                                // check if inputs are empty.
                                if (nameInput.getText().isEmpty() || prenomInput.getText().isEmpty()
                                                || emailInput.getText().isEmpty()
                                                || telInput.getText().isEmpty() || cinInput.getText().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
                                        break;
                                }
                                Pattern VALID_EMAIL_ADDRESS_REGEX1 = Pattern
                                                .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                                                                Pattern.CASE_INSENSITIVE);
                                Matcher matcher1 = VALID_EMAIL_ADDRESS_REGEX1.matcher(email);
                                if (!matcher1.find()) {
                                        JOptionPane.showMessageDialog(null, "Email invalide");
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
                                Utilisateur user = new Utilisateur(name, prenom, email, Integer.parseInt(cin), tel,
                                                role);
                                if (user.findByCIN() >= 0) {
                                        JOptionPane.showMessageDialog(null, "CIN existe déjà", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                if (user.findByEmail() >= 0) {
                                        JOptionPane.showMessageDialog(null, "Email existe déjà", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                } else {
                                        user.create();
                                        // clear inputs
                                        nameInput.setText("");
                                        prenomInput.setText("");
                                        emailInput.setText("");
                                        telInput.setText("");
                                        cinInput.setText("");
                                        JOptionPane.showMessageDialog(null, "Utilisateur ajouté avec succès");
                                        this.filltable();
                                        EmailSender.sendEmail(user);// sending email takes time so diplay and then let
                                                                    // it run. Improvement: use a thread.
                                }

                                break;
                        case ("Modification"):
                                // check if inputs empty.
                                if (name.isEmpty() || prenom.isEmpty() || email.isEmpty() || tel.isEmpty()
                                                || cinInput.getText().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
                                        break;
                                }
                                Pattern VALID_EMAIL_ADDRESS_REGEX2 = Pattern
                                                .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                                                                Pattern.CASE_INSENSITIVE);
                                Matcher matcher3 = VALID_EMAIL_ADDRESS_REGEX2.matcher(email);
                                if (!matcher3.find()) {
                                        JOptionPane.showMessageDialog(null, "Email invalide");
                                        break;
                                }
                                Pattern VALID_TEL_REGEX2 = Pattern.compile("^[0-9]{8}$", Pattern.CASE_INSENSITIVE);
                                Matcher matcher4 = VALID_TEL_REGEX2.matcher(tel);
                                if (!matcher4.find()) {
                                        JOptionPane.showMessageDialog(null, "Numéro de téléphone invalide", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                Pattern VALID_CIN_REGEX2 = Pattern.compile("^[0-9]{8}$", Pattern.CASE_INSENSITIVE);
                                if (!VALID_CIN_REGEX2.matcher(cin).find()) {
                                        JOptionPane.showMessageDialog(null, "CIN invalide", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                Utilisateur user1 = new Utilisateur(name, prenom, email, Integer.parseInt(cin), tel,
                                                role);
                                if (user1.findByCIN() < 0 && user1.findByEmail() < 0) {
                                        JOptionPane.showMessageDialog(null, "Cet Utilisateur n'existe pas", "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                        break;
                                }
                                if (user1.findByCIN() >= 0) {
                                        Utilisateur u1 = new Utilisateur();
                                        u1.setID(user1.findByCIN());
                                        u1.read();
                                        System.out.println(u1.toString() + " " + email);
                                        if (!u1.getEmail().equals(email) && user1.findByEmail() >= 0) {

                                                JOptionPane.showMessageDialog(null, "Email existe déjà", "Erreur",
                                                                JOptionPane.ERROR_MESSAGE);
                                                break;
                                        } else {
                                                user1.setID(u1.getID());
                                                user1.update();
                                                JOptionPane.showMessageDialog(null, "Utilisateur modifié avec succès");
                                                break;
                                        }
                                } else if (user1.findByEmail() >= 0) {
                                        Utilisateur u1 = new Utilisateur();
                                        u1.setID(user1.findByEmail());
                                        u1.read();
                                        if (u1.getCIN() != Integer.parseInt(cin) && user1.findByCIN() >= 0) {
                                                JOptionPane.showMessageDialog(null, "CIN existe déjà", "Erreur",
                                                                JOptionPane.ERROR_MESSAGE);
                                                break;
                                        } else {
                                                user1.setID(u1.getID());
                                                user1.update();
                                                JOptionPane.showMessageDialog(null, "Utilisateur modifié avec succès");
                                                nameInput.setText("");
                                                prenomInput.setText("");
                                                emailInput.setText("");
                                                telInput.setText("");
                                                cinInput.setText("");

                                                break;
                                        }
                                        // clear inputs

                                }
                                break;

                        case ("Suppression"):
                                if (name.isEmpty() || prenom.isEmpty() || email.isEmpty() || tel.isEmpty()
                                                || cinInput.getText().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Veuillez séléctionner un utilisateur");
                                        break;
                                }
                                Utilisateur user2 = new Utilisateur(name, prenom, email, Integer.parseInt(cin), tel,
                                                role);
                                Utilisateur u1 = new Utilisateur();
                                u1.setID(user2.findByCIN());
                                u1.read();

                                u1.delete();
                                JOptionPane.showMessageDialog(null, "Utilisateur supprimé avec succès");

                                // clear inputs
                                nameInput.setText("");
                                prenomInput.setText("");
                                emailInput.setText("");
                                telInput.setText("");
                                cinInput.setText("");
                                break;

                        default:
                                break;
                }
                this.filltable();
        }// GEN-LAST:event_validationBtnActionPerformed

        private void SearchInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SearchInputActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_SearchInputActionPerformed

        private void userTableMouseClicked(java.awt.event.MouseEvent evt) {
                if (!jComboBox2.getSelectedItem().equals("Ajout")) {
                        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
                        userTable.getModel();
                        String tblName = model.getValueAt(userTable.getSelectedRow(), 0).toString();
                        String tblPrenom = model.getValueAt(userTable.getSelectedRow(), 1).toString();
                        String tblEmail = model.getValueAt(userTable.getSelectedRow(), 2).toString();
                        String tblCin = model.getValueAt(userTable.getSelectedRow(), 3).toString();
                        String tblTel = model.getValueAt(userTable.getSelectedRow(), 4).toString();
                        String tblRole = model.getValueAt(userTable.getSelectedRow(), 5).toString();
                        nameInput.setText(tblName);
                        prenomInput.setText(tblPrenom);
                        emailInput.setText(tblEmail);
                        cinInput.setText(tblCin);
                        telInput.setText(tblTel);
                        // System.out.println(jComboBox2.getItemAt(2));
                        jComboBox1.setSelectedItem(tblRole);
                }

        }

        public void filltable() {

                Utilisateur u = new Utilisateur();
                List<Object> list = u.findAll();

                DefaultTableModel model = (DefaultTableModel) userTable.getModel();
                model.setRowCount(0);
                for (Object o : list) {
                        Utilisateur u1 = (Utilisateur) o;
                        model.addRow(new Object[] { u1.getNom(), u1.getPrenom(), u1.getEmail(), u1.getCIN(),
                                        u1.getTel(), u1.getRole() });
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
                        java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                AdminDashboard frame = new AdminDashboard();
                                frame.setVisible(true);
                                frame.filltable();
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private PlaceholderTextField SearchInput;
        private PlaceholderTextField cinInput;
        private PlaceholderTextField emailInput;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
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
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JScrollPane jScrollPane1;
        private PlaceholderTextField nameInput;
        private PlaceholderTextField prenomInput;
        private PlaceholderTextField telInput;
        private javax.swing.JTabbedPane userTab;
        private javax.swing.JTable userTable;
        private javax.swing.JButton validationBtn;
        private javax.swing.JOptionPane JOptionPane;
        // End of variables declaration//GEN-END:variables
}
