package sn.ucad.esp.glsi.tp14;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Contrôleur associé à vue.fxml
 */
public class PrimaryController {

    @FXML
    private Label statusLabel;

    @FXML
    private void testerConnexion() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT COUNT(*) AS total FROM information";
            try (PreparedStatement ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt("total");
                    statusLabel.setText("Connexion MySQL réussie ! (" + count + " messages dans tp13.information)");
                }
            }
        } catch (SQLException e) {
            statusLabel.setText("Erreur de connexion : " + e.getMessage());
        }
    }
}
