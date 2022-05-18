package LoginMainGerer;

import java.sql.*;
import java.util.*;
import com.password4j.Password;
import com.password4j.Hash;

public class Utilisateur extends Personne {
    // utilisateur has mdp and role
    private String mdp;
    private String role;

    // constructor
    public Utilisateur(int ID, String nom, String prenom, String email, int CIN, String tel, String mdp, String role) {
        super(ID, nom, prenom, email, CIN, tel);
        this.mdp = mdp;
        this.role = role;
    }

    // constructor without CIN and tel
    public Utilisateur(int ID, String nom, String prenom, String email, String mdp, String role) {
        super(ID, nom, prenom, email, -1, "");
        this.mdp = mdp;
        this.role = role;
    }

    // constructor without param
    public Utilisateur() {
        super(-1, "", "", "", -1, "");
        this.mdp = "";
        this.role = "";
    }

    // getters and setters
    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void generateandSetMdp() {
        this.mdp = String.valueOf(PasswordGenerator.generatePassword(8));
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // constructor without mdp
    public Utilisateur(int ID, String nom, String prenom, String email, int CIN, String tel, String role) {
        super(ID, nom, prenom, email, CIN, tel);
        this.role = role;

        System.out.println("mdp generated: " + this.mdp);
    }
    // constructor without mdp and CIN and tel and ID

    public Utilisateur(String nom, String prenom, String email, String role) {
        super(-1, nom, prenom, email, -1, "");

        this.role = role;
        // System.out.println(this.generatePassword(8));

        this.mdp = String.valueOf(PasswordGenerator.generatePassword(8));
        System.out.println("mdp generated: " + this.mdp);
    }

    // Constructor without mpd and ID
    public Utilisateur(String nom, String prenom, String email, int CIN, String tel, String role) {
        super(-1, nom, prenom, email, CIN, tel);
        this.role = role;
        this.mdp = String.valueOf(PasswordGenerator.generatePassword(8));
        // System.out.println("mdp generated: " + this.mdp);
    }

    // toString
    @Override
    public String toString() {
        return "Utilisateur{" + "ID=" + getID() + ", nom=" + getNom() + ", prenom=" + getPrenom() + ", email="
                + getEmail()
                + ", CIN=" + getCIN() + ", tel=" + getTel() + ", mdp=" + getMdp() + ", role=" + getRole() + '}';
    }

    // password generator

    @Override
    public List<Object> findAll() {
        // search for all utilisateurs
        String query = "SELECT * FROM utilisateur join personne on utilisateur.IDUtilisateur = personne.IDP";
        List<Object> utilisateurs = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                utilisateurs.add(new Utilisateur(resultSet.getInt("IDUtilisateur"), resultSet.getString("nom"),
                        resultSet.getString("prenom"), resultSet.getString("email"), resultSet.getInt("CIN"),
                        resultSet.getString("tel"), resultSet.getString("mdp"), resultSet.getString("role")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return utilisateurs;
    }

    @Override
    public int create() {
        // object is a new utilisateur
        int id = 0;
        id = super.create();
        System.out.println("id of the new utilisateur: " + id);
        // if (findByMdp() > 0) {
        // return 0;
        // }
        if (id != 0) {

            String query = "INSERT INTO utilisateur (IDUtilisateur, mdp, role) VALUES (?, ?, ?)";
            try {
                PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
                preparedStatement.setInt(1, id);
                Hash hash = Password.hash(getMdp()).withArgon2();
                preparedStatement.setString(2, hash.getResult());
                preparedStatement.setString(3, getRole());
                System.out.println(preparedStatement);
                preparedStatement.executeUpdate();
                // EmailSender.sendEmail(this);
            } catch (SQLException e) {
                e.printStackTrace();
                return -1;
            }
            return id;

        } else {
            return -2;
        }

    }

    public void readByEmail() {
        super.readByEmail();
        // search for utilisateur by email in database
        String query = "SELECT * FROM v_utilisateurs WHERE email = ?";
        try {
            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
            preparedStatement.setString(1, getEmail());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                setMdp(resultSet.getString("mdp"));
                setRole(resultSet.getString("role"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        String query = "SELECT * FROM utilisateur join personne on (IDP= IDUtilisateur)  WHERE IDUtilisateur = ?";
        try {
            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, getID());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                setNom(resultSet.getString("nom"));
                setPrenom(resultSet.getString("prenom"));
                setEmail(resultSet.getString("email"));
                setCIN(resultSet.getInt("CIN"));
                setTel(resultSet.getString("tel"));
                setMdp(resultSet.getString("mdp"));
                setRole(resultSet.getString("role"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    // test generate password in main

    public static void main(String[] args) {
        // Utilisateur utilisateur = new Utilisateur();
        Utilisateur khalil = new Utilisateur("Khalil", "Bessaad", "k.bessaad19019@pi.tn", "Administrateur");
        System.out.println(khalil.toString());
    }
}
