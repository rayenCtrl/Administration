package LoginMainGerer;

import java.sql.*;
import java.util.*;

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
        this.mdp = generatePassword(8).toString();
    }

    // password generator
    private static char[] generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for (int i = 4; i < length; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }

    @Override
    public List<Object> findAll() {
        // search for all utilisateurs
        String query = "SELECT * FROM utilisateur";
        List<Object> utilisateurs = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                utilisateurs.add(new Utilisateur(resultSet.getInt("id"), resultSet.getString("nom"),
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
        // if (findByMdp() > 0) {
        // return 0;
        // }
        if (id != 0) {

            String query = "INSERT INTO utilisateur (id, mdp, role) VALUES (?, ?, ?)";
            try {
                PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, getMdp());
                preparedStatement.setString(3, getRole());
                preparedStatement.executeUpdate();
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
    }
}
