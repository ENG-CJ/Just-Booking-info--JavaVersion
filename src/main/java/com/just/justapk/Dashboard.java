package com.just.justapk;

import  java.io.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Dashboard extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        String image_path="C:\\\\Users\\\\PC\\\\IdeaProjects\\\\demo\\\\JavaFx\\\\JUSTApk\\\\src\\\\main\\\\resources\\\\com\\\\just\\\\justapk\\\\images\\\\JAM.ico\\\\";
        Image icon=new Image(image_path);
        Parent root= FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.setTitle("Dashboard | JUST INFO SYSTEM UI");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
