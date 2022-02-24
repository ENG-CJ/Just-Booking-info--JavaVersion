package com.just.justapk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CreatePage extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("createPage.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Create Account");
        stage.centerOnScreen();
        stage.show();
    }


    public static void main(String[] args) {
        Application.launch();
    }
}
