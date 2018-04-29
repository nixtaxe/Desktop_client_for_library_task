package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Add this to javadoc pls
 */

//TODO: create parent controller

public class SignUpPage {
    @FXML
    private void loadStartPage(ActionEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        StageManager.setStage(stage, "/gui/StartPage.fxml");
    }

    @FXML
    private void signUp(ActionEvent event) {
        //TODO: create a query and send it to server
    }

}
