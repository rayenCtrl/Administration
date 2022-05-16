package LoginMainGerer;

import java.sql.*;
import java.util.*;

public class Etudiant extends Personne {
    private int numInsc;

    public Etudiant(int ID, String nom, String prenom, String email, int CIN, String tel, int numInsc) {
        super(ID, nom, prenom, email, CIN, tel);
        this.numInsc = numInsc;
    }

    // constructor without parameters
    public Etudiant() {
        super();
        this.numInsc = -1;
    }

    // getters and setters
    public int getNum_insc() {
        return numInsc;
    }

    // public void setId(int id) {
    // super.setID(id);
    // }

    public void setNum_insc(int numInsc) {
        this.numInsc = numInsc;
    }

    @Override
    public int create() {
        // object is a new personne

        int id = 0;
        id = super.create();
        if (findByNum_insc() > 0) {
            return 0;
        }
        if (id != 0) {

            String query = "INSERT INTO étudiant (IDÉtudiant, numInsc) VALUES (?, ?)";
            try {
                PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
                preparedStatement.setInt(1, id);
                preparedStatement.setInt(2, getNum_insc());
                preparedStatement.executeUpdate();
                setID(id);
            } catch (SQLException e) {
                e.printStackTrace();
                return -1;
            }
            return id;

        } else {
            return -2;
        }

    }

    public int findByNum_insc() {
        // search for etudiant by his numInsc
        String query = "SELECT * FROM étudiant WHERE numInsc = ?";
        try {
            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, getNum_insc());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("IDÉtudiant");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -2;
        }

    }

    @Override
    // public int update(Object object) {
    // // object is an etudiant
    // // if numInsc is changed, check if the new numInsc is already used

    // Etudiant etudiant = (Etudiant) object;
    // // System.out.println(getNum_insc());
    // // System.out.println(etudiant.getNum_insc());
    // if (etudiant.getNum_insc() != getNum_insc()) {
    // if (etudiant.findByNum_insc() > 0) {
    // return -1;
    // }
    // }
    // // return super.update(etudiant);
    // String query = "UPDATE étudiant SET numInsc = ? WHERE IDÉtudiant = ?";
    // System.out.println(etudiant.getNum_insc());
    // System.out.println(getID());
    // return 0;
    // // try {
    // // // PreparedStatement preparedStatement =
    // // // DBConnection.getConnection().prepareStatement(query);
    // // // preparedStatement.setInt(1, etudiant.getNum_insc());
    // // // preparedStatement.setInt(2, getID());
    // // // System.out.println(preparedStatement);
    // // System.out.println(etudiant.getNum_insc());
    // // System.out.println(getID());
    // // // preparedStatement.executeQuery();
    // // return etudiant.getID();
    // // } catch () {

    // // e.printStackTrace();
    // // return -2;
    // // }

    // }
    public void update() {
        super.update();
        String query = "UPDATE étudiant SET numInsc = ? WHERE IDÉtudiant = ?";
        try {
            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, getNum_insc());
            preparedStatement.setInt(2, getID());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int find() {
        // object is an etudiant
        // find etudiant's id in the database if found return the id
        String query = "SELECT * FROM étudiant WHERE IDÉtudiant = ?";
        try {
            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, getID());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("IDÉtudiant");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -2;
        }
    }

    @Override
    public void delete() {
        // object is an etudiant
        // delete etudiant from the database
        super.delete();
        // String query = "DELETE FROM étudiant WHERE IDÉtudiant = ?";
        // try {
        // PreparedStatement preparedStatement =
        // DBConnection.getConnection().prepareStatement(query);
        // preparedStatement.setInt(1, getID());
        // preparedStatement.executeUpdate();
        // } catch (SQLException e) {
        // e.printStackTrace();
        // }

    }

    @Override
    public List<Object> findAll() {
        // find all etudiants in the database
        // return a list of etudiants
        List<Object> etudiants = new ArrayList<>();
        String query = "SELECT IDÉtudiant, nom, prenom, cin, tel, email, numInsc FROM étudiant join personne on étudiant.IDÉtudiant = personne.IDP";
        try {
            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Etudiant etudiant = new Etudiant(resultSet.getInt("IDÉtudiant"), resultSet.getString("nom"),
                        resultSet.getString("prenom"), resultSet.getString("email"), resultSet.getInt("CIN"),
                        resultSet.getString("tel"), resultSet.getInt("numInsc"));
                etudiants.add(etudiant);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return etudiants;
    }

    @Override

    public void read() {
        // object is an etudiant
        // read etudiant from the database
        String query = "SELECT * FROM étudiant WHERE IDÉtudiant = ?";
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
                setNum_insc(resultSet.getInt("numInsc"));

            } else {
                return;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return "Etudiant [IDÉtudiant=" + getID() + ", nom=" + getNom() + ", prenom=" + getPrenom() + ", email="
                + getEmail()
                + ", CIN=" + getCIN() + ", tel=" + getTel() + ", numInsc=" + getNum_insc() + "]";
    }

}
