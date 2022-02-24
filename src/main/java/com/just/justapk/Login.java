package com.just.justapk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {

    private CreateControll createControll;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("JAMHUURIYA UNIEVRSITY | LOGIN");
        stage.centerOnScreen();
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
