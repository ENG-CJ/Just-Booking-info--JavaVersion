package com.just.justapk;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginControll implements Initializable {
    public Button create;
    public Button login;
    public TextField username;
    public PasswordField passcode;


    public String user;
    public String password;

    // stages
    Parent root;
    Scene scene;
    Stage stage;

    public CreateControll createControll;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        user="just";
        password="3344";
    }

//     function login
    public void Login(ActionEvent event)throws  IOException{
        if (username.getText().equals("") || passcode.getText().equals(""))
            error();
        else  if (Evaluate(username.getText(),user,passcode.getText(),password)){
            stage=(Stage) login.getScene().getWindow();
            stage.close();


            root=FXMLLoader.load(getClass().getResource("dashboard.fxml"));
            scene=new Scene(root);
            stage.setScene(scene);
//            stage.centerOnScreen();
            stage.show();
        }
        else {

            ErrorMessage();
        }
    }

    // blank error handle
    public void  error(){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setTitle("JAMHUURIYA");
        alert.setHeaderText("Input Error.");
        alert.setContentText("All Fields Are Required.");
        alert.showAndWait();
    }
    // wrong credentials handle
    public void  ErrorMessage(){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setTitle("JAMHUURIYA");
        alert.setHeaderText("Credential Error.");
        alert.setContentText("Incorrect Username Or Password.");
        alert.showAndWait();
    }


    // evaluation handle
    public  boolean Evaluate(String username, String user, String passcode, String password){
        return username.equals(user) && passcode.equals(password);
    }



    // create button
    public  void  CreateAccount(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("createPage.fxml"));
        scene=new Scene(root);
        stage=(Stage) create.getScene().getWindow();
        stage.setTitle("Create Account");
        stage.setScene(scene);
        stage.centerOnScreen();

        stage.show();

    }

}
