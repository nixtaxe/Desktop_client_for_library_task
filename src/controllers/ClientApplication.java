package controllers;

import javafx.application.Application;
import javafx.stage.Stage;

public class ClientApplication extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        StartPage startPage = new StartPage();
        startPage.load();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
