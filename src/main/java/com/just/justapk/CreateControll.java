package com.just.justapk;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Objects;

public class CreateControll {
    public TextField name;
    public DatePicker date;
    public TextField email;
    public PasswordField pass;
    public PasswordField confirm;
    public Button create;
    public ImageView back;
    Parent root;
    Scene scene;
    Stage stage;
    String username;



    // Create Button Handler
    public  void CreateAccount(ActionEvent event) throws IOException {
        File file= new File("users.txt");
//        LocalDate Date=date.getValue();
        if (Evaluate(name.getText(), date.getValue(),email.getText(),pass.getText(),confirm.getText()))
            error();
        else if(emailValidator(email.getText()))
            ErrorMessage("You Provides Incorrect Email\nPlz Provide Valid Email.");
        else  if(Evaluate(pass.getText(),confirm.getText()))
            ErrorMessage();
        else {

            stage=(Stage) create.getScene().getWindow();
            stage.close();
            root=FXMLLoader.load(getClass().getResource("login.fxml"));
            scene=new Scene(root);
            stage.setScene(scene);
            stage.setTitle("JAMHUURIYA UNIEVRSITY | LOGIN");
            stage.show();
        }

    }

    // Back Button
    public  void BackToTheLogin(MouseEvent event)throws IOException {
        try {
            stage=(Stage) back.getScene().getWindow();
            stage.close();
           root =FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene=new Scene(root);
            stage= new Stage();
            stage.setScene(scene);
            stage.setTitle("JAMHUURIYA UNIEVRSITY | LOGIN");
            stage.centerOnScreen();
            stage.setResizable(false);
            stage.show();
        }catch (Exception err){
            System.out.println(err.getMessage());
        }

    }




    // error handles//
    //-----------------

    // blank error handle
    public void  error(){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setTitle("JAMHUURIYA");
        alert.setHeaderText("Input Error.");
        alert.setContentText("All Fields Are Required.");
        alert.showAndWait();
    }
    // Matching error
    public void  ErrorMessage(){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setTitle("JAMHUURIYA");
        alert.setHeaderText("Matching Error.");
        alert.setContentText("Confirm Password Must Be Match The Password.");
        alert.showAndWait();
    }

    // email Message
    public void  ErrorMessage(String message){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setTitle("JAMHUURIYA");
        alert.setHeaderText("Email Validation Error.");
        alert.setContentText(message);
        alert.showAndWait();
    }


    // evaluation handle
    public  boolean Evaluate(String password ,String confirm){
        return !Objects.equals(password,confirm);
    }
    public  boolean Evaluate(String name,LocalDate Date, String Email, String password,String confirm){
        return name.equals("") ||
                Date==null||
                Email.equals("") ||
                password.equals("")||
                confirm.equals("");
    }


    // email validato
    public  boolean emailValidator(String email){
        return !email.endsWith("@gmail.com");
    }
    public String nameAccess(){
        return  this.name.getText();
    }
}
