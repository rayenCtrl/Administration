package LoginMainGerer;

import java.util.*;
import java.sql.*;

public abstract class Personne implements CRUD {
    private int ID;
    private String nom;
    private String prenom;
    private String email;
    private int CIN;
    private String tel;

    public Personne(int ID, String nom, String prenom, String email, int CIN, String tel) {
        this.ID = ID;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.CIN = CIN;
        this.tel = tel;
    }

    public Personne() {
        this.ID = -1;
        this.nom = "";
        this.prenom = "";
        this.email = "";
        this.CIN = -1;
        this.tel = "";

    }

    // getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCIN() {
        return CIN;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public int create() {
        // object is a new personne

        // check if the personne already exists
        if (find() >= 0) {

            return -1;
        }
        if (findByEmail() >= 0) {
            return -2;
        }
        if (findByTel() >= 0)
            return -3;

        // else add the personne to the database and return its id from database.
        String query = "INSERT INTO personne (nom, prenom, email, CIN, tel) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query,
                    Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, getNom());
            preparedStatement.setString(2, getPrenom());
            preparedStatement.setString(3, getEmail());
            preparedStatement.setInt(4, getCIN());
            preparedStatement.setString(5, getTel());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                return resultSet.getInt(1);
            } else {
                return -4;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -5;
        }
    }

    public int findByEmail() {
        // object is a personne

        // find personne's email in the database if found return the id
        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT id FROM personne WHERE email = '" + getEmail() + "'";
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                return resultSet.getInt("id");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -2;
        }
    }

    public int findByTel() {
        // object is a personne

        // find personne's tel in the database if found return the id
        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT id FROM personne WHERE tel = '" + getTel() + "'";
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                return resultSet.getInt("id");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -2;
        }
    }

    public int findByCIN() {
        // object is a personne

        // find personne's CIN in the database if found return the id
        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT id FROM personne WHERE cin = '" + getCIN() + "'";
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                return resultSet.getInt("id");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -2;
        }
    }

    @Override
    public int find() {
        // object is a personne

        // find personne's id in the database if found return the id
        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT id FROM personne WHERE id = '" + getID() + "'";
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                return resultSet.getInt("id");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -2;
        }
    }

    @Override
    public void update(Object object) {
        // object is a personne
        // prepare information to update
        Personne personne = (Personne) object;

        // if email is changed, check if the email already exists
        if (!getEmail().equals(personne.getEmail())) {
            if (findByEmail() >= 0) {
                return;
            }
        }
        // if tel is changed, check if the tel already exists
        if (!getTel().equals(personne.getTel())) {
            if (findByTel() >= 0) {
                return;
            }
        }
        // if CIN is changed, check if the CIN already exists
        if (!(getCIN() == personne.getCIN())) {
            if (findByCIN() >= 0) {
                return;
            }
        }
        // update the personne in the database
        String query = "UPDATE personne SET nom = ?, prenom = ?, email = ?, cin = ?, tel = ? WHERE id = ?";
        try {
            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
            preparedStatement.setString(1, personne.getNom());
            preparedStatement.setString(2, personne.getPrenom());
            preparedStatement.setString(3, personne.getEmail());
            preparedStatement.setInt(4, personne.getCIN());
            preparedStatement.setString(5, personne.getTel());
            preparedStatement.setInt(6, personne.getID());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete() {
        // object is a personne
        // delete the personne from the database
        String query = "DELETE FROM personne WHERE id = ?";
        try {
            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, getID());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // @Override
    // public List<Object> findAll() {
    // // object is a personne
    // // find all personnes in the database and return them
    // List<Object> personnes = new ArrayList<>();
    // try {
    // Connection connection = DBConnection.getConnection();
    // Statement statement = connection.createStatement();
    // String query = "SELECT * FROM personne";
    // ResultSet resultSet = statement.executeQuery(query);
    // while (resultSet.next()) {
    // Personne personne = new Personne();
    // personne.setID(resultSet.getInt("id"));
    // personne.setNom(resultSet.getString("nom"));
    // personne.setPrenom(resultSet.getString("prenom"));
    // personne.setEmail(resultSet.getString("email"));
    // personne.setCIN(resultSet.getInt("cin"));
    // personne.setTel(resultSet.getString("tel"));
    // personnes.add(personne);
    // }
    // } catch (SQLException e) {
    // e.printStackTrace();
    // }
    // return personnes;
    // }

    public void readByEmail() {
        // object is a personne
        // find personne's email in the database and return it
        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM personne WHERE email = '" + getEmail() + "'";
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                setID(resultSet.getInt("idp"));
                setNom(resultSet.getString("nom"));
                setPrenom(resultSet.getString("prenom"));
                setEmail(resultSet.getString("email"));
                setCIN(resultSet.getInt("cin"));
                setTel(resultSet.getString("tel"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
