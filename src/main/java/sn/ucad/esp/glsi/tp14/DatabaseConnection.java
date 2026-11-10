package sn.ucad.esp.glsi.tp14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe utilitaire de connexion JDBC à la base de données MySQL tp13
 */
public class DatabaseConnection {

    public static final String SERVER = "localhost";
    public static final String PORT = "3306";
    public static final String DATABASE = "tp13";
    public static final String USER = "esp";
    public static final String PASSWORD = "MotDePasse#2026";
    public static final String URL = "jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE;

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection connection = getConnection()) {
            System.out.println("Connexion établie avec succès à : " + URL);
            String sql = "SELECT id, message FROM information";
            try (PreparedStatement ps = connection.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {
                System.out.println("Contenu de la table tp13.information :");
                while (rs.next()) {
                    System.out.println(" - [" + rs.getInt("id") + "] " + rs.getString("message"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Erreur JDBC : " + e.getMessage());
        }
    }
}
