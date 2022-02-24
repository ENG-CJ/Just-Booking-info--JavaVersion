package com.just.justapk;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//---imports
//end
public class DashboardControl  implements Initializable {
    @FXML
    private ImageView logout;
    @FXML
    private LineChart<?, ?> linechart;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;
    @FXML
    private ImageView attendance;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
     XYChart.Series series=new XYChart.Series<>();

     series.getData().add(new XYChart.Data<>("2012",300));
     series.getData().add(new XYChart.Data<>("2013",1300));
     series.getData().add(new XYChart.Data<>("2014",1400));

        XYChart.Series series2=new XYChart.Series<>();

        series.getData().add(new XYChart.Data<>("2016",1200));
        series.getData().add(new XYChart.Data<>("2017",1290));
        series.getData().add(new XYChart.Data<>("2018",2650));

        XYChart.Series series3=new XYChart.Series<>();

        series.getData().add(new XYChart.Data<>("2019",3900));
        series.getData().add(new XYChart.Data<>("2020",2890));
        series.getData().add(new XYChart.Data<>("2021",3200));



     linechart.getData().addAll(series,series2);
    }

    //logout handler
    public void Logout(MouseEvent event)throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout JIMS");
        alert.setHeaderText("You Gonna Logout");
        alert.setContentText("Do You Want to Logout?");
        if(alert.showAndWait().get()==ButtonType.OK){
            Stage stage= (Stage) logout.getScene().getWindow();
            stage.close();

            Parent root= FXMLLoader.load(getClass().getResource("login.fxml"));
            stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.show();

        }

    }

    public void attendanceSearch(MouseEvent event)throws IOException{
        Stage stage=(Stage) attendance.getScene().getWindow();
        stage.close();
        Parent root=FXMLLoader.load(getClass().getResource("attendance.fxml"));
        Scene scene=new Scene(root);
        stage= new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Attendance Searcher");
        stage.show();
    }

}
