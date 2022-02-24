package com.just.justapk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Attendance extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("attendance.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("ATTENDANCE SEARCHER");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
