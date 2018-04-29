package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class StageManager {
    public static void setStage(Stage stage, String fxml) {
        try {
            AnchorPane root = FXMLLoader.load(StageManager.class.getResource(fxml));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
