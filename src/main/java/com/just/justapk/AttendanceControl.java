package com.just.justapk;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class AttendanceControl {
    public PieChart piechart;
    @FXML
    private ImageView image;
    @FXML
    private TextField student;
    @FXML
    private Label name;

    // visible image
    public  void visiblityImage(){
        image.setVisible(false);
    }

    public void load(ActionEvent event){
        if (student.getText().equals(""))
            errorMessage("Plz Provide The Student ID\nYou Want To Know His Attendance");
        else if(student.getText().toUpperCase().equals("C128")){
            visiblityImage();
            Atten_info.C128(piechart);
            name.setText("Abdulrahman Haaji");

        }
        else if(student.getText().toUpperCase().equals("C126")){
            visiblityImage();
            Atten_info.C126(piechart);
            name.setText("Farah Ali");

        } else if(student.getText().toUpperCase().equals("C129")){
            visiblityImage();
            Atten_info.C129(piechart);
            name.setText("Abdihakim");

        }else if(student.getText().toUpperCase().equals("C125")){
            visiblityImage();
            Atten_info.C125(piechart);
            name.setText("Kaafi");

        }else if(student.getText().toUpperCase().equals("C130")){
            visiblityImage();
            Atten_info.C130(piechart);
            name.setText("Farhia");

        }else if(student.getText().toUpperCase().equals("C135")){
            visiblityImage();
            Atten_info.C135(piechart);
            name.setText("Abdirahman");

        }else if(student.getText().toUpperCase().equals("C136")){
            visiblityImage();
            Atten_info.C136(piechart);
            name.setText("Anab Mohamed");

        }else if(student.getText().toUpperCase().equals("C149")){
            visiblityImage();
            Atten_info.C149(piechart);
            name.setText("Mohamed Ali");

        }else if(student.getText().toUpperCase().equals("C150")){
            visiblityImage();
            Atten_info.C150(piechart);
            name.setText("Raxma Hasan");

        }
        else
            errorMessage("This is ID is Not exist\nProvide Valid ID");
    }


    // error handles
    public  void errorMessage(String message){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("Error");
        alert.setHeaderText("Input error");
        alert.setContentText(message);
        alert.showAndWait();
    }

}
