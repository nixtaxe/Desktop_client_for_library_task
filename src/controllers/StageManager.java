package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;

public class StageManager {
    public static void setStage(Stage stage, String fxml) {
        try {
            AnchorPane root = FXMLLoader.load(StageManager.class.getResource(fxml));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "An exception occured",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
