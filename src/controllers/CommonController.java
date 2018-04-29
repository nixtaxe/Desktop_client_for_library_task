package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

public class CommonController {

    @FXML
    private void loadStartPage(ActionEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        StageManager.setStage(stage, Scenes.START_PAGE.getFxml());
    }

    @FXML
    private void loadSignUpPage(ActionEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        StageManager.setStage(stage, Scenes.SIGN_UP_PAGE.getFxml());
    }
}
