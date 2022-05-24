
package LoginMainGerer;

//import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

import com.password4j.Password;
import com.password4j.Hash;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Bienvenu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EmailInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PasswordInput = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        seConnecter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionnaire Scolarité");

        bg.setBackground(java.awt.SystemColor.controlHighlight);

        Bienvenu.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        Bienvenu.setText("Bienvenue !");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Email");

        EmailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailInputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("Password");

        PasswordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordInputActionPerformed(evt);
            }
        });

        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        seConnecter.setBackground(new java.awt.Color(255, 0, 51));
        seConnecter.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        seConnecter.setForeground(new java.awt.Color(255, 255, 255));
        seConnecter.setText("Se Connecter");
        seConnecter.setMaximumSize(new java.awt.Dimension(120, 36));
        seConnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seConnecterActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Logo-Pi (2).png"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGap(0, 25, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(21, 21, 21))
                        .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGap(82, 82, 82)
                                                .addGroup(bgLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(showPassword)
                                                        .addGroup(bgLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(EmailInput,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 206,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel2)
                                                                .addComponent(jLabel3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(PasswordInput,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 206,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(seConnecter,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 206,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addComponent(Bienvenu)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(Bienvenu)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showPassword)
                                .addGap(35, 35, 35)
                                .addComponent(seConnecter, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EmailInputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_EmailInputActionPerformed

    private void PasswordInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PasswordInputActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_PasswordInputActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            PasswordInput.setEchoChar((char) 0);
        } else {
            PasswordInput.setEchoChar('*');
        }
    }// GEN-LAST:event_showPasswordActionPerformed

    private void seConnecterActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_seConnecterActionPerformed
        // TODO add your handling code here:
        Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern
                .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        String email = EmailInput.getText();
        String password = PasswordInput.getText();
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if (email.isEmpty() || password.isEmpty()) {// if the user didn't fill the email or password
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
        } else if (!matcher.find()) {// if the email is not valid
            JOptionPane.showMessageDialog(null, "Veuillez entrer un email valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // Connection con =
                // DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root",
                // "");
                Connection connection = DBConnection.getConnection();
                String sql = "SELECT * FROM v_utilisateurs WHERE email = ?";
                PreparedStatement statement = connection.prepareStatement(sql);// using prepared statement to prevent
                                                                               // sql injection
                statement.setString(1, email);
                ResultSet rs = statement.executeQuery();
                if (rs.next()) {
                    if (Password.check(password, rs.getString("mdp")).withArgon2()) { // check the password against
                                                                                      // the hash in the database
                        JOptionPane.showMessageDialog(null, "Bienvenue " + rs.getString("nom") + " "
                                + rs.getString("prenom"), "Bienvenue", JOptionPane.INFORMATION_MESSAGE);
                        Utilisateur userr = new Utilisateur(rs.getString("nom"), rs.getString("prenom"),
                                rs.getString("email"), rs.getString("mdp"));
                        userr.setRole(rs.getString("role"));
                        DBConnection.setUserr(userr);
                        this.dispose();
                        // new Home(rs.getString("nom"), rs.getString("prenom"), rs.getString("email"),
                        // rs.getString("password")).setVisible(true);
                        // TO DO : add the user to the session and redirect him to the home page
                        // accourding to his role
                        Utilisateur user = new Utilisateur();
                        user.setEmail(rs.getString("email"));
                        user.readByEmail();
                        if (user.getRole().equals("Administrateur")) {
                            new AdminHomeFrame()
                                    .setVisible(true);
                        } else {
                            new ChefHomeFrame().setVisible(true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Mot de passe incorrect", "Erreur",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Email incorrect", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);// in case of an error
            }
        }

    }// GEN-LAST:event_seConnecterActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenu;
    private javax.swing.JTextField EmailInput;
    private javax.swing.JPasswordField PasswordInput;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton seConnecter;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JOptionPane JOptionPane;
    // End of variables declaration//GEN-END:variables

    // private static class password {

    // private static void setEchoChar(char c) {
    // throw new UnsupportedOperationException("Not supported yet."); // Generated
    // from
    // // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    // }

    // public password() {
    // }
    // }

    // private static class showPassowrd {

    // private static boolean isSelected() {
    // throw new UnsupportedOperationException("Not supported yet."); // Generated
    // from
    // // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    // }

    // public showPassowrd() {
    // }
    // }
}
