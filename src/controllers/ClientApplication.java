package controllers;

import javafx.application.Application;
import javafx.stage.Stage;

public class ClientApplication extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        StageManager.setStage(primaryStage, Scenes.START_PAGE.getFxml());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
