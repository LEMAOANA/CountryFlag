package com.example.countryflag;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label countryname;

    @FXML
    void MalawiOnAction(ActionEvent event) throws IOException {
        countryname.setText("MALAWI FLAG");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Malawi.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 240, 130);
        stage.setTitle("MALAWI");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void MaliOnAction(ActionEvent event) throws IOException {
        countryname.setText("MALI FLAG");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Mali.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 240, 130);
        stage.setTitle("MALI");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void SudanOnaction(ActionEvent event) throws IOException {
        countryname.setText("SUDAN FLAG");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sudan.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 240, 130);
        stage.setTitle("SUDAN");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ZambiaOnAction(ActionEvent event) throws IOException {
        countryname.setText("ZAMBIA FLAG");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Zambia.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 240, 130);
        stage.setTitle("ZAMBIA");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ZinmweOnAction(ActionEvent event) throws IOException {
        countryname.setText("ZIMBABWE FLAG");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Zimbabwe.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 240, 130);
        stage.setTitle("Zimbabwe");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void lesothoOnAction(ActionEvent event) throws IOException {
        countryname.setText("LESOTHO FLAG");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LesthoFlag.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 240, 130);
        stage.setTitle("LESOTHO");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void ClearOnAction(ActionEvent event) {
        countryname.setText("");
    }

    @FXML
    void ExitOnAction(ActionEvent event) {
     Alert warnin = new Alert(Alert.AlertType.CONFIRMATION, "Exit",ButtonType.YES,ButtonType.NO);
     warnin.setContentText("Are you sure you want to Exit");
     warnin.showAndWait();
     if (warnin.getResult() == ButtonType.YES){
         Platform.exit();
     }
    }


}
