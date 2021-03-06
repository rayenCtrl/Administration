
package LoginMainGerer;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Frame;

public class AdminHomeFrame extends javax.swing.JFrame {

        public AdminHomeFrame() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                bg = new javax.swing.JPanel();
                GestionBtn = new javax.swing.JButton();
                EspaceEtudPanel = new javax.swing.JPanel();
                jLabel9 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                CalendrierPanel = new javax.swing.JPanel();
                jLabel8 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel21 = new javax.swing.JLabel();
                jLabel22 = new javax.swing.JLabel();
                jLabel25 = new javax.swing.JLabel();
                NotesPanel = new javax.swing.JPanel();
                jLabel7 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel23 = new javax.swing.JLabel();
                jLabel24 = new javax.swing.JLabel();
                EspaceEnsPanel = new javax.swing.JPanel();
                jLabel10 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel19 = new javax.swing.JLabel();
                jLabel20 = new javax.swing.JLabel();
                AdministrationBtn = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Accueil");

                bg.setBackground(new java.awt.Color(255, 255, 255));

                GestionBtn.setBackground(new java.awt.Color(204, 0, 51));
                GestionBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                GestionBtn.setForeground(new java.awt.Color(255, 255, 255));
                GestionBtn.setText("Gestionnaire de Donn??es");
                GestionBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                GestionBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                GestionBtnActionPerformed(evt);
                        }
                });

                EspaceEtudPanel.setBackground(new java.awt.Color(255, 255, 255));
                EspaceEtudPanel.setBorder(
                                new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jLabel9.setBackground(new java.awt.Color(255, 255, 255));
                jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(102, 102, 102));
                jLabel9.setText("Espace Etudiants");

                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/graduated.png"))); // NOI18N

                jLabel11.setForeground(java.awt.SystemColor.controlDkShadow);
                jLabel11.setText("Afficher listes Etudiant");

                jLabel12.setForeground(java.awt.SystemColor.controlDkShadow);
                jLabel12.setText("Suivi Absences");

                jLabel13.setForeground(java.awt.SystemColor.controlDkShadow);
                jLabel13.setText("G??rer Etat Absence");

                javax.swing.GroupLayout EspaceEtudPanelLayout = new javax.swing.GroupLayout(EspaceEtudPanel);
                EspaceEtudPanel.setLayout(EspaceEtudPanelLayout);
                EspaceEtudPanelLayout.setHorizontalGroup(
                                EspaceEtudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(EspaceEtudPanelLayout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(EspaceEtudPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jLabel9,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                129,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel11,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel12,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel13,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                EspaceEtudPanelLayout.setVerticalGroup(
                                EspaceEtudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(EspaceEtudPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(EspaceEtudPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(EspaceEtudPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel9)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel11,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                16,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel12,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                16,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jLabel5))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel13,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                16,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(25, Short.MAX_VALUE)));

                CalendrierPanel.setBackground(new java.awt.Color(255, 255, 255));
                CalendrierPanel.setBorder(
                                new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(102, 102, 102));
                jLabel8.setText("Calendrier");

                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/schedule.png"))); // NOI18N

                jLabel21.setForeground(java.awt.SystemColor.controlDkShadow);
                jLabel21.setText("Plannifier une sc??ance");

                jLabel22.setForeground(java.awt.SystemColor.controlDkShadow);
                jLabel22.setText("Epreuves et Examen");

                jLabel25.setForeground(java.awt.SystemColor.controlDkShadow);
                jLabel25.setText("Emploi de Temps");

                javax.swing.GroupLayout CalendrierPanelLayout = new javax.swing.GroupLayout(CalendrierPanel);
                CalendrierPanel.setLayout(CalendrierPanelLayout);
                CalendrierPanelLayout.setHorizontalGroup(
                                CalendrierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(CalendrierPanelLayout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(CalendrierPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(CalendrierPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(CalendrierPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                88,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel25)
                                                                                                                .addComponent(jLabel22))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                37,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jLabel21))
                                                                .addContainerGap(45, Short.MAX_VALUE)));
                CalendrierPanelLayout.setVerticalGroup(
                                CalendrierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(CalendrierPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(CalendrierPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel4)
                                                                                .addGroup(CalendrierPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel8)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel21)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel25)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(CalendrierPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel22)
                                                                                                                .addComponent(jLabel3))))
                                                                .addContainerGap(31, Short.MAX_VALUE)));

                NotesPanel.setBackground(new java.awt.Color(255, 255, 255));
                NotesPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(102, 102, 102));
                jLabel7.setText("Notes et Resultats");

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/grade.png"))); // NOI18N

                jLabel23.setForeground(java.awt.SystemColor.controlDkShadow);
                jLabel23.setText("Saisir Notes");

                jLabel24.setForeground(java.awt.SystemColor.controlDkShadow);
                jLabel24.setText("G??nerer PV");

                javax.swing.GroupLayout NotesPanelLayout = new javax.swing.GroupLayout(NotesPanel);
                NotesPanel.setLayout(NotesPanelLayout);
                NotesPanelLayout.setHorizontalGroup(
                                NotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NotesPanelLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(NotesPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(NotesPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                127,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                37,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jLabel23)
                                                                                .addComponent(jLabel24))
                                                                .addContainerGap(28, Short.MAX_VALUE)));
                NotesPanelLayout.setVerticalGroup(
                                NotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(NotesPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(NotesPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(jLabel2)
                                                                                .addGroup(NotesPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                17,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel23)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel24)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                EspaceEnsPanel.setBackground(new java.awt.Color(255, 255, 255));
                EspaceEnsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(102, 102, 102));
                jLabel10.setText("Espace Enseignant");

                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/female.png"))); // NOI18N

                jLabel19.setForeground(java.awt.SystemColor.controlDkShadow);
                jLabel19.setText("Afficher Enseignant");

                jLabel20.setForeground(java.awt.SystemColor.controlDkShadow);
                jLabel20.setText("Afficher Cours et Mati??res");

                javax.swing.GroupLayout EspaceEnsPanelLayout = new javax.swing.GroupLayout(EspaceEnsPanel);
                EspaceEnsPanel.setLayout(EspaceEnsPanelLayout);
                EspaceEnsPanelLayout.setHorizontalGroup(
                                EspaceEnsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(EspaceEnsPanelLayout.createSequentialGroup()
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(EspaceEnsPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel19)
                                                                                .addComponent(jLabel20)
                                                                                .addComponent(jLabel10,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                125,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                EspaceEnsPanelLayout.setVerticalGroup(
                                EspaceEnsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(EspaceEnsPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(EspaceEnsPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(EspaceEnsPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel10,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                24,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel19)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel20))
                                                                                .addComponent(jLabel6))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                AdministrationBtn.setBackground(new java.awt.Color(204, 0, 51));
                AdministrationBtn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
                AdministrationBtn.setForeground(new java.awt.Color(255, 255, 255));
                AdministrationBtn.setText("Administration");
                AdministrationBtn.setBorder(
                                new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                AdministrationBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                AdministrationBtnActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
                bg.setLayout(bgLayout);
                bgLayout.setHorizontalGroup(
                                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(bgLayout.createSequentialGroup()
                                                                .addGap(135, 135, 135)
                                                                .addGroup(bgLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(GestionBtn,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                152,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(bgLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(bgLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                false)
                                                                                                                .addComponent(CalendrierPanel,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(EspaceEtudPanel,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(bgLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(EspaceEnsPanel,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(NotesPanel,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))))
                                                                .addContainerGap(98, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(AdministrationBtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                198,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(294, 294, 294)));
                bgLayout.setVerticalGroup(
                                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(bgLayout.createSequentialGroup()
                                                                .addGap(97, 97, 97)
                                                                .addComponent(GestionBtn)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(bgLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(EspaceEnsPanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(EspaceEtudPanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(bgLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(NotesPanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(CalendrierPanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(83, 83, 83)
                                                                .addComponent(AdministrationBtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                41,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(88, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void GestionBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_GestionBtnActionPerformed
                // TODO add your handling code here:
                this.dispose();
                new GestionDonneeFrame().setVisible(true);
        }// GEN-LAST:event_GestionBtnActionPerformed

        private void AdministrationBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_AdministrationBtnActionPerformed
                // TODO add your handling code here:
                this.dispose();
                new AdminDashboard().setVisible(true);
        }// GEN-LAST:event_AdministrationBtnActionPerformed

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
                        java.util.logging.Logger.getLogger(AdminHomeFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(AdminHomeFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(AdminHomeFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(AdminHomeFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                AdminHomeFrame frame = new AdminHomeFrame();
                                WindowListener listener = new WindowAdapter() {
                                        public void windowClosing(WindowEvent evt) {
                                                Frame frame = (Frame) evt.getSource();
                                                System.out.println("Closing = " + frame.getTitle());
                                                DBConnection.closeConnection();
                                                DBConnection.resetConnection();
                                        }
                                };
                                frame.addWindowListener(listener);
                                frame.setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton AdministrationBtn;
        private javax.swing.JPanel CalendrierPanel;
        private javax.swing.JPanel EspaceEnsPanel;
        private javax.swing.JPanel EspaceEtudPanel;
        private javax.swing.JButton GestionBtn;
        private javax.swing.JPanel NotesPanel;
        private javax.swing.JPanel bg;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel24;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        // End of variables declaration//GEN-END:variables
}
