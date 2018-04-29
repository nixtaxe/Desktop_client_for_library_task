package controllers;

public enum Scenes {
    START_PAGE("/gui/StartPage.fxml"),
    SIGN_UP_PAGE("/gui/SignUpPage.fxml");

    private String fxml;

    Scenes(String fxml) {
        this.fxml = fxml;
    }
    
    public String getFxml() {
        return fxml;
    }
}
